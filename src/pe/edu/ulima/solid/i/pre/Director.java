
package pe.edu.ulima.solid.i.pre;

public class Director implements Calculador{
    private String nombre;
    private double sueldo;

    public Director(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public double getDescuento() {
        return -1;
    }

    @Override
    public double getBonos() {
        return this.sueldo * 1.2;
    }

    @Override
    public void listarImpuestosAplicados() {}
    
}
