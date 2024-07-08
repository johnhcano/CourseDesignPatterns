public class TelefonoInteligenteFactory {
    
    public TelefonoInteligenteFactory(){}
    
    public TelefonoInteligente crearTelefonoInteligente(String cad){
        TelefonoInteligente ti = null;
        if("Sony".equalsIgnoreCase(cad)){
            ti = new Sony();
            System.out.println("Teléfono Sony Creado...");
        }else{
            ti = new Iphone();
            System.out.println("Teléfono Iphone Creado...");
        }
        return ti;
    }
}