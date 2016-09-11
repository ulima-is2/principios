
package pe.edu.ulima.solid.ol.post;

public class Coordinador extends Empleado implements Calculador{
    
    public Coordinador(String nombre, double sueldo, int tipo) {
        super(nombre, sueldo, tipo);
    }

    @Override
    public double getDescuento() {
        return this.getSueldo() * 0.08;
    }
    
}
