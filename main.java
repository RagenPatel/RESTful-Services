import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;

import java.io.*;

public class main {
    public static void main(String[] args) throws Exception {
        
        main http = new main();
        
        String url = "http://127.0.0.1:5000/"; // change depending on local server URL or website URL
        
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestProperty("User-Agent", "Chrome 53.03");
        
        int response = con.getResponseCode();
        
        BufferedReader in = new BufferedReader(
                                               new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        
        //---------------FILEWRITER------------------------
        
        //File object at src... location
        String fileName = "output.txt";
        File file = new File("../src/" + fileName);
        
        //if file doesn't exist, create it at the location
        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(response.toString());
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println(response.toString());
        
    }
}
