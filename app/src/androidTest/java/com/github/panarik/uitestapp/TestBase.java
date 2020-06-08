package com.github.panarik.uitestapp;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.runner.RunWith;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;

@RunWith(AndroidJUnit4.class)
public class TestBase {

    //server setup
    public MockWebServer server = new MockWebServer();
    public HttpUrl serverUrl;
    public MockResponse response = new MockResponse();

    //client setup
    public OkHttpClient client = new OkHttpClient();
    public String responseBody;

    //start main activity
    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setupMockServer() throws Exception {
        //run server
        server.start();

        //configure server
        serverUrl = server.url("api/test"); //set server path
        server.enqueue(response
                .setBody("test body") //set response body
                .setResponseCode(200) //set response code
        );
    }

    @After
    public void stopMockServer() throws Exception {
        server.shutdown();
    }



    /* method with parameters:
       - client - for GET request object
       - serverUrl - for configure server URL of GET request
    */
    public String getRequest(OkHttpClient client, HttpUrl serverUrl) throws Exception {

        //run client request
        Request request = new Request.Builder()
                .url(serverUrl) //configure server URL of GET request
                .build(); //run request

        //run server response
        try (Response response = client.newCall(request).execute()){
            return response.body().string();
        }

    }

}
