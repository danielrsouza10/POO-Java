abstract class Conta {
    private double saldo;

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    //fica a cargo das outras classes a implementação do método imprimeExtrato()
    public abstract void imprimeExtrato();
}
