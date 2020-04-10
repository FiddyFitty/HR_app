package sample;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.awt.*;
import java.io.OutputStreamWriter;
import java.net.*;
import java.net.http.HttpResponse;
import java.sql.Statement;
import java.util.Base64;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;



public class SQLDELETE {

    public static void main(String[] args) {


        //delete();
        delete2();


    }
    /*
    public static void Delete() throws IOException {


        URL url = new URL("https://dev98653.service-now.com/api/now/table/u_managers");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoOutput(true);
        conn.setRequestProperty(
                "Content-Type", "application/json");
        conn.setRequestMethod("DELETE");
        OutputStreamWriter out = new OutputStreamWriter(
                conn.getOutputStream());

        ObjectMapper objectMapper = new ObjectMapper();
        //out.write(objectMapper.writeValueAsString(new Greeting("foo")));
        out.close();

        conn.connect();
    }*/
    ///String ID, String fname, String lname, String email

    public static void delete()  {


        try {
        URL url = new URL("https://dev98653.service-now.com/api/now/table/u_managers/u_manager_id/77");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        String userCredentials = "admin:Emblem399*";
        String basicAuth = "Basic " + new String(Base64.getEncoder().encode(userCredentials.getBytes()));
        conn.setRequestProperty("Authorization", basicAuth);
        conn.setDoOutput(true);
        conn.setRequestMethod("DELETE");
        conn.setRequestProperty("Content-Type", "application/json");

        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + conn.getResponseCode());
        }



            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

        //Create the StringBuffer object and store the response into it.
        StringBuffer result = new StringBuffer();



            String line =" " ;
        while ((line = br.readLine()) != null) {
            System.out.println("Response : \n" + result.append(line));
        }
            conn.disconnect();




        }catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
    }


    public static void delete2(){
        try {

            URL url = new URL("https://dev98653.service-now.com/api/now/table/u_managers/u_manager_id");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestProperty(
                    "Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestMethod("DELETE");
            conn.connect();


String result;
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String temp = null;
            StringBuilder sb = new StringBuilder();
            while((temp = in.readLine()) != null){
                sb.append(temp).append(" ");
            }
            result = sb.toString();
            in.close();


        }catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }



    public static String deleteManager(String ID, String fname, String Lname, String email) {

        String pattern =
                "{\"u_manager_id\":\"%s\",\"u_first_name\":\"%s\",\"u_last_name\":\"%s\",\"u_email\":\"%s\"}";
        return String.format(pattern,  ID, fname, Lname, email );
    }



}
