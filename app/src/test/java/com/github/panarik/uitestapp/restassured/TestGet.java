package com.github.panarik.uitestapp.restassured;

import org.junit.Test;

import io.restassured.RestAssured;

public class TestGet {

    @Test
    public void testGet() {

        //GET request
        RestAssured.when().get("https://postman-echo.com/get");

    }

}
