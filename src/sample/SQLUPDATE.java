package sample;

import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.Base64;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.io.OutputStreamWriter;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.github.cliftonlabs.json_simple.JsonObject;

import netscape.javascript.JSObject;

public class SQLUPDATE {

    private Integer id;
    private String name;
    private String address;




    public static void main(String[] args) {

        //PUT("c51184892f5050102f7955272799b6f4");


    }

    public static void PUT(String ID)  {


        try {

            URL url = new URL("https://dev81131.service-now.com/api/now/table/u_manager/"+ID);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            String userCredentials = "admin:Emblem399*";
            String basicAuth = "Basic " + new String(Base64.getEncoder().encode(userCredentials.getBytes()));
            conn.setRequestProperty("Authorization", basicAuth);
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestMethod("PUT");
            conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");

            JsonObject jsonObject = new JsonObject();
                    jsonObject.put("u_first_name","Fuck this exercise");

                    String sample = "{\"u_first_name\":\"Test 3\"}";


            try(OutputStream os = conn.getOutputStream()) {
                byte[] input = sample.getBytes("UTF-8");
                os.write(input);
            }

            try(BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String responseLine = null;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                System.out.println(response.toString());
            }



           /* if (conn.getResponseCode() == 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }


            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));
            String output;

            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            OutputStream os = conn.getOutputStream();
            os.write(output.getBytes());
            os.flush();


            System.out.println("Output from Server .... \n");



            conn.disconnect();*/

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
