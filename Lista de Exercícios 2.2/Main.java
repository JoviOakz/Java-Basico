public abstract class Main {
    public static void main(String[] args) {

        Circulo instanciaCirculo = new Circulo("vermelho", 2);
        Retangulo instanciaRetangulo = new Retangulo("verde", 5, 3);
        Triangulo instanciaTriangulo = new Triangulo("azul", 2, 5, 7);

        // Exercicio 13 e 14
        FormaGeometrica[] formas = { instanciaCirculo, instanciaRetangulo, instanciaTriangulo };

        double perimetroTotal = 0;
        double areaTotal = 0;

        for (FormaGeometrica forma : formas) {
            System.out.println(forma.toString());
            perimetroTotal += forma.calcularPerimetro();
            areaTotal += forma.calcularArea();
        }

        System.out.println("Perimetro total: " + perimetroTotal);
        System.out.println("Area total: " + areaTotal);
    }
}