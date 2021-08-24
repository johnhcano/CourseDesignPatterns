public class App {
    public static void main(String[] args) {
        
        Converter ascii = new ASCIIConverter("Documento ASCII");
        Converter postscript = new PostScriptConverter("Documento PostScript");
        Converter pdf = new PDFConverter("Documento PDF");

        //Reader lector = new Reader("PARRAFO", ascii);

        Reader[] lectores = new Reader[5];

        lectores[0] = new Reader("PARRAFO", ascii);
        lectores[1] = new Reader("LINEA", postscript);
        lectores[2] = new Reader("TABLA", pdf);
        lectores[3] = new Reader("LINEA", pdf);
        lectores[4] = new Reader("LISTA", ascii);

        for(Reader r: lectores){
            r.parseInput();
        }

        System.out.println("---------------");

        for(int i = 0; i < lectores.length; i++){
            lectores[i].parseInput();
        }
    
    }
}
