package br.com.pokedex.network;

import java.net.URL;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

public class HTTPRequest {

    public void requestGetMethod(String stringUrl) {

        URL url;
        try {
            url = new URL(stringUrl);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.connect();

            


        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        


    }
    
}
