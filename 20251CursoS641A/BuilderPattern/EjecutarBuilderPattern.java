public class EjecutarBuilderPattern {

    public static void main(String[] args) {
        
        //Creación de los objetos
        Converter objDocumento1 = new ASCIIConverter("La Iliada");
        Converter objDocumento2 = new PostScriptConverter("La Iliada");
        Converter objDocumento3 = new PDFConverter("La Iliada");

        Reader objLector1 = new Reader("LINE", objDocumento1);
        Reader objLector2 = new Reader("PARAGRAPH", objDocumento2);
        Reader objLector3 = new Reader("TABLE", objDocumento3);
        Reader objLector4 = new Reader("TABLE", objDocumento1);

        objLector1.parseInput();
        objLector2.parseInput();
        objLector3.parseInput();
        objLector4.parseInput();

    }
}