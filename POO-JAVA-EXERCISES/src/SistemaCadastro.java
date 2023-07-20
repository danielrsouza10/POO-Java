public class SistemaCadastro {

public static void main(String[] args) {
        Pessoa daniel = new Pessoa("006039991-07", "Daniel");
        daniel.setEndereco("Rua R-16"); 

        System.out.println(daniel.getNome() + daniel.getCpf() + daniel.getEndereco());
}



}
