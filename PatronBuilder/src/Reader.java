public class Reader {
    
    private String element;
    private Converter converter;
    
    public Reader(String element, Converter converter) {
        this.element = element;
        this.converter = converter;
    }

    public void parseInput(){
        switch(element){
            case "PARRAFO":
                System.out.println(converter.makeParagraph());
                break;
            case "LINEA":
                System.out.println(converter.makeLine());
                break;
            case "TABLA":
                System.out.println(converter.makeTable());
                break;
            default: 
                System.out.println("Elemento incorrecto");
                break;
        }
    }
}
