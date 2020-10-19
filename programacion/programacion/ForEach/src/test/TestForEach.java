
package test;

import domain.Persona;

/**
 *
 * @author snake
 */
public class TestForEach {
    public static void main(String[] args) {
        int edades[] = { 5, 6, 8,9 };
        for(int edad: edades){
            System.out.println("edad = " + edad);
        }
        Persona personas[] = {new Persona("juan"), new Persona("karla"), new Persona("snake")};
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
    }
    
    
}
