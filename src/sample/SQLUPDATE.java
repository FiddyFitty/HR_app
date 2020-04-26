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

    public static void PUT(String sysID, String fname, String lname, String email, String address, String job, String manager, String note, String performance, String phone, String salary, String status)  {


        try {

            URL url = new URL("https://dev20047.service-now.com/api/now/table/u_people/"+sysID);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            String userCredentials = "admin:2djtyH7PkFTF";
            String basicAuth = "Basic " + new String(Base64.getEncoder().encode(userCredentials.getBytes()));
            conn.setRequestProperty("Authorization", basicAuth);
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestMethod("PUT");
            conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");

                   String sample = updateRecord(fname,lname, email,address,job,manager,note,performance,phone,salary,status);


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


    public static void PUTemp(String sysID, String fname, String lname, String email, String address, String phone , String status)  {


        try {

            URL url = new URL("https://dev20047.service-now.com/api/now/table/u_people/"+sysID);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            String userCredentials = "admin:2djtyH7PkFTF";
            String basicAuth = "Basic " + new String(Base64.getEncoder().encode(userCredentials.getBytes()));
            conn.setRequestProperty("Authorization", basicAuth);
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestMethod("PUT");
            conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");

            JsonObject jsonObject = new JsonObject();
            jsonObject.put("u_first_name","Fuck this exercise");

            //String sample = "{\"u_first_name\":\"Test 3\"}";
            String sample= updateRecordemp(fname,lname, email, address,phone,status);


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





        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }


    }


    public static String updateRecordemp (String fname, String lname, String email, String address, String phone, String status ) {

        String pattern =
                "{\"u_first_name\":\"%s\",\"u_last_name\":\"%s\",\"u_email\":\"%s\",\"u_address\":\"%s\",\"u_phone_number\":\"%s\",\"u_status\":\"%s\"}";
        return String.format(pattern, fname,lname, email, address,phone, status);
    }

    public static String updateRecord (String fname, String lname, String email, String address, String job, String manager, String note, String performance, String phone, String salary, String status) {

        String pattern =
                "{\"u_first_name\":\"%s\",\"u_last_name\":\"%s\",\"u_email\":\"%s\",\"u_address\":\"%s\",\"u_job\":\"%s\",\"u_manager\":\"%s\",\"u_notes\":\"%s\",\"u_performance\":\"%s\",\"u_phone_number\":\"%s\",\"u_salary\":\"%s\",\"u_status\":\"%s\"}";
        return String.format(pattern, fname,lname, email, address, job, manager, note,performance,phone,salary,status);
    }

}
