
package umg.edu.gt.test.ClaseArrays;
public class Ejercicio3 {
    // Suma todos los elementos de una Matriz
    public static void main(String[] args) {
        // matriz 3x3
//        int [] [] suma = {
//            {1,2,3}, 
//            {4,5,6}, 
//            {7,8,9} 
//            };
        
         int [] [] suma = {
            {10,20}, 
            {30,40}
            };
        
          System.out.print("La suma total es: "+sumaMatriz(suma));
        
        
    }
    
    
    
    
    public static int sumaMatriz(int [][] suma){
        int sumaTotal = 0;
        
        for (int renglones = 0; renglones < suma.length; renglones++) {
            
            for (int columnas = 0; columnas < suma[renglones].length; columnas++) {
                sumaTotal += suma[renglones][columnas];
            }
            
        }
        
        
        
        return sumaTotal;
    }
}
