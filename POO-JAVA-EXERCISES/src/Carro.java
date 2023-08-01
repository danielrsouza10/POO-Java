public class Carro extends Veiculo{

    

    public void ligar(){
        confereCambio();
        conferindoCombustivel();
        System.out.println("Carro ligado!");
    }

    private void conferindoCombustivel(){
        System.out.println("Conferindo Combustível...");
    }

    private void confereCambio(){
        System.out.println("Confere cambio em P");
    }

}
