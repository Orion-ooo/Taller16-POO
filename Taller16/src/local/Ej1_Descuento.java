
package local;

/**
 *
 * @author Daniel
 */
public class Ej1_Descuento {
    private double porcentaje;

    public Ej1_Descuento(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    public double aplicarDescuento(double precioOriginal){
        return precioOriginal - (precioOriginal * (porcentaje / 100));
    }
}
