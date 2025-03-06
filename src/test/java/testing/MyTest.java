package testing;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import io.restassured.path.json.JsonPath;
import lombok.SneakyThrows;
import org.example.tasks.inno.testing.rest_assured.Students;
import org.example.tasks.inno.testing.stub.Student;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;


public class MyTest {

    @Test
    public void test() {
        RestAssured.given()
                .baseUri("http://localhost:8080/student/1")
                .contentType(ContentType.JSON)
                .when()
                .get()
                .then()
                .statusCode(200);
    }

//    @Test @SneakyThrows
//    public void test2() {
//        int id = 2;
//        Students st2 = new Students();
//        ObjectMapper mapper = new ObjectMapper();
//        Students st = RestAssured.given()
//                .baseUri("http://localhost:8080/student/"+{id})
//                .contentType(ContentType.JSON)
//                .body(mapper.writeValueAsString(st2))
//                .when().get().then()
//                .statusCode(200)
//                .contentType(ContentType.JSON)
//                .body("id", Matchers.equalTo(id))
//                .extract().as(Students.class);
//        System.out.println(st);
//        String json = mapper.writeValueAsString(st2);
//        JsonPath jsonPath = new JsonPath(json);
//        id = jsonPath.getInt("id")
//        System.out.println(id);
//    }
}
