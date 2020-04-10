package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

public class SQLGET {
    public static void main(String[] args) {



GET();


    }


    public static void GET(){
        try {

            URL url = new URL("https://dev98653.service-now.com/api/now/table/u_managers");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            String userCredentials = "admin:Emblem399*";
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

            conn.disconnect();

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
    }


    // Need to add parse results based on ID


    public static String getManager(String ID){


        String pattern="";

        return pattern;
    }

    public static String getRecruiter(String ID){


        String pattern="";

        return pattern;
    }

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

    /*public String getJsonFromCAdvisor(String containerId) {
        String result = "";
        try {
            CloseableHttpClient httpclient = HttpClients.createDefault();
            HttpGet httpget = new HttpGet(cAdvisorURL + "/api/v1.3/containers/docker/" + containerId);
            CloseableHttpResponse response = httpclient.execute(httpget);
            try {
                result = EntityUtils.toString(response.getEntity());
                if (logger.isDebugEnabled()) {
                    logger.debug(result);
                }
            } finally {
                response.close();
            }
        } catch (Exception e) {
            logger.error(containerId, e);
        }
        return result;
    }*/



}
