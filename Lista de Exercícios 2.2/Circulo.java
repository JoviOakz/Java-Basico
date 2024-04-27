public class Circulo {

    // Exercicio 5 e 6
    // Crie uma classe Circulo que obedeça à descrição abaixo:
    // • A classe possui os atributos raio, area e perímetro, todos do tipo float.
    // • O método calcularArea deve realizar o cálculo da área do retângulo (area =
    // raio * raio * 3.14).
    // Em seguida, deve escreve o valor da area na tela.
    // • O método calcularPerimetro faz o cálculo do perimetro (perimetro = 2 * 3.14
    // * raio). Em
    // seguida, deve escreve o valor do perímetro na tela.

    // F.U.P que instancie a classe Circulo do exercício anterior, criando um objeto
    // novoCirculo
    // do tipo Circulo. Depois o programa deve realizar as seguintes ações:
    // 1) Atribua o valor 10 ao atributo raio.
    // 2) Chame o método calcularArea.
    // 3) Escreva na tela o valor da área.
    // 4) Chame o método calcularPerimetro.
    // 5) Escreva na tela o valor do perímetro.
    // 6) Atribua o valor 4 ao atributo raio.
    // 7) Chame o método calcularArea.
    // 8) Escreva na tela o valor da área.
    // 9) Chame o método calcularPerimetro.
    // 10) Escreva na tela o valor do perímetro.

    private Double raio;
    private Double area;
    private Double perimetro;

    Circulo() {
        this.raio = null;
    }

    public Double getRaio() {
        return this.raio;
    }

    public void setRaio(Double raio_value) {
        this.raio = raio_value;
    }

    public void calcularArea() {
        area = raio * raio * 3.14;

        System.out.println("Area do circulo: " + area);
    }

    public void calcularPerimetro() {
        perimetro = 2 * 3.14 * raio;

        System.out.println("Perimetro do circulo: " + perimetro);
    }
}