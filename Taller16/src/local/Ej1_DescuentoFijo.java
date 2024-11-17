
package local;

/**
 *
 * @author Daniel
 */
public class Ej1_DescuentoFijo extends Ej1_Descuento{
    private double descuentoFijo;

    public Ej1_DescuentoFijo(double descuentoFijo) {
        super(0);
        this.descuentoFijo = descuentoFijo;
    }
    
    @Override public double aplicarDescuento(double precioOriginal){
        return precioOriginal - descuentoFijo;
    }
}
