package sample;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.json.simple.JsonObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

public class SQLGET {
    public static void main(String[] args) {



GET("ID004");


    }


    public static void GET(String ID){
        String result="";
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


            }
            ObjectMapper mapper = new ObjectMapper();

            Data data = mapper.readValue(output,Data.class);

            System.out.print(data);



            conn.disconnect();

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
    }


    // Need to add parse results based on ID
    class Data{
        String fname,  lname,  email,  address,  job, manager,  note,  performance,  phone,  salary,  status,id,sysID;

        public String  getId() { return id; }
        public void setid(String id) { this.id = id; }

        public String  getfname() { return fname; }
        public void setfname(String fname) { this.fname = fname; }

        public String  getlname() { return lname; }
        public void setlname(String lname) { this.lname = lname; }

        public String  getemail() { return email; }
        public void setemail(String email) { this.email = email; }

        public String  getaddress() { return address; }
        public void setfaddress(String address) { this.address = address; }

        public String  getjob() { return job; }
        public void setfjob(String job) { this.job = job; }

        public String  getmanager() { return manager; }
        public void setmanager(String manager) { this.manager = manager; }
        public String  getnote() { return note; }

        public void setnote(String note) { this.note = note; }

        public String  getfperformance() { return performance; }
        public void setperformance(String performance) { this.performance = performance; }
        public String  getphone() { return phone; }
        public void setphone(String phone) { this.phone = phone; }
        public String  getsalary() { return salary; }
        public void setsalary(String salary) { this.salary = salary; }
        public String  getstatus() { return status; }
        public void setstatus(String status) { this.status = status; }

        public String  getsysID() { return sysID; }
        public void setsysID(String sysID) { this.sysID = sysID; }

        public  String getdata(){
            String fname = "",  lname = "",  email ="",  address="",  job="", manager="",  note="",  performance="",  phone="",  salary="",  status="",id="",sysID="";

            String pattern = "u_number:%s,u_email:%s,u_address:%s,u_job:%s,u_last_name:%s,sys_id: %s, u_first_name:%s, u_salary:%s,u_performance:%s,u_phone_number:%s,u_status:%s,u_manager:%s, u_notes:%s";
            //"{\"u_first_name\":\"%s\",\"u_last_name\":\"%s\",\"u_email\":\"%s\",\"u_address\":\"%s\",\"u_job\":\"%s\",\"u_manager\":\"%s\",\"u_notes\":\"%s\",\"u_performance\":\"%s\",\"u_phone\":\"%s\",\"u_salary\":\"%s\",\"u_status\":\"%s\"}";

            return String.format(pattern,id ,email, address,job,lname,sysID,fname, salary,performance,phone,status,manager,note);
        }




    }

    public static String getdata(String result) {

            String fname = "", lname = "", email = "", address = "", job = "", manager = "", note = "", performance = "", phone = "", salary = "", status = "", id = "", sysID = "";

            String pattern = "u_number:%s,u_email:%s,u_address:%s,u_job:%s,u_last_name:%s,sys_id: %s, u_first_name:%s, u_salary:%s,u_performance:%s,u_phone_number:%s,u_status:%s,u_manager:%s, u_notes:%s";
            //"{\"u_first_name\":\"%s\",\"u_last_name\":\"%s\",\"u_email\":\"%s\",\"u_address\":\"%s\",\"u_job\":\"%s\",\"u_manager\":\"%s\",\"u_notes\":\"%s\",\"u_performance\":\"%s\",\"u_phone\":\"%s\",\"u_salary\":\"%s\",\"u_status\":\"%s\"}";

        String r = result;
            return String.format(pattern, id, email, address, job, lname, sysID, fname, salary, performance, phone, status, manager, note);

    }

  /*  public static String getRecruiter(String ID){

        JsonObject json = new JsonObject(ID);
        String number = (String) json.get("u_email");
        String pattern="";

        return pattern;
    }     */

    public static String getinterview(String ID){


        String pattern="";

        return pattern;
    }
    public static String getJobrequest(String ID){


        String pattern="";

        return pattern;
    }
    public static String getApplicant(String ID){


        String pattern="";

        return pattern;
    }





}
