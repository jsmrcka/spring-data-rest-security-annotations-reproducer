package org.acme;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class FruitsResourceTest {
    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/fruits")
                .then().statusCode(200);
    }
}