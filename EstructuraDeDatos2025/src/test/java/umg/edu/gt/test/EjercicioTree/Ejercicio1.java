package umg.edu.gt.test.EjercicioTree;

// Análisis de Frecuencia de Palabras (TreeMap) - ContadorPalabras
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Ejercicio1 {

    public static void main(String[] args) {

        String nombreArchivo = "palabras.txt";

        Map<String, Integer> frecuenciaPalabras = new TreeMap<>();

        System.out.println("Palabras con su frecuencia de veces que aparece: \n");
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;

            // Leer línea por línea el archivo
            while ((linea = br.readLine()) != null) {
                // Convertir la línea a minúsculas y eliminar puntuación usando regex
                linea = linea.toLowerCase().replaceAll("[^a-záéíóúüñ0-9\\s]", "");

                // Dividir la línea en palabras
                String[] palabras = linea.split("\\s+");

                // Contar cada palabra
                for (String palabra : palabras) {
                    if (!palabra.isEmpty()) {
                        // Si la palabra ya existe, incrementar su contador
                        frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
                    }
                }
            }

            // Imprimir las palabras ordenadas alfabéticamente junto con su frecuencia
            System.out.println("Clave   " + " Valor");
            for (Map.Entry<String, Integer> entrada : frecuenciaPalabras.entrySet()) {
                System.out.println(entrada.getKey() + ": " + entrada.getValue());
            }

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
