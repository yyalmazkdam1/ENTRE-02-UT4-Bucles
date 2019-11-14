import java.util.Scanner;
/**
 *  @author - Yumurdzhan Yalmaz
 *  
 * Incluye todo el código dentro del main()
 * No declares ningún nuevo método en esta clase ni atributos
 *  
 */
public class AppDemoBucles
{

    /**
     *  Punto de entrada a la aplicación. Dentro del main:
     *  - define y crea el teclado  
     *  - define e instancia un objeto DemoBucles
     *  - pide la cantidad tope  máxima de aleatorios a generar
     *  - valida que ese tope esté entre 10 y 15
     *  - muestra los números generados como suma de potencias de 2
     *  
     *  - haz una pausa y borra la pantalla 
     *  
     *  - muestra la figura para 6 escalones de alto = 4 y ancho = 12
     *  
     *  
     */
    public static void main(String[] args)
    {
         Scanner teclado = new Scanner(System.in);
        DemoBucles demo = new DemoBucles();
        System.out.print("Teclee tope de aleatorios a generar: ");
        int tope = teclado.nextInt();
        while (tope < 5 || tope > 15) {
            System.out.print("Error, Teclee tope de aleatorios a generar: ");
            tope = teclado.nextInt();
        }
        System.out.println();
        demo.escribirSumaPotencias(tope);
        Utilidades.hacerPausa();
        Utilidades.borrarPantalla();
        demo.mostrarEscalera(6,4,12);
    }
}

