package umg.edu.gt.test.EjerciciosLinkedList;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Eliminar valores duplicados
public class Ejercicio1 {

    private static final Logger logJava = LogManager.getLogger(Ejercicio1.class);

    public static void main(String[] args) {
        List<Integer> valoresDuplicados = new LinkedList<>();
        int[] numeros = new int[]{1, 2, 3, 4, 2, 3, 4, 5, 6, 2, 3, 7, 8, 10, 11, 11, 11, 11, 12, 13, 14, 15, 16, 16, 17, 18, 19, 20, 20};

        //agregar elementos del array a lista
        for (int num = 0; num < numeros.length; num++) {
            valoresDuplicados.add(numeros[num]);

        }

        logJava.debug("***Ejercicio 1***\n");

        logJava.info("Lista original: " + valoresDuplicados);

        eliminarDuplicados(valoresDuplicados);

        List<Integer> sinDuplicados = valoresDuplicados;
        logJava.info("Lista sin duplicados: " + sinDuplicados);

    }

    public static void eliminarDuplicados(List<Integer> lista) {
        HashSet<Integer> set = new HashSet<>(); //almacena los números únicos
        for (int i = 0; i < lista.size(); i++) {
            if (!set.add(lista.get(i))) { // Si el num ya está en el HashSet, es duplicado
                lista.remove(i); //Eliminar duplicado
                i--; // Retrocedemos el índice para no saltarnos elementos
            }
        }
    }

}
