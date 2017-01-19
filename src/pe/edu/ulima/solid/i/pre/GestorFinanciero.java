
package pe.edu.ulima.solid.i.pre;

import java.util.List;

public class GestorFinanciero {
    public double calcularBonos(List<Director> directores){
        double totalBonos = 0;
        for (Director director : directores){
            totalBonos += ((Calculador)director).getBonos();
        }
        
        return totalBonos;
    }
}
