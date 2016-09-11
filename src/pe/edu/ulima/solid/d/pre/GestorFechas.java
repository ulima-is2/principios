
package pe.edu.ulima.solid.d.pre;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GestorFechas {
    
    public static String imprimirFecha(long time){
        return new SimpleDateFormat("dd-MM-yyyy").format(new Date(time));
    }
    
    public static void main(String[] args){
        System.out.println("Fecha: " + GestorFechas.imprimirFecha(new Date().getTime()));
    }
}
