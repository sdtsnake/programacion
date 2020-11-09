package dominio;

/*
 *
 * @author oscar
 */
public class Operaciones {

    double num1 = 0;
    double num2 = 0;
    double resultado=0;
    char operador;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public char getOperador() {
        return operador;
    }

    public void setOperador(char operador) {        
        this.operador = operador;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double calcular() {

        switch (operador) {
            case '+':
                resultado =  num1 + num2;     
                break;
            case '-':
                resultado =  num1 - num2;     
                break; 
            case '/':
                resultado =  num1 / num2;     
                break;
            case '*':
                resultado =  num1 * num2;     
                break;
            default:
                System.out.println("Operacion no valida");
        }
        return resultado;        
    }


}
