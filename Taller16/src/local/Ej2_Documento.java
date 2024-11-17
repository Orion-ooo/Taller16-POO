
package local;

/**
 *
 * @author Daniel
 */
public  class Ej2_Documento {
    protected String formatoEntrada;
    protected String nombreDocumento;

    public Ej2_Documento(String formatoEntrada, String nombreDocumento) {
        this.formatoEntrada = formatoEntrada;
        this.nombreDocumento = nombreDocumento;
    }
    
    public void exportar(){
        System.out.println("exportando documento '" + nombreDocumento +"' de tipo " + formatoEntrada + " a formato PDF");
        System.out.println("documento exportado con exito!");
        System.out.println(nombreDocumento + ".pdf");
    }
}
