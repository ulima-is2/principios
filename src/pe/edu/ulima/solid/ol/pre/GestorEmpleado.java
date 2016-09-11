
package pe.edu.ulima.solid.ol.pre;

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
            if (empleado.getTipo() == 1){
                descuentos += empleado.getSueldo() * 0.05;
            }else if (empleado.getTipo() == 2){
                descuentos += empleado.getSueldo() * 0.1;
            }if (empleado.getTipo() == 3){
                descuentos += empleado.getSueldo() * 0.08;
            }if (empleado.getTipo() == 4){
                descuentos += empleado.getSueldo() * 0.01;
            }
        }
        
        return descuentos;
    }
}
