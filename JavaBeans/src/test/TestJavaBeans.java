
package test;

import domain.Persona;

/**
 *
 * @author oscar
 */
public class TestJavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        
        System.out.println("persona = " + persona);
        
        System.out.println("Persona Nombre;  = " + persona.getNombre() );
        System.out.println("Persona Apellido; = " + persona.getApellido());
    }
}
