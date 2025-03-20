package umg.edu.gt.test.EjerciciosLinkedList;

// elementos de ambas listas intercalados en orden.
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ejercicio3 {

    private static final Logger logJava = LogManager.getLogger(Ejercicio3.class);

    public static void main(String[] args) {
        // declarar List
        List<Integer> lista1 = new LinkedList<>();
        List<Integer> lista2 = new LinkedList<>();
        // Crear arreglos de prueba ordenadas
        int[] num1 = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 22};
        int[] num2 = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 21};

        // iterar y agragar elementos a lista1
        for (int numImpares : num1) {
            lista1.add(numImpares);
        }
        // iterar y agragar elementos a lista1
        for (int numPares : num2) {
            lista2.add(numPares);
        }

        List<Integer> listaFusionada = fusionarListasOrdenadas(lista1, lista2);
        System.out.println("");
        logJava.info("Lista intercalados final:  " + listaFusionada);
    }

    public static List<Integer> fusionarListasOrdenadas(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> listaFusionada = new LinkedList<>();
        Iterator<Integer> it1 = lista1.iterator(); // Iterador para la primera lista
        Iterator<Integer> it2 = lista2.iterator(); // Iterador para segunda lista

        // Inicializar los valores actuales de cada iterador
        Integer valor1 = it1.hasNext() ? it1.next() : null;
        Integer valor2 = it2.hasNext() ? it2.next() : null;

        logJava.info("Inicializando fusíon de listas");

        // Iterar mientras haya elementos en alguna de las dos listas
        while (valor1 != null && valor2 != null) {
            logJava.debug("Valor 1: " + valor1 + ", Valor 2: " + valor2);

            // Comparar y agregar el elemento menor a la lista fusionada
            if (valor1 != null && (valor2 == null || valor1 <= valor2)) {
                listaFusionada.add(valor1);
                logJava.debug("Agregado " + valor1 + " desde lista 1");
                valor1 = it1.hasNext() ? it1.next() : null; // avanzar en lista 1
            } else {
                listaFusionada.add(valor2);
                logJava.debug("Agregado " + valor2 + " desde lista 2");
                valor2 = it2.hasNext() ? it2.next() : null; //avanzar en lista 2
            }

        }
        
        // Agregar los elementos restantes de lista1, si los hay
        while (valor1 != null) {
            listaFusionada.add(valor1);
            logJava.debug("Agregado restante " + valor1 + " desde lista 1");
            valor1 = it1.hasNext() ? it1.next() : null;
        }

// Agregar los elementos restantes de lista2, si los hay
        while (valor2 != null) {
            listaFusionada.add(valor2);
            logJava.debug("Agregado restante " + valor2 + " desde lista 2");
            valor2 = it2.hasNext() ? it2.next() : null;
        }

        return listaFusionada;

    }
}
