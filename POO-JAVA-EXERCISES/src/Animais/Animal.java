package Animais;
public class Animal {
    //protected pode ser acessado pelos filhos
    String nome;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void comer(){
        System.out.println("Estou comendo...");
    }
}
