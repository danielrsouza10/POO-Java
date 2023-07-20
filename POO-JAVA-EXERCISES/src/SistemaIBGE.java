public class SistemaIBGE {
    public static void main(String[] args) {
        for(EstadoBrasileiro estado: EstadoBrasileiro.values()){
            System.out.println(estado.getSigla() + " " + estado.getNome() + " " + estado.getNomeMaiusculo());
        }

        EstadoBrasileiro eb = EstadoBrasileiro.TOCANTINS;

        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
    }
}
