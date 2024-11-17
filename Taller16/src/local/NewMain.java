
package local;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class NewMain {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Ejercicio 1
        // Aplicar descuento por porcentaje
        double precioOriginal = 100.0;
        Ej1_Descuento descuentoPorcentaje = new Ej1_Descuento(10);
        double precioConDescuentoPorcentaje = descuentoPorcentaje.aplicarDescuento(precioOriginal);
        System.out.println("Precio con 10% de descuento: " + precioConDescuentoPorcentaje);

        // Aplicar descuento fijo
        Ej1_DescuentoFijo descuentoFijo = new Ej1_DescuentoFijo(15);
        double precioConDescuentoFijo = descuentoFijo.aplicarDescuento(precioOriginal);
        System.out.println("Precio con descuento fijo de 15: " + precioConDescuentoFijo);
        
        //Ejercicio 2
        System.out.println("formato del documento inicial:");
        String formatoEntrada = entrada.nextLine();
        System.out.println("nombre del documento inicial:");
        String nombreDocumento = entrada.nextLine();
        Ej2_FormatoWord documento = new Ej2_FormatoWord(formatoEntrada, nombreDocumento);
        
        documento.exportar();
        
        //Ejercicio 3
        System.out.println("ingrese el numero de telefono de salida: ");
        int numTelefono = entrada.nextInt();
        entrada.nextLine();
        System.out.println("ingrese el mensaje a enviar: ");
        String mensaje = entrada.nextLine();
        System.out.println("ingrese el numero de telefono al que quiere enviar el mensaje: ");
        int numTelefonoDestino = entrada.nextInt();
        Ej3_MensajesSMS mensajeSms = new Ej3_MensajesSMS(numTelefono, numTelefonoDestino, mensaje);
        mensajeSms.enviarMensaje();
    }
}
