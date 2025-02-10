package org.example.tasks.inno.collections.task_1;



import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Statistics {
    private int totalTraffic = 0;
    private LocalDateTime minTime = null;
    private LocalDateTime maxTime = null;
    private final Map<String, Integer> osCounts = new HashMap<>(); // Подсчёт ОС
    private final Set<String> existingPages = new HashSet<>(); // Список страниц с кодом 200
    private int totalEntries = 0;


    public void addEntry(LogEntry entry) {
        totalTraffic += entry.getResponseSize();
        totalEntries++;

        if (minTime == null || entry.getDateTime().isBefore(minTime)) {
            minTime = entry.getDateTime();
        }
        if (maxTime == null || entry.getDateTime().isAfter(maxTime)) {
            maxTime = entry.getDateTime();
        }

        if (entry.getResponseCode() == 200) {
            existingPages.add(entry.getRequestPath());
        }

        String os = entry.getUserAgent().getOs();
        osCounts.put(os, osCounts.getOrDefault(os, 0) + 1);
    }

    public double getTrafficRate() {
        if (minTime == null || maxTime == null || minTime.equals(maxTime)) {
            return 0;
        }
        long hours = java.time.Duration.between(minTime, maxTime).toHours();
        return (hours > 0) ? (double) totalTraffic / hours : totalTraffic;
    }

    public Set<String> getExistingPages() {
        return existingPages;
    }

    public Map<String, Double> getOsStatistics() {
        Map<String, Double> osStats = new HashMap<>();
        for (Map.Entry<String, Integer> entry : osCounts.entrySet()) {
            osStats.put(entry.getKey(), (double) entry.getValue() / totalEntries);
        }
        return osStats;
    }
}


/*
package org.example;
import org.example.tasks.inno.collections.task_1.LogEntry;
import org.example.tasks.inno.collections.task_1.Statistics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Statistics stats = new Statistics();

        try (BufferedReader br = new BufferedReader(new FileReader("access.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    LogEntry entry = new LogEntry(line);
                    stats.addEntry(entry);
                } catch (Exception e) {
                    System.err.println("Ошибка разбора строки: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Ошибка чтения файла: " + e.getMessage(), e);
        }

        System.out.println("Средний трафик за час: " + stats.getTrafficRate());

        System.out.println("Статистика браузеров:");
        for (Map.Entry<String, Double> entry : stats.getOsStatistics().entrySet()) {
            System.out.println(entry.getKey() + ": " + String.format("%.3f", entry.getValue()) + "%");
        }
    }
}
 */

