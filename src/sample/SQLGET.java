package sample;

import org.json.JSONArray;
import org.json.JSONObject;
import unused.Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

public class SQLGET {

    static String fname="",  lname="",  email="",  address="",  job="", manager="",  note="",  performance="",  phone="",  salary="",  status="",id="",sysID="";


    public static void main(String[] args) {


    }


    public static void GET(String ID){
        String result="";

        Data data = new Data();

        try {

            //URL url = new URL("https://dev20047.service-now.com/api/now/table/u_people?sysparm_limit=1&sysparm_query=u_number="+ID);//&sysparm_fields=u_first_name
            URL url = new URL("https://dev20047.service-now.com/api/now/table/u_people?sysparm_limit=1&sysparm_query=u_number="+ID);//&sysparm_fields=u_first_name
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            String userCredentials = "admin:2djtyH7PkFTF";
            String basicAuth = "Basic " + new String(Base64.getEncoder().encode(userCredentials.getBytes()));
            conn.setRequestProperty("Authorization", basicAuth);
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);





                final JSONObject obj = new JSONObject(output);
                final JSONArray result1 = obj.getJSONArray("result");
                final int n = result1.length();
                for (int i = 0; i < n; ++i) {
                    final JSONObject person = result1.getJSONObject(i);
                    System.out.println(person.getString("u_number"));
                    id = person.getString("u_number");


                    email = person.getString("u_email");

                    address = person.getString("u_address");

                    lname = person.getString("u_last_name");

                    fname = person.getString("u_first_name");

                    sysID = person.getString("sys_id");

                    salary = person.getString("u_salary");

                    performance = person.getString("u_performance");

                    phone = person.getString("u_phone_number");

                    status = person.getString("u_status");

                    manager = person.getString("u_manager");
                    note =person.getString("u_notes");
                    job = person.getString("u_job");


                    System.out.println(person.getString("u_email"));
                    System.out.println(person.getString("u_address"));
                    System.out.println(person.getString("u_job"));
                    System.out.println(person.getString("u_first_name"));
                }




            }

            conn.disconnect();

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }



    }


    // Need to add parse results based on ID






}
