import Poligonos.Circulo;
import Poligonos.Poligono;
import Poligonos.Quadrado;

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();
        Poligono poligono = new Poligono();

        circulo.calcularArea();
        quadrado.calcularArea();
        poligono.calcularArea();
    }
}
