public class PostScriptConvertidor extends Convertidor {

    public PostScriptConvertidor(String document) {
        super(document);
    }

    public void makeLine() {
        System.out.println("Línea con PostScriptConverter");
    }

    public void makeParagraph() {
        System.out.println("Párrafo con PostScriptConverter");
    }

    public void makeTable() {
        System.out.println("Tabla con PostScriptConverter");
    }
}