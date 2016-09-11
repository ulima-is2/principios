
package pe.edu.ulima.solid.ol.post;

public class Profesor extends Empleado implements Calculador{

    public Profesor(String nombre, double sueldo, int tipo) {
        super(nombre, sueldo, tipo);
    }

    @Override
    public double getDescuento() {
        return this.getSueldo() * 0.05;
    }
    
}
