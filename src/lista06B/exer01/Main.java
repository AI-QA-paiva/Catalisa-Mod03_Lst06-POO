package lista06B.exer01;

public class Main {

    public static void main(String[] args) {

        FiguraGeometrica areaFiguraQ = new Quadrado(5);
        areaFiguraQ.calculoArea();
        System.out.println();
        System.out.println("O valor da área calculada para o Quadrado é "+areaFiguraQ.getValorCalculado()+" unidade de área");


        FiguraGeometrica areaFiguraR = new Retangulo(2,3);
        areaFiguraR.calculoArea();
        System.out.println();
        System.out.println("O valor da área calculada para o Retangulo é "+areaFiguraR.getValorCalculado()+" unidade de área");


    }

}
