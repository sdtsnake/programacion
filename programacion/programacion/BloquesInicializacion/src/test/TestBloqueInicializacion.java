package test;

import domain.Persona;

/**
 *
 * @author snake
 */
public class TestBloqueInicializacion {

    public static void main(String[] args) {
        Persona personal = new Persona();
        System.out.println("personal = " + personal);
        System.out.println("");
        Persona persona2 = new Persona();
        System.out.println("personal = " + persona2);
    }

}
