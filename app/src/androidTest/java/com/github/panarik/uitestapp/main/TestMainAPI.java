package com.github.panarik.uitestapp.main;

import com.github.panarik.uitestapp.TestBase;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

public class TestMainAPI extends TestBase {

    @Test
    public void testOkHttp() throws Exception {

        //run Get Request
        responseBody = getRequest(client, serverUrl);

        //matcher
        Assert.assertEquals("test body", responseBody); //body equals
    }

    @Test
    public void testTimeouts() throws Exception {

        //configure client for set timeout
        client = new OkHttpClient.Builder()
                .connectTimeout(20, TimeUnit.SECONDS)
                .writeTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .callTimeout(20, TimeUnit.SECONDS)
                .build();

        //run Get Request
        responseBody = getRequest(client, serverUrl);

        //matcher
        Assert.assertEquals("test body", responseBody); //body equals
    }

}
