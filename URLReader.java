/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab11.bai7;

import java.net.*;
import java.io.*;
/**
 *
 * @author phamv
 */
public class URLReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        URL baomoi = new URL("https://suckhoedoisong.vn//gia-tang-f0-tphcm-tang-cuong-cac-tram-y-te-luu-dong-169211117084358472.htm");
        BufferedReader in = new BufferedReader(new InputStreamReader(baomoi.openStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null)
        System.out.println(inputLine);
        in.close();
    }
    
}
