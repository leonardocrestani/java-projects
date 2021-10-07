
public class FluxoComTratamento {
    
    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try {
            metodo1();
        }
        catch(Exception ex) {
            String mensagem = ex.getMessage();
            System.out.println("Excecao " + mensagem);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }
    
    private static void metodo1() {
        System.out.println("Inicio do metodo 1");
        metodo2();
        System.out.println("Fim do metodo 2");
    }
    
    private static void metodo2() {
        System.out.println("Inicio do metodo 2");
        throw new MinhaExcecao("Deu muito errado");
        //System.out.println("Fim do metodo 2");
    }
    
}
