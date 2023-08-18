import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;

public class Main {
    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Silvio");
        cachorro.mostrar();
        System.out.println(cachorro.getNome());
        //Consigo utilizar métodos nos filhos que são herdados do pai
        cachorro.comer();

        Gato gato = new Gato();
        gato.setNome("Netflix");
        System.out.println(gato.getNome());
        gato.mostrar();
        

        Animal animal = new Animal();
        animal.setNome("Animal genérico");
        System.out.println(animal.getNome());
        animal.comer();
        

        //Não consigo utilizar métodos dos filhos nos pais pois os pais não herdam métodos dos filhos
        //animal.mostrar();
    }
       

}
