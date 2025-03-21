public class EjecutarBuilderPattern {

    public static void main(String[] args) {
        
        //Creación de los objetos
        Convertidor objDocumento1 = new ASCIIConvertidor("La Iliada");
        Convertidor objDocumento2 = new PostScriptConvertidor("La Iliada");
        Convertidor objDocumento3 = new PDFConvertidor("La Iliada");

        Lector objLector1 = new Lector("LINE", objDocumento1);
        Lector objLector2 = new Lector("PARAGRAPH", objDocumento2);
        Lector objLector3 = new Lector("TABLE", objDocumento3);
        Lector objLector4 = new Lector("TABLE", objDocumento1);

        objLector1.parseInput();
        objLector2.parseInput();
        objLector3.parseInput();
        objLector4.parseInput();

    }
}