
package pe.edu.ulima.solid.d.post;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormateadorFechas {
    public String imprimirFecha(long time, String formato){
        return new SimpleDateFormat(formato).format(new Date(time));
    }
}
