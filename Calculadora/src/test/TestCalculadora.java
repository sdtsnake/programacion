package test;

import java.util.Scanner;
import dominio.Operaciones;

/**
 *
 * @author oscar
 */
public class TestCalculadora {

    static Scanner entrada = new Scanner(System.in);

    public static char capturarOperador() {
        char resultado = ' ';
        do {
            resultado = entrada.next().charAt(0);
        } while (resultado != '+' && resultado != '-' && resultado != '*' && resultado != '/');
        return resultado;
    }

    public static void main(String[] args) {

        Operaciones operacion = new Operaciones();
        System.out.println("Primer operando : ");
        operacion.setNum1(entrada.nextDouble());
        System.out.println("Operador (+,-,*,/) : ");
        operacion.setOperador(capturarOperador());
        System.out.println("Segundo operando : ");
        operacion.setNum2(entrada.nextDouble());
        System.out.println("El resultado es  : " + operacion.calcular());
    }
}
