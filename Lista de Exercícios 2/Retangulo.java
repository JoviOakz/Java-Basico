public class Retangulo {

    // Exercicio 3 e 4
    // Crie uma classe Retangulo que obedeça à descrição abaixo:
    // • A classe possui os atributos lado1, lado2, area e perimetro, todos do tipo
    // double.
    // • O método calcularArea deve realizar o cálculo da área do retângulo (area =
    // lado1 * lado2). Em
    // seguida, deve escreve o valor da área na tela.
    // • O método calcularPerimetro faz o cálculo do perimetro (perimetro = 2*lado1
    // + 2*lado2). Em
    // seguida, deve escreve o valor do perímetro na tela.

    // F.U.P que instancie a classe Retangulo do exercício anterior, criando um
    // objeto
    // novoRetangulo do tipo Retangulo. Depois o programa deve realizar as seguintes
    // ações:
    // 7) Atribua o valor 10 ao atributo lado1.
    // 8) Atribua o valor 5 ao atributo lado2.
    // 9) Chame o método calcularArea.
    // 10) Chame o método calcularPerimetro.
    // 11) Atribua o valor 7 ao atributo lado2.
    // 12) Chame o método calcularArea.
    // 13) Chame o método calcularPerimetro.

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

    public Double getLado1() {
        return this.lado1;
    }

    public void setLado1(Double size) {
        this.lado1 = size;
    }

    public Double getLado2() {
        return this.lado2;
    }

    public void setLado2(Double size) {
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