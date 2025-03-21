public class ASCIIConverter extends Converter {

    public ASCIIConverter(String document) {
        super(document);
    }

    public void makeLine() {
        System.out.println("Línea con ASCIIConverter");
    }

    public void makeParagraph() {
        System.out.println("Párrafo con ASCIIConverter");
    }

    public void makeTable() {
        System.out.println("Tabla con ASCIIConverter");
    }
}