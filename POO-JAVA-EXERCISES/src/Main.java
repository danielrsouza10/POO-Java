public class Main {
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa();

        p.nome = "Daniel";
        // p.comissao = 200.1; Comissao é exclusivo da classa Vendedor

        Vendedor v = new Vendedor();
        //Nome é herdado pela classe Vendedor por meio da herança da classe Pessoa
        v.nome = "Mariana";
        v.comissao = 900.1;
    }

}
