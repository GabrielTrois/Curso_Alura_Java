
public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
        } catch (Exception ex) {
        	System.out.println("Exception " + ex.getMessage());
        	ex.printStackTrace();
        }
        
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MyException {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MyException {
        System.out.println("Ini do metodo2");
        
        throw new MyException("ERRO GRAVE");

        //System.out.println("Fim do metodo2");
    }
}
