
package pe.edu.ulima.solid.ol.post;

public class EncargadoLimpieza extends Empleado implements Calculador{

    public EncargadoLimpieza(String nombre, double sueldo, int tipo) {
        super(nombre, sueldo, tipo);
    }

    @Override
    public double getDescuento() {
        return this.getSueldo() * 0.01;
    }
    
}
