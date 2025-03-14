package umg.edu.gt.test.ClaseArrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ejercicio3 {
private static final Logger logJava = LogManager.getLogger(Ejercicio2.class);
    // Suma todos los elementos de una Matriz
    public static void main(String[] args) {
        // matriz 3x3
//        int [] [] suma = {
//            {1,2,3}, 
//            {4,5,6}, 
//            {7,8,9} 
//            };

        int[][] suma = {
            {10, 20},
            {30, 40}
        };

        logJava.debug("La suma total es: " + sumaMatriz(suma));

    }

    public static int sumaMatriz(int[][] suma) {
        int sumaTotal = 0;

        for (int renglones = 0; renglones < suma.length; renglones++) {

            for (int columnas = 0; columnas < suma[renglones].length; columnas++) {
                sumaTotal += suma[renglones][columnas];
            }

        }

        return sumaTotal;
    }
}
