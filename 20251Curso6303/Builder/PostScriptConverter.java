public class PostScriptConverter extends Converter{
    
    public PostScriptConverter(String document){
        super(document);    
    }

    public void makeLine() {
        System.out.println("Línea con PostScript");
    }

    public void makeParagraph() {
        System.out.println("Párrafo con PostScript");
    }

    public void makeTable() {
        System.out.println("Tabla con PostScript");
    }

}
