package test;

import java.util.*;

/**
 *
 * @author oscar
 */
public class TestColeccionesGenericas {

    public static void main(String[] args) {
        // respeta el orden y guarda duplicados
        List<String> miLista = new ArrayList<>();
        miLista.add("Lines");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
        String elemento = miLista.get(0);
        //<System.out.println("elemento = " + elemento);
        
        //imprimir(miLista);

        // no se peuden repetir elemento y no repeta el orden de insercion 
        Set <String>miSet = new HashSet<>();
        miSet.add("lunes");
        miSet.add("martes");
        miSet.add("miercoles");
        miSet.add("jueves");
        miSet.add("viernes");
        miSet.add("viernes");
        //imprimir(miSet);    
        
        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("Valor1", "Juan");
        miMapa.put("Valor2", "Karla");
        miMapa.put("Valor3", "Rosario");
        
        String elementoMapa = miMapa.get("Valor1");
        //System.out.println("elemento mapa = " + elementoMapa);
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
        
        

    }

    public static void imprimir(Collection<String> coleccion) {
        for (String elemento : coleccion) {
            System.out.println("elemento = " + elemento);

        }

        coleccion.forEach(elemento -> {
            System.out.println("elemento flecha = " + elemento);
        });
    }

}
