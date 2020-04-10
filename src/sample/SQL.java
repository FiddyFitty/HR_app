package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

public class SQL {

    public static void main(String[] args) {



 POST("77","Test77","Test 77","TEST77@gmail.com");


    }

    // Add new record
    public static void POST(String ID, String fname, String lname, String email) {

        try {

            URL url = new URL("https://dev98653.service-now.com/api/now/table/u_managers");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            String userCredentials = "admin:Emblem399*";
            String basicAuth = "Basic " + new String(Base64.getEncoder().encode(userCredentials.getBytes()));
            conn.setRequestProperty("Authorization", basicAuth);
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");


            //String input = "{\"u_manager_id\":\"75\",\"u_first_name\":\"Steve\",\"u_last_name\":\"Alfred\",\"u_email\":\"test@gmail.com\"}";

            String input = updateManager(ID,fname,lname, email);

            OutputStream os = conn.getOutputStream();
            os.write(input.getBytes());
            os.flush();

            if (conn.getResponseCode() == 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");

            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }


    }

// pull data



    // update data

    public void PUT(){


    }

    //Employee
/*--------------------------------------------------------------------*/
public String get_Emp( String ID, String fname, String Lname){


        String pattern =
                "{ \"wins\":\"%s\", \"losses\":\"%s\", \"ties\": \"%s\"}";
        return String.format(pattern,  ID, fname, Lname );
    }


    public String updateEmp(String ID, String fname, String Lname) {

        String pattern =
                "{ \"wins\":\"%s\", \"losses\":\"%s\", \"ties\": \"%s\"}";
        return String.format(pattern,  ID, fname, Lname );
    }
    /*--------------------------------------------------------------------*/

//Manager
    /*--------------------------------------------------------------------*/
public static String updateManager(String ID, String fname, String Lname, String email) {

    String pattern =
             "{\"u_manager_id\":\"%s\",\"u_first_name\":\"%s\",\"u_last_name\":\"%s\",\"u_email\":\"%s\"}";
    return String.format(pattern,  ID, fname, Lname, email );
}


    /*--------------------------------------------------------------------*/

    public static  String updateInterview ( String ID, String Status, String Time, String Description, String Job_ID, String App_ID, String Manager_ID, String Recruiter_ID){
        String pattern =
                "{\"u_interview_id\":\"%s\",\"u_interview_status\":\"%s\",\"u_interview_time\":\"%s\",\"u_interview_description\":\"%s\", \"u_jobrequest_id\":\"%s\", \"u_applicaent_id\":\"%s\", \"u_manage_id\":\"%s\", \"u_recruiter_id\":\"%s\" }";

        return String.format(pattern,  ID, Status, Time, Description,Job_ID,App_ID,Manager_ID,Recruiter_ID );
    }


}
