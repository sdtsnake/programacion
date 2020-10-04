
package test;

import enumeracion.Continentes;
import enumeracion.Dias;

/**
 *
 * @author snake
 */
public class TestEnumeraciones {
    public static void main(String[] args) {
 //       System.out.println("Dia :" + Dias.LUNES);
 //       indicarDiasSemana(Dias.LUNES);
            System.out.println("Continente No. 4 " + Continentes.AMERICA);
            System.out.println("No. Paises en el 4to continente: " + Continentes.AMERICA.getPaises());
            
            System.out.println("Continente No. 1 " + Continentes.AFRICA);
            System.out.println("No. Paises en el 4to continente: " + Continentes.AFRICA.getPaises());
    }
    
    private static void indicarDiasSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
        }
    }
    
}
