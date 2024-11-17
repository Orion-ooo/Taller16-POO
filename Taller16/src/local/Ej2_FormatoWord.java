
package local;

/**
 *
 * @author Daniel
 */
public class Ej2_FormatoWord extends Ej2_Documento{
    
    public Ej2_FormatoWord(String formatoEntrada, String nombreDocumento) {
        super(formatoEntrada, nombreDocumento);
    }
    
    @Override public void exportar(){
        System.out.println("exportando documento '" + nombreDocumento +"' de tipo " + formatoEntrada + " a formato Word");
        System.out.println("documento exportado con exito!");
        System.out.println(nombreDocumento + ".docx");
    }
}
