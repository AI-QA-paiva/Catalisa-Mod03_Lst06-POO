package lista06B.exer01;

public class Quadrado extends FiguraGeometrica{
    double informaLado;

    double calculoAreaQ;

    public Quadrado(double informaLado) {
        this.informaLado = informaLado;

    }

    @Override
    public void calculoArea() {
        calculoAreaQ = informaLado * informaLado;

    }

    public double getValorCalculado() {
        return calculoAreaQ;
    }


    public double getInformaLado() {
        return informaLado;
    }

    public void setInformaLado(double informaLado) {
        this.informaLado = informaLado;
    }


}
