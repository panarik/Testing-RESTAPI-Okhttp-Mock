package com.github.panarik.uitestapp.mock;

//import com.github.tomakehurst.wiremock.WireMockServer;
//import com.github.tomakehurst.wiremock.client.WireMock;
//import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder;
//import com.github.tomakehurst.wiremock.client.WireMock;

import org.junit.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static io.restassured.RestAssured.when;

public class WireMockBase {


    /*
    private static final int PORT = 8080; //назначаем порт сервера
    private static final String HOST = "localhost"; //назначаем URL сервера

    private static WireMockServer mockServer = new WireMockServer(PORT); //создаем сервер

    @BeforeClass //код будет выполнятся перед стартом класса
    public static void setup() { //создаём метод запускающий сервер
        mockServer.start(); //запуск сервера
        WireMock.configureFor(HOST, PORT); //присваеваем серверу HOST и PORT, которые задали ранее

        ResponseDefinitionBuilder mockResponse = new ResponseDefinitionBuilder(); //объявляем объект для использования в методе .willReturn()
        mockResponse.withStatus(200); //придаем свойство объекту. Будет возвращать ответ сервера 200.

        WireMock.stubFor(
                WireMock.get("/gets") //устанавливаем тип и путь запроса
                        .willReturn(mockResponse) //устанавливаем требуемый ответ сервера. Использует объект класса ResponseDefinitionBuilder.
        );
    }

    @Test
    public void testGet() {
        //GET request
        when().get("http://localhost/gets:8080")
                .then()
                .assertThat()
                .statusCode(200); //assert with 200 code server answer
    }

    @AfterClass //после выполнения кода в классе
    public static void serverDown(){
        if (null != mockServer && mockServer.isRunning()){
            mockServer.shutdownServer();
        }

    }


*/
}
