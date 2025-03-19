
package umg.edu.gt.test.ClaseArrays;

//Diagonal de una matriz 

import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ejercicio2 {
    private static final Logger logJava = LogManager.getLogger(Ejercicio2.class);
    
        public static void main(String[] args) {
             // Mostrar 
        int [] [] matriz = new int[][]{
            {3,3,1,1},
            {2,2,1,2},
            {1,1,1,2}
        };
        
        int [][] matrizOrdenado = ordenarEnDiagonal(matriz);
        
  
        for(int [] fila : matrizOrdenado){
//            System.out.println(Arrays.toString(fila));
            logJava.debug(Arrays.toString(fila));
        }
        
    }
    
    
    public static int [][] ordenarEnDiagonal(int [] [] matriz){
        int m = matriz.length, n= matriz[0].length;
        
        //Ordenar diagonales que comienzan en la primera columna
        for (int i = 0; i < m; i++) {
            ordenarDiagonal(matriz, i, 0, m, n);
        }
        
        // Ordenar diagonales que comienzan en la primera fila
        for (int j = 0; j < n; j++) {
            ordenarDiagonal(matriz, 0, j, m, n);
        }
        
        return matriz;
    }
    
    
    private static void ordenarDiagonal(int [] [] matriz, int fila, int columna, int m, int n){
        List<Integer> diagonal = new ArrayList<>();
        int r = fila, c= columna;
        
        // Recoger los elementos en la diagonal
        while (r < m && c<n) {            
            diagonal.add(matriz[r][c]);
            r++;
            c++;
        }
        
        //Ordenar la diagonal
        Collections.sort(diagonal);
        
        // Colocar los elementos ordenados de vuelta en la matriz
        c =  columna;
        r = fila;
        int index = 0;
        while(r < m && c < n){
            matriz[r][c] = diagonal.get(index++);
            r++;
            c++;
        }
        
    }
    
}
