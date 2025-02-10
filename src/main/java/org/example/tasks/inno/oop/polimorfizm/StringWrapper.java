package org.example.tasks.inno.oop.polimorfizm;

public class StringWrapper implements Measurable {
    private String str;

    public StringWrapper(String str) {
        this.str = str;
    }

    @Override
    public double getLength() {
        return str.length();
    }
}
