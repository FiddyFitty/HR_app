package sample;

import java.awt.*;
import java.io.OutputStreamWriter;
import java.net.*;
import java.util.Base64;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

public class SQLUPDATE {
    private Integer id;
    private String name;
    private String address;


    public static void main(String[] args) {


    }

    public static void PUT()  {


        try {

            URL url = new URL("https://dev98653.service-now.com/api/now/table/u_managers");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            String userCredentials = "admin:Emblem399*";
            String basicAuth = "Basic " + new String(Base64.getEncoder().encode(userCredentials.getBytes()));
            conn.setRequestProperty("Authorization", basicAuth);
            conn.setRequestMethod("PUT");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            OutputStreamWriter out = new OutputStreamWriter(
                    conn.getOutputStream());
            out.write("Resource content");
            out.close();
            conn.getInputStream();









        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }


        }


        public static String updatemanager(){
            String pattern = "{\r\n" +
                    "  \"firstName\": \"Ram\",\r\n" +
                    "  \"lastName\": \"Jadhav\",\r\n" +
                    "  \"emailId\": \"ramesh1234@gmail.com\",\r\n" +
                    "  \"createdAt\": \"2018-09-11T11:19:56.000+0000\",\r\n" +
                    "  \"createdBy\": \"Ramesh\",\r\n" +
                    "  \"updatedAt\": \"2018-09-11T11:26:31.000+0000\",\r\n" +
                    "  \"updatedby\": \"Ramesh\"\r\n" +
                    "}";

        return pattern;
        }


}
