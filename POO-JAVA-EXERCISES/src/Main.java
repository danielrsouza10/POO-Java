public class Main {
    public static void main(String[] args) {
        
      Conta conta = new Poupanca();

      conta.imprimeExtrato();
      conta.setSaldo(10);
      System.out.println(conta.getSaldo());
    }

}
