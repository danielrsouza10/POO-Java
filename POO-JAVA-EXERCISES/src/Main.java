import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> linguagens = new ArrayList<>();

        linguagens.add("JavaScript");
        linguagens.add("C#");
        linguagens.add("Java");

        System.out.println(linguagens);

        // passar os dados de um arraylist para um vetor

        String[] arr = new String[linguagens.size()];
        linguagens.toArray(arr);

        for (String item : arr) {
            System.out.println(item + ", ");
        }
    }
}
