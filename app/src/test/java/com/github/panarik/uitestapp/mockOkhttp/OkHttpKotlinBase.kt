package com.github.panarik.uitestapp.mockOkhttp

import com.github.panarik.uitestapp.MainActivity
import androidx.test.rule.ActivityTestRule
import okhttp3.Request
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import java.net.InetAddress

class OkHttpKotlinBase {

    @Rule
    @JvmField
    var mActivityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Before
    fun initMockServer() {
        val mockServer = MockWebServer()
        val ip = InetAddress.getByName("127.0.0.1")
        val port = 8080

        mockServer.enqueue(MockResponse().setBody("1st message"))

        mockServer.start(ip, port)
    }

    @Test
    fun queueTest() {


        /*
        sendGetRequest("http://localhost:8080/getMessage")
        assertResponseMessage("1st message")
        returnFromResponseActivity()

        sendPostRequest("http://localhost:8080/getMessage")
        assertResponseMessage("2nd message")
        returnFromResponseActivity()

        sendGetRequest("http://localhost:8080/getMessage")
        assertResponseMessage("3rd message")
        returnFromResponseActivity()
        */


    }


}