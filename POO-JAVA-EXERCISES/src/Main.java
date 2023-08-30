import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(2);

        System.out.println(numeros);

        // Criando uma instancia de Iterator

        Iterator<Integer> it = numeros.iterator();

        int numero = it.next();

        System.out.println(numero);

        while (it.hasNext()) {
            it.forEachRemaining((value) -> System.out.print(value + ", "));
        }
    }
}
