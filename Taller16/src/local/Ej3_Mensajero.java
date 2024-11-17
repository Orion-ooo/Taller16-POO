
package local;

/**
 *
 * @author Daniel
 */
public class Ej3_Mensajero {
    protected String emailUsuario;
    protected String emailDestino;
    protected String mensaje;

    public Ej3_Mensajero(String mensaje) {
        this.mensaje = mensaje;
    }
    
    public void enviarMensaje(){
        System.out.println("Enviando mensaje de " + emailUsuario);
        System.out.println("mensaje: " + mensaje);
        System.out.println("usuario destino: " + emailDestino);
    }
}
