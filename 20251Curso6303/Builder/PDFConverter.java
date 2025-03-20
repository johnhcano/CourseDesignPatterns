public class PDFConverter extends Converter {
    
    public PDFConverter(String document){
        super(document);    
    }

    public void makeLine() {
        System.out.println("Línea con PDF");
    }

    public void makeParagraph() {
        System.out.println("Párrafo con PDF");
    }

    public void makeTable() {
        System.out.println("Tabla con PDF");
    }

}
