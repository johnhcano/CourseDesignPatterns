public class FactoryTest {
    
    public static void main (String[] args){
        
        TelefonoInteligenteFactory factory = new TelefonoInteligenteFactory();
        Sony sony = (Sony) factory.crearTelefonoInteligente("Sony");
        sony.bateria();
        Iphone iphone = (Iphone) factory.crearTelefonoInteligente("Iphone");
        iphone.costo();
    }
}