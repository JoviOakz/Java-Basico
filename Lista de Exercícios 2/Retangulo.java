public class Retangulo {

    // Exercicio 3
    // Crie uma classe Retangulo que obedeça à descrição abaixo:
    // • A classe possui os atributos lado1, lado2, area e perimetro, todos do tipo
    // double.
    // • O método calcularArea deve realizar o cálculo da área do retângulo (area =
    // lado1 * lado2). Em
    // seguida, deve escreve o valor da área na tela.
    // • O método calcularPerimetro faz o cálculo do perimetro (perimetro = 2*lado1
    // + 2*lado2). Em
    // seguida, deve escreve o valor do perímetro na tela.

    private Double lado1;
    private Double lado2;
    private Double area;
    private Double perimetro;

    Retangulo(Double lado1, Double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    Retangulo() {
        this.lado1 = null;
        this.lado2 = null;
    }

    public Double getLado1(){
        return this.lado1;
    }

    public void setLado1(Double size){
        this.lado1 = size;
    }

    public Double getLado2(){
        return this.lado2;
    }

    public void setLado2(Double size){
        this.lado2 = size;
    }

    public Double calcularArea() {
        area = lado1 * lado2;

        return area;
    }

    public Double calcularPerimetro() {
        perimetro = (2 * lado1) + (2 * lado2);

        return perimetro;
    }
}