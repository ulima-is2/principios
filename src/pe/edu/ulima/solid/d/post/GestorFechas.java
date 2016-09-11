
package pe.edu.ulima.solid.d.post;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GestorFechas {
    
    public static String imprimirFecha(long time, String formato){
        return new SimpleDateFormat(formato).format(new Date(time));
    }
    
    public static void main(String[] args){
        System.out.println("Fecha: " + GestorFechas.imprimirFecha(new Date().getTime(), "dd/MM/yyyy"));
    }
}
