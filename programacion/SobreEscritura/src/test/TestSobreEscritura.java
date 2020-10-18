
package test;

import domain.Gerente;

/**
 *
 * @author oscar
 */
public class TestSobreEscritura {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Andres",500000.00,"I&D");
        System.out.println("gerente1 = " + gerente1.obtenerDetalles());
    }
    
}
