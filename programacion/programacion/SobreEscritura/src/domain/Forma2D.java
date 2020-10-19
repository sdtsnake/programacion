package domain;

/**
 *
 * @author oscar
 */
public class Forma2D {

    public static class Cuadrado extends Forma2D {

        private double lado = 0;

        @Override
        public double area() {
            return lado * lado; //To change body of generated methods, choose Tools | Templates.
        }

    }

    public static class Circulo extends Forma2D {

        private double base = 0;
        private double altura = 0;

        @Override
        public double area() {
            return base * altura; //To change body of generated methods, choose Tools | Templates.
        }

    }

    public double area() {
        return 0;
    }

}
