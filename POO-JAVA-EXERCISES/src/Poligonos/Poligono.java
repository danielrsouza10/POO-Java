package Poligonos;

public class Poligono {
    public void calcularArea() {
        System.out.println("Calculando a area do poligono");
    }

    public void desenhar() {
        for (int i = 0; i < 10; i++) {
            System.out.println("*");
        }

    }

    public void desenhar(String simb) {
        for (int i = 0; i < 10; i++){
            System.out.println(simb);
        }
    }

    public void desenhar(String simb, int n){
        for(int i=0; i<n; i++){
            System.out.println(simb);
        }
    }
}
