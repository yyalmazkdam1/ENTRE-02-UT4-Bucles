import java.util.Random;
/**
 *    @author - Yumurdzhan Yalmaz
 */
public class DemoBucles
{
    private final char ASTERISCO = '*';
    private final char ESPACIO = ' ';
    private Random generador;
    /**
     * Constructor  
     */
    public DemoBucles()
    {
        generador = new Random();
    }

    /**
     * Calcular la mayor potencia de 2 que es menor o igual a numero
     * Asumimos numero > 0
     * 
     * Si numero = 7 devuelve 4             numero = 8 devuelve 8
     *    numero = 19 devuelve 16           numero = 32 devuelve 32
     *    numero = 74 devuelve 64           numero = 1 devuelve 1
     *    numero = 190 devuelve 128
     *    
     *  Usa bucles while
     */
    public int mayorPotencia2(int numero) {
        int valor = 2;
        while (valor * 2 < numero) {
            valor *= 2;
        }
        return valor;
    }

    /**
     * Escribir numero como suma de potencias de 2 
     * tal como indica el enunciado (Se asume numero > 0)
     * 
     * Todos los valores se muestran en pantalla fomateados a 6 posiciones 
     * y ajustados a la derecha
     * 
     * Hay que usar el método anterior - 
     * Utiliza bucles while
     * 
     *  77 =    64     8     4     1
     * 215 =   128    64    16     4     2     1
     *  18 =    16     2
     *  64 =    64
     */
    public void escribirSumaPotencias(int numero) {
         while (numero > 0) {
            System.out.println(String.format("%6d=",numero));
         }
         while (numero > 0) {
            System.out.println(String.format("%6d",mayorPotencia2(numero)));
            numero -= mayorPotencia2(numero);
         }
         System.out.println();      
        }
    

    /**
     * Generar aleatorios entre 0 y 255
     * y escribir cada aleatorio como suma de potencias de 2
     * Parar al salir el 255 o despues de generar n aleatorios
     * (ver enunciado)
     * 
     * Hay que usar el método anterior
     * 
     * Utiliza bucles while
     * 
     */
    public void generarAleatorios(int n) {
        
        // int aleatorio = generador.nextInt(255);
        // int contador = 1;
        // while (contador <= n && aleatorio!= 0) {
        // System.out.print(String.format("%6d |", aleatorio));
        // int factor = 2;
        // int aux = aleatorio;
        // while (factor * 2 < aux) {
        // factor *= 2;
        // if (aux % factor == 0)
        // }
        // }
        // System.out.println();

        // contador++;
        // }
    }

    /**
         *  Escribe en pantalla caracter n veces en la misma línes
         *  
         *  Usa bucles for
         */
        public void escribirCaracter(int n, char caracter)
        {
        for (int fila = 1; fila <= n; fila++)    {
            for (int col = 1; col <= n; col++)    {
                System.out.print(String.format("%2c", caracter));
            }
            System.out.println();
        }
    }

    /**
     *  Genera la figura tal como muestra el enunciado 
     *  con ayuda del método anterior
     *  
     *   Usa bucles for
     */
    public  void mostrarEscalera(int escalones, int alto, int ancho) {
        for (int esca = 1; esca <= escalones; esca++) {
            for (int altura = 1; altura <= alto; altura++){
                for (int anchura = 1; anchura <= ancho; anchura++){
                    System.out.print(String.format("%2c",ASTERISCO));

                }
                System.out.println(ESPACIO);
            }

        }

    }
}

