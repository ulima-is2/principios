
package pe.edu.ulima.solid.d.pre;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormateadorFechas {
     public String imprimirFecha(long time){
        return new SimpleDateFormat("dd-MM-yyyy").format(new Date(time));
    }
}
