package testing;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;


public class StudentApiTest {

    @BeforeEach
    void cleanDatabase() {
        RestAssured.baseURI = "http://localhost:8080";
        given().delete("/student/1");
        given().delete("/student/2");
        given().delete("/student/3");
    }

    @Test
    @DisplayName("Получение существующего студента")
    void testGetExistingStudent() {
        given()
                .contentType(ContentType.JSON)
                .body("""
                {
                    "id": 1,
                    "name": "Иван Иванов",
                    "marks": [5, 4, 5]
                }
            """)
                .post("/student")
                .then()
                .statusCode(201);

        given()
                .get("/student/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("name", equalTo("Иван Иванов"))
                .body("marks", hasSize(3));
    }

    @Test
    @DisplayName("Получение несуществующего студента")
    void testGetNonExistingStudent() {
        given()
                .get("/student/99")
                .then()
                .statusCode(404);
    }

    @Test
    @DisplayName("Создание нового студента")
    void testCreateStudent() {
        given()
                .contentType(ContentType.JSON)
                .body("""
                {
                    "id": 1,
                    "name": "Анна Смирнова",
                    "marks": [4, 5, 5]
                }
            """)
                .post("/student")
                .then()
                .statusCode(201);
    }

    @Test
    @DisplayName("Обновление существующего студента")
    void testUpdateStudent() {
        given()
                .contentType(ContentType.JSON)
                .body("""
                {
                    "id": 1,
                    "name": "Иван Иванов",
                    "marks": [5, 4, 5]
                }
            """)
                .post("/student")
                .then()
                .statusCode(201);

        given()
                .contentType(ContentType.JSON)
                .body("""
                {
                    "id": 1,
                    "name": "Иван Петров",
                    "marks": [3, 3, 4]
                }
            """)
                .post("/student")
                .then()
                .statusCode(201);

        given()
                .get("/student/1")
                .then()
                .statusCode(200)
                .body("name", equalTo("Иван Петров"));
    }

    @Test
    @DisplayName("Создание студента без id")
    void testCreateStudentWithNullId() {
        Response response = given()
                .contentType(ContentType.JSON)
                .body("""
                {
                    "id": null,
                    "name": "Анна Смирнова",
                    "marks": [4, 4, 5]
                }
            """)
                .post("/student");

        response.then().statusCode(201);

//        // Выведем тело ответа, чтобы увидеть, есть ли там id
//        System.out.println("Response body: " + response.getBody().asString());
//
//        // Проверим, содержит ли ответ id перед вызовом getInt()
//        if (response.jsonPath().get("id") == null) {
//            fail("Сервер не вернул id в ответе");
//        }
//
//        Integer assignedId = response.jsonPath().getInt("id");
//        assertNotNull(assignedId);
    }

    @Test
    @DisplayName("Создание студента без имени")
    void testCreateStudentWithoutName() {
        given()
                .contentType(ContentType.JSON)
                .body("""
                {
                    "id": 2,
                    "name": ,
                    "marks": [3, 4]
                }
            """)
                .post("/student")
                .then()
                .statusCode(400);
    }

    @Test
    @DisplayName("Удалить студента")
    void testDeleteStudent() {
        given()
                .contentType(ContentType.JSON)
                .body("""
                {
                    "id": 1,
                    "name": "Иван Иванов",
                    "marks": [5, 4, 5]
                }
            """)
                .post("/student")
                .then()
                .statusCode(201);

        given()
                .delete("/student/1")
                .then()
                .statusCode(200);

        given()
                .get("/student/1")
                .then()
                .statusCode(404);
    }

    @Test
    @DisplayName("Удалить не существующего студента")
    void testDeleteNonExistingStudent() {
        given()
                .delete("/student/99")
                .then()
                .statusCode(404);
    }

    @Test
    @DisplayName("Получение лучшего студента")
    void testGetTopStudentNoStudents() {
        given()
                .get("/topStudent")
                .then()
                .statusCode(200)
                .body(is(emptyOrNullString()));
    }

    @Test
    @DisplayName("Получение лучшего студента")
    void testGetTopStudentNoMarks() {
        given()
                .contentType(ContentType.JSON)
                .body("""
                {
                    "id": 1,
                    "name": "Иван Иванов",
                    "marks": []
                }
            """)
                .post("/student")
                .then()
                .statusCode(201);

        given()
                .get("/topStudent")
                .then()
                .statusCode(200)
                .body(is(emptyOrNullString()));
    }

    @Test
    @DisplayName("Получение самого лучшего студента")
    void testGetTopStudentOneBest() {
        given()
                .contentType(ContentType.JSON)
                .body("""
                {
                    "id": 1,
                    "name": "Иван Иванов",
                    "marks": [5, 5, 5]
                }
            """)
                .post("/student")
                .then()
                .statusCode(201);

        given()
                .contentType(ContentType.JSON)
                .body("""
                {
                    "id": 2,
                    "name": "Анна Смирнова",
                    "marks": [4, 4, 5]
                }
            """)
                .post("/student")
                .then()
                .statusCode(201);

        given()
                .get("/topStudent")
                .then()
                .statusCode(200)
                .body("id", anyOf(equalTo(1), hasItem(1)));

    }

    @Test
    @DisplayName("Получение нескольких лучших студентов")
    void testGetTopStudentMultipleBest() {
        given()
                .contentType(ContentType.JSON)
                .body("""
                {
                    "id": 1,
                    "name": "Иван Иванов",
                    "marks": [5, 5, 5]
                }
            """)
                .post("/student")
                .then()
                .statusCode(201);

        given()
                .contentType(ContentType.JSON)
                .body("""
                {
                    "id": 2,
                    "name": "Анна Смирнова",
                    "marks": [5, 5, 5]
                }
            """)
                .post("/student")
                .then()
                .statusCode(201);

        Response response = given()
                .get("/topStudent")
                .then()
                .statusCode(200)
                .extract()
                .response();

        List<Integer> studentIds = response.jsonPath().getList("id");
        assertTrue(studentIds.containsAll(List.of(1, 2)));
    }
}









