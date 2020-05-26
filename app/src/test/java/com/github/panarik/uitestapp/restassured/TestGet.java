package com.github.panarik.uitestapp.restassured;

import android.util.Log;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.when;

public class TestGet {

    @Test
    public void testGet() {
        //GET request
        when().get("https://postman-echo.com/get")
        .then()
                .assertThat()
                .statusCode(200); //assert with 200 code server answer
    }

    @Test
    public void testResponse(){

        Response response = when().get("https://postman-echo.com/get");

    }


}
