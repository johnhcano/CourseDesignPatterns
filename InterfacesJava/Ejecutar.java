public class Ejecutar{
    public static void main(String[] args){

        Trabajador[] t = new Trabajador[2];

        t[0] = new Asesor(10000);
        t[1] = new Operario(10);

        for(Trabajador trabajador: t){
            System.out.println(trabajador.pagar());
        }

        /*
        * for(int i = 0; i < t.length; i++)
        */
    }
}