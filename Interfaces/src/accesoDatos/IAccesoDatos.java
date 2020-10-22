
package accesoDatos;

/**
 *
 * @author oscar
 */
public interface IAccesoDatos {
    int MAX_REGISTROS = 10;
    
    void insertar();
    
    void listar();
    
    void actualiza();
    
    void elimina();
    
}
