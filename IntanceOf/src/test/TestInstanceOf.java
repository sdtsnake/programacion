package test;

import domain.Empleado;
import domain.Gerente;

/**
 *
 * @author oscar
 */
public class TestInstanceOf {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("juan", 5000);
        determinarTipo(empleado);
        //    empleado = new Gerente("karla", 4000, "i%D");
        //    determinarTipo(empleado);
    }

    public static void determinarTipo(Empleado empleado) {
        /*   if (empleado instanceof Gerente) {
            System.out.println("Es de tipo gerente");
        } else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo de empleado");
        } else if (empleado instanceof Object) {
            System.out.println("Es de tipo Objeto");
        }*/

        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo gerente");
            Gerente gerente = (Gerente) empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
        }
        if (empleado instanceof Empleado) {
            System.out.println("Es de tipo de empleado");
            System.out.println("empleado = " + empleado.getNombre());
        }
        if (empleado instanceof Object) {
            System.out.println("Es de tipo Objeto");
            System.out.println("Objeto = " + empleado.toString());
        }

    }

}
