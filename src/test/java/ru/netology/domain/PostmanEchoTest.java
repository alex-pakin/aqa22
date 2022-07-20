package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    void shouldTestPostRequest() {

        given()
                .baseUri("https://postman-echo.com")
                .body("https://en.wikipedia.org/wiki/NASA") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("https://en.wikipedia.org/wiki/NASA"));

    }
}
