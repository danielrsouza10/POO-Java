package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        
        Cozinheiro cozinheiro = new Cozinheiro();
        cozinheiro.lavarIngredientes();

        Almoxarife almoxarife = new Almoxarife();
        almoxarife.controlarEntrada();

        Atendente atendente = new Atendente();
        atendente.pegarLancheCozinha();

        Cliente cliente = new Cliente();
        cliente.fazerPedido();
    }
}
