public class ASCIIConvertidor extends Convertidor {

    public ASCIIConvertidor(String document){
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