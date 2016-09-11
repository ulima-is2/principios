
package pe.edu.ulima.solid.ol.post;

public class Director extends Empleado implements Calculador{

    public Director(String nombre, double sueldo, int tipo) {
        super(nombre, sueldo, tipo);
    }

    @Override
    public double getDescuento() {
        return this.getSueldo() * 0.1;
    }
    
}
