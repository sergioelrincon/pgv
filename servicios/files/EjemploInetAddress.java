
import java.net.InetAddress;
import java.net.UnknownHostException;

public class EjemploInetAddress {

  public static void main(String[] args) {

    try {
      //RED LOCAL
      System.out.println("**********LA RED LOCAL*************");

      //Obtiene el objeto InetAddress de localhost
      InetAddress objetoLocalhost = InetAddress.getByName("localhost");

      System.out.println("IP de localhost:");
      System.out.println(objetoLocalhost.getHostAddress());

      //obtiene dirección de mi Equipo-- puedo utilizar:
      //getLocalHost() o getByName("nombredemiEquipo")
      InetAddress MiEquipoLan = InetAddress.getLocalHost();

      System.out.println("\nNombre de mi Equipo en la red local:");
      System.out.println(MiEquipoLan.getHostName());
      System.out.println("\nIP de mi Equipo en la red local:");
      System.out.println(MiEquipoLan.getHostAddress());


      //En INTERNET
      System.out.println("\n********* INTERNET************");

      //Obtener objeto InetAddress de www.gobiernodecanarias.org
      InetAddress objetoGobCan =
              InetAddress.getByName("www.gobiernodecanarias.org");

      //Obtiene y muestra la IP del nombre de dominio 
      System.out.println("\nIP de www.gobiernodecanarias.org:");
      System.out.println(objetoGobCan.getHostAddress());

      //encapsula google.com
      InetAddress[] matrizAddress = InetAddress.getAllByName("www.gobiernodecanarias.net");

      //Obtiene y muestras todas las IP asociadas a ese host
      System.out.println("\nImprime todas las IP disponibles para www.gobiernodecanarias.net: ");
      for (int i = 0; i < matrizAddress.length; i++) {
        System.out.println(matrizAddress[i].getHostAddress());
      }

    } catch (UnknownHostException e) {
      System.out.println(e);
      System.out.println(
              "Parece que no estás conectado, o que el servidor DNS no ha "
              + "podido tramitar tu solicitud");
    }
  }
}
