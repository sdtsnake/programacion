package test;

/**
 *
 * @author snake
 */
public class TestAutoboxingUnboxing {

    public static void main(String[] args) {
        //clases envolventes de tipos primitivos
        /*
        int - integer
        long - Long
        float - Float
        double - Double
        boolena - Boolean
        byte - Byte
        char - Chararter
        short - Short
         */
        Integer entero = 10; // autoboxing
        
        System.out.println("entero = " + entero);
        System.out.println("entero = " + entero.doubleValue());
        
        int entero2 = entero; //unboxing
        
        System.out.println("entero2 = " + entero2);
        
    }    
}
