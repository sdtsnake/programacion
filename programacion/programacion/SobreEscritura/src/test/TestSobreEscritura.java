
package test;

import domain.Empleado;
import domain.Gerente;

/**
 *
 * @author oscar
 */
public class TestSobreEscritura {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("juan", 5000);
        System.out.println("empleado = " + empleado.obtenerDetalles());
        
        Gerente gerente = new Gerente("karla", 4000, "i%D");
        System.out.println("gerente = " + gerente.obtenerDetalles());
        
        
    }
    
}
