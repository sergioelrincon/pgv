/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author sergioramos
 */
public class EjemploDescargaURL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        // TODO code application logic here
        
        String url = "https://google.com";
        String filePath = "Google.html";
         
        URL urlObj = new URL(url);
        URLConnection urlCon = urlObj.openConnection();
         
        InputStream inputStream = urlCon.getInputStream();
        BufferedInputStream reader = new BufferedInputStream(inputStream);
         
        BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(filePath));
         
        byte[] buffer = new byte[4096];
        int bytesRead = -1;
         
        while ((bytesRead = reader.read(buffer)) != -1) {
            writer.write(buffer, 0, bytesRead);
        }
         
        writer.close();
        reader.close();        
    }
    
}
