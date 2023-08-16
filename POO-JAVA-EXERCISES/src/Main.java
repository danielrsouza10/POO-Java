public class Main {
    public static void main(String[] args) {

        Conta conta = new Poupanca();

        conta.depositar(1000);
        System.out.println(conta.getSaldo());
        
        conta.sacar(500);
        
        
        System.out.println(conta.getSaldo());
    }

}
