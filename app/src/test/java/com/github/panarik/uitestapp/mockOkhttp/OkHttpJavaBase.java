package com.github.panarik.uitestapp.mockOkhttp;

public class OkHttpJavaBase {

    /*
    //server setup
    MockWebServer server = new MockWebServer();
    HttpUrl serverUrl;
    MockResponse response = new MockResponse();

    //client setup
    OkHttpClient client = new OkHttpClient();
    String responseBody;

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

    */
}
