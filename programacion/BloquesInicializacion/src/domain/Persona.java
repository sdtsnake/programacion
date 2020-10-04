
package domain;

/**
 *
 * @author snake
 */
public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    static{
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
    }
    {
        System.out.println("Ejecucion bloque dinamico");
        this.idPersona = Persona.contadorPersonas++;
    }
    
    public Persona(){
        System.out.println("Ejecucion del contructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{idPersona=").append(idPersona);
        sb.append('}');
        return sb.toString();
    }
    
    
}
