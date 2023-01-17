import java.net.*;
import java.io.*;
public class EjemploURL {
  public static void main (String[] args) throws Exception {
    try {
      // Constructor
      URL direccion = new URL("http://www.it.uc3m.es:80/index.html");
      // Divide las diferentes partes de una URL
      System.out.println("El protocolo utilizado es: " + direccion.getProtocol());
      System.out.println("El host es: " + direccion.getHost());
      System.out.println("El puerto es: " + direccion.getPort());
      System.out.println("El fichero es: " + direccion.getFile());
    } catch (MalformedURLException e) {
    System.out.println("Error en la construccion de la URL");
    }
  }
}