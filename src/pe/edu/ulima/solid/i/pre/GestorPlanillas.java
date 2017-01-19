
package pe.edu.ulima.solid.i.pre;

import java.util.List;

public class GestorPlanillas {
    public double calcularTotalDescuentos(List<Empleado> empleados){
        double descuentos = 0;
        for (Empleado empleado : empleados){
            descuentos += ((Calculador)empleado).getDescuento();
        }
        
        return descuentos;
    }
}
