public class Autodromo{
    public static void main(String[] args) {
        Carro jeep = new Carro();

        jeep.ligar();
        jeep.setChassi("A12948271");
        
        Moto g310 = new Moto();
        g310.setChassi("B9587134");

        System.out.println(g310.getChassi());
        System.out.println(jeep.getChassi());

        g310.ligar();
    }
}
