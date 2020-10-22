
package test;

import domain.FiguraGeometrica;
import domain.Rectangulo;

/**
 *
 * @author oscar
 */
public class TestClasesAbstractas {
    public static void main(String[] args) {
       // Las calses abtractas no se pueden hacer objetos de ellas
       // FiguraGeometrica figura = new FiguraGeometrica();
       FiguraGeometrica figura = new Rectangulo("Rectangulo"); 
       figura.dibujar();
    }
    
}
