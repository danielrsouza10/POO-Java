public class Pedido {
    private Itens i;

    public Pedido(int quantidade){
        //Composição: instanciando um objeto dentro de outro
        i = new Itens();
        this.i.quantidade = quantidade;
    }

    public int getItens(){
        return this.i.quantidade;
    }
}
