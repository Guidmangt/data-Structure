package umg.edu.gt.test.EjerciciosLinkedList;

import java.util.LinkedList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//  invierta los elementos de una LinkedList<String>  sin usar otra lista o ArrayList.
public class Ejercicio2 {
private static final Logger logJava = LogManager.getLogger(Ejercicio2.class);

    public static void invertirElementos(List<String> lista) {
        int izquierda = 0;
        int derecha = lista.size() - 1;
        
        while (izquierda < derecha) {            
            // Intercambiar los elementos en los índices izquierda y derecha
            String temporal = lista.get(izquierda);
            lista.set(izquierda, lista.get(derecha)); // Valor "0" se reemplaza con valor "25"
            lista.set(derecha, temporal); // valor "25" se reemplaza con valor "0"
            
            //  Movemos los índices hacia el centro
            izquierda++;
            derecha--;
        }
    }

    
    public static void main(String[] args) {
        List<String> nombres = new LinkedList<>();
        String[] personasAZ = {"Andrés", "Brenda", "Carlos", "Diana", "Esteban", "Fabiola",
            "Gustavo", "Hilda", "Ignacio", "Juan", "Karen", "Luis", "Mariana", "Nicolás",
            "Olga", "Pedro", "Quetzali", "Ramiro", "Sofía", "Tomás", "Ulises", "Valentina",
            "Wilson", "Ximena", "Yolanda", "Zacarías"};

        logJava.info("***Nombres de la A-Z***");
        for (int i = 0; i < personasAZ.length; i++) {
            nombres.add(personasAZ[i]);
        }

        logJava.debug("Lista Original:  " + nombres);
        
        
        invertirElementos(nombres);
        logJava.debug("Lista Invertida: "+nombres);

    }

}
