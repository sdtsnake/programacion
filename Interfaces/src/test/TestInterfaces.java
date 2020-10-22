
package test;

import accesoDatos.IAccesoDatos;
import accesoDatos.ImplementacionMysql;
import accesoDatos.ImplementacionOracle;

/**
 *
 * @author oscar
 */
public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMysql();
        datos.listar();
        
        datos = new ImplementacionOracle();
        datos.listar();
        
    }
    
}
