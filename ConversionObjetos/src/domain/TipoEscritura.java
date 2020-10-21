
package domain;

/**
 *
 * @author oscar
 */
public enum TipoEscritura {
    CLASICO("Escritura a Mano"),
    MODERNO("Estructura Digital");
    
    private final String descripcion;
    
    private TipoEscritura(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    } 
}
