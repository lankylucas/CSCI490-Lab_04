package com.example.csci490_lab_04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.Buffer;

import static android.util.Log.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webview = new WebView(this);
        setContentView(webview);
        webview.loadUrl("https://berniesanders.com");
    }
    public static String UrlConnection(String urlString) throws IOException {
        String url = "https://jsonplaceholder.typicode.com/users";
        URL myURL = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) myURL.openConnection();
        InputStreamReader isr = new InputStreamReader(connection.getInputStream());
        BufferedReader in = new BufferedReader(isr);
        String line = in.readLine();
        in.close();
      Log.i("whatever",line);
       return  line;




    }
}
