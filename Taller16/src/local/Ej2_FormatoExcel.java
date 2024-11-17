
package local;

/**
 *
 * @author Daniel
 */
public class Ej2_FormatoExcel extends Ej2_Documento{
    
    public Ej2_FormatoExcel(String formatoEntrada, String nombreDocumento) {
        super(formatoEntrada, nombreDocumento);
    }
    
    @Override public void exportar(){
        System.out.println("exportando documento '" + nombreDocumento +"' de tipo " + formatoEntrada + " a formato Excel");
        System.out.println("documento exportado con exito!");
        System.out.println(nombreDocumento + ".xlsx");
    }
}
