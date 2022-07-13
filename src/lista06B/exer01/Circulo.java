package lista06B.exer01;

public class Circulo extends FiguraGeometrica{

    double raio;

    double calculoAreaC;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calculoArea() {
        calculoAreaC = (raio*raio)*3.14159;
    }

    public double getValorCalculado() {
        return calculoAreaC;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
