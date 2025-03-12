package umg.edu.gt.test.ClaseArrays;

public class Ejercicio1 {

    //La riqueza del cliente más rico
    
    public static void main(String[] args) {
//        int [] [] cuentas = new int[][]{
//            {1,2,3},
//            {3,2,1}
//            };

//  int [] [] cuentas = new int[][]{{1,5},{7,3},{3,5}};
//Entrada
  int [] [] cuentas = new int[][]{{2,8,7},{7,1,3},{1,9,5}};
        
          int resultado =   riquezaMaxima(cuentas);
          System.out.println("La riqueza del cliente más rico es: "+resultado);
        
        

        
    }
    
    
    public static int riquezaMaxima(int [] [] cuentas){
        int riquezaMaxima = 0;
        
        //recorrer cada cliente
        for (int i = 0; i < cuentas.length; i++) {
            int suma = 0;
            
            //suma todas las cuentas del cliente
            for (int j = 0; j < cuentas[i].length; j++) {
                suma += cuentas[i][j];
            }
            
            //actualizar riqueza maxima
          if(suma>riquezaMaxima){
              riquezaMaxima = suma;
          }
          
        }

        
        
        return  riquezaMaxima;
    }

}
