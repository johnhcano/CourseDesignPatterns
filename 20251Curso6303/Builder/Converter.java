public class Converter {

    private String document;

    public Converter(String document){
        this.document = document;
    }

    public void makeLine() {
        System.out.println();
    }

    public void makeParagraph() {
        System.out.println();
    }

    public void makeTable() {
        System.out.println();
    }

    public String getDocument(){
        return document;
    }

}