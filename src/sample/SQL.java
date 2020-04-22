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


POSTHR("john","john","gmail","address","Job","Jake", "vacation","87%","212121212","85000","active");



    }

    // Add new record
    public static void POST( String fname , String lname, String email, String address, String phone, String note, String status) {

        try {

            URL url = new URL("https://dev20047.service-now.com/api/now/table/u_people");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            String userCredentials = "admin:2djtyH7PkFTF";
            String basicAuth = "Basic " + new String(Base64.getEncoder().encode(userCredentials.getBytes()));
            conn.setRequestProperty("Authorization", basicAuth);
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");


            //String input = "{\"u_manager_id\":\"75\",\"u_first_name\":\"Steve\",\"u_last_name\":\"Alfred\",\"u_email\":\"test@gmail.com\"}";

            String input = updateEmp(fname,lname, email,address,phone,note,status);

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

    public static void POSTHR( String fname, String lname, String email, String address, String job, String manager, String note, String performance, String phone, String salary, String status ) {

        try {

            URL url = new URL("https://dev20047.service-now.com/api/now/table/u_people");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            String userCredentials = "admin:2djtyH7PkFTF";
            String basicAuth = "Basic " + new String(Base64.getEncoder().encode(userCredentials.getBytes()));
            conn.setRequestProperty("Authorization", basicAuth);
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");


            //String input = "{\"u_manager_id\":\"75\",\"u_first_name\":\"Steve\",\"u_last_name\":\"Alfred\",\"u_email\":\"test@gmail.com\"}";

            String input = updateManager(fname,lname, email, address, job, manager, note,performance,phone,salary,status);

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



    public static String updateEmp(String fname , String lname, String email, String address, String phone, String note, String status) {

        String pattern =
                "{\"u_first_name\":\"%s\",\"u_last_name\":\"%s\",\"u_email\":\"%s\",\"u_address\":\"%s\",\"u_phone\":\"%s\",\"u_notes\":\"%s\",\"u_status\":\"%s\"}";
        return String.format(pattern,  fname, lname, email , address,phone, note,status);
    }
    /*--------------------------------------------------------------------*/

//Manager/ HR
    /*--------------------------------------------------------------------*/
public static String updateManager (String fname, String lname, String email, String address, String job, String manager, String note, String performance, String phone, String salary, String status) {

    String pattern =
             "{\"u_first_name\":\"%s\",\"u_last_name\":\"%s\",\"u_email\":\"%s\",\"u_address\":\"%s\",\"u_job\":\"%s\",\"u_manager\":\"%s\",\"u_notes\":\"%s\",\"u_performance\":\"%s\",\"u_phone\":\"%s\",\"u_salary\":\"%s\",\"u_status\":\"%s\"}";
    return String.format(pattern, fname,lname, email, address, job, manager, note,performance,phone,salary,status);
}


    /*--------------------------------------------------------------------*/

    public static  String updateInterview ( String ID, String Status, String Time, String Description, String Job_ID, String App_ID, String Manager_ID, String Recruiter_ID){
        String pattern =
                "{\"u_interview_id\":\"%s\",\"u_interview_status\":\"%s\",\"u_interview_time\":\"%s\",\"u_interview_description\":\"%s\", \"u_jobrequest_id\":\"%s\", \"u_applicaent_id\":\"%s\", \"u_manage_id\":\"%s\", \"u_recruiter_id\":\"%s\" }";

        return String.format(pattern,  ID, Status, Time, Description,Job_ID,App_ID,Manager_ID,Recruiter_ID );
    }


}
