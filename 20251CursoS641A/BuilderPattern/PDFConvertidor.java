public class PDFConvertidor extends Convertidor {

    public PDFConvertidor(String document) {
        super(document);
    }

    public void makeLine() {
        System.out.println("Línea con PDFConverter");
    }

    public void makeParagraph() {
        System.out.println("Párrafo con PDFConverter");
    }

    public void makeTable() {
        System.out.println("Tabla con PDFConverter");
    }
}