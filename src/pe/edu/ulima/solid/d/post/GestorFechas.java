
package pe.edu.ulima.solid.d.post;

import java.util.Date;

public class GestorFechas {
    
    
    
    public static void main(String[] args){
        System.out.println("Fecha: " + new FormateadorFechas()
                .imprimirFecha(new Date().getTime(), "dd/MM/yyyy"));
    }
}
