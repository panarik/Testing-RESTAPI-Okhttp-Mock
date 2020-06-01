package com.github.panarik.uitestapp.mockOkhttp;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;

public class OkHttpJavaBase {

    @Test
    public void testOkHttp() throws Exception, InterruptedException {


        //server setup
        MockWebServer server = new MockWebServer();
        HttpUrl serverUrl;
        MockResponse responseBody = new MockResponse();

        //client setup
        String requestBody;



        server.start(); //start our mock server
        serverUrl = server.url("api/test"); //set server path
        server.enqueue(responseBody.setBody("test body")); //set response body

        requestBody = sendGetRequest(new OkHttpClient(), serverUrl);

        Assert.assertEquals("test body", requestBody); //test matcher



    }

    private String sendGetRequest(OkHttpClient okHttpClient, HttpUrl base) throws IOException {

        RequestBody body = RequestBody.create(MediaType.parse("text/plain"), "test body");

        okhttp3.Request request = new okhttp3.Request.Builder()
                .post(body)
                .url(base)
                .build();

        Response response = okHttpClient.newCall(request).execute();
        return response.body().string();

    }

}
