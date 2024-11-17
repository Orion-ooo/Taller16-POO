
package local;

/**
 *
 * @author Daniel
 */
public class Ej3_MensajesSMS extends Ej3_Mensajero{
    private int numTelefono;
    private int numTelefonoDestino;

    public Ej3_MensajesSMS(int numTelefono, int numTelefonoDestino, String mensaje) {
        super(mensaje);
        this.numTelefono = numTelefono;
        this.numTelefonoDestino = numTelefonoDestino;
    }
    
    @Override public void enviarMensaje(){
        System.out.println("Numero de salida: " + numTelefono);
        System.out.println("mensaje: " + mensaje);
        System.out.println("Numero de destino: " + numTelefonoDestino);
    }
}
