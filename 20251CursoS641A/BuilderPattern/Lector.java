public class Lector {

    private String element;
    private Convertidor convertidor;

    public Lector(String element, Convertidor convertidor){
        this.element = element;
        this.convertidor = convertidor;
    }

    public void parseInput(){
        switch(element){
            case "LINE": 
                convertidor.makeLine();
                break;
            case "PARAGRAPH":
                convertidor.makeParagraph();
                break;
            case "TABLE":
                convertidor.makeTable();
                break;
            default:
                System.out.println("Opción inválida....");
                break;
        }
        
    }
}