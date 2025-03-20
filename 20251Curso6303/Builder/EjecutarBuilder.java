public class EjecutarBuilder {
    public static void main(String[] args) {
        
        Converter objConverter1 = new ASCIIConverter("La Iliada");
        
        Converter objConverter2 = new PDFConverter("Mi otro yo");

        Reader objReader1 = new Reader("LINE", objConverter1);

        Reader objReader2 = new Reader("PARAGRAPH", objConverter2);
        
        objReader1.parseInput();
 
    }
    
}
