
package pe.edu.ulima.solid.ol.pre;

public class Empleado {
    private String nombre;
    private double sueldo;
    private int tipo; // 1: Profesor 2: Director 3: Coordinador 4: EncargadoLimpieza

    public Empleado(String nombre, double sueldo, int tipo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.tipo = tipo;
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

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
}
