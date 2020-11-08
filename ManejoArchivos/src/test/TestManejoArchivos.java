package test;

import manejoarchivos.ManejoArchivos;
import static manejoarchivos.ManejoArchivos.addInformacion;
import static manejoarchivos.ManejoArchivos.crearArchivo;
import static manejoarchivos.ManejoArchivos.escribirArchivo;

/**
 *
 * @author oscar
 */
public class TestManejoArchivos {

    public static void main(String[] args) {
        var nombreArchivo = "D:\\proyectos\\java\\programacion\\archivos\\prueba2.txt";
        /*        
        crearArchivo(nombreArchivo);
        escribirArchivo(nombreArchivo, "Nuevo contenido");
        addInformacion(nombreArchivo, "Otro contenido");
        addInformacion(nombreArchivo, "Mas Contenido");
         */
        ManejoArchivos.leerArchivo(nombreArchivo);
    }

}
