
package pe.edu.ulima.solid.ol.post;

import java.util.List;

public class GestorEmpleado {
    /*
    Descuentos:
     - Director 10%
     - Coordinador 8%
     - Profesor 5%
     - EncargadoLimpieza 1%
    */
    public double calcularDescuentos(List<Empleado> empleados){
        double descuentos = 0;
        for (Empleado empleado : empleados){
            descuentos += ((Calculador)empleado).getDescuento();
        }
        
        return descuentos;
    }
}
