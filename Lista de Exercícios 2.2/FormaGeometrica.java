public abstract class FormaGeometrica {

    // Exercicio 13 e 14
    // : Crie as classes FormaGeometrica (abstrata), Circulo, Retângulo e Triangulo
    // conforme o
    // diagrama de classes (UML) abaixo:
    // a) A classe FormaGeometrica é abstrata e contém a propriedade cor
    // b) As classes Circulo, Retangulo e Triangulo são conscretas e herdeiras da
    // classe
    // FormaGeometrica
    // c) As classes filhas devem sobrescrever os métodos calcularArea() e
    // calcularPerimetro()
    // conforme abaixo:
    // i. Perímetro e área do círculo: P = 2*pi*raio; A = pi*raio*raio
    // ii. Perímetro e área do retângulo: P = 2*largura + 2*altura; A =
    // largura*altura
    // iii. Perímetro e área do triângulo: P = lado1+lado2+lado3; A = use a fórmula
    // Heron
    // (https://mundoeducacao.uol.com.br/matematica/formula-heron.htm)
    // d) As classes filhas devem sobrescrever o método toString() da seguinte
    // forme:
    // i. Círculo: “Circulo de cor <cor> e raio <raio>”
    // ii. Retângulo: “Retângulo de cor <cor>, largura <largura> e altura <altura>”
    // iii. Triângulo: “Triângulo de cor <cor>, lado1 <lado1>, lado2 <lado2> e lado3
    // <lado3>”

    // F.U.P que instancie as classes do exercício anterior da seguinte maneira:
    // 1. Crie uma instancia da classe Circulo com a cor “vermelho”, raio = 2 e
    // guarde em uma variável
    // chamada instanciaCirculo
    // 2. Crie uma instancia da classe Retangulo com a cor “verde”, largura = 5,
    // altura = 3 e guarde em
    // uma variável chamada instanciaRetangulo
    // 3. Crie uma instancia da classe Triangulo com a cor “azul”, lado1 = 2, lado2
    // = 5, lado3 = 7 e
    // guarde em uma variável chamada instanciaTriangulo
    // 4. Guarde as formas em um vetor do tipo FormaGeometrica[]
    // 5. Use um loop para:
    // a. Mostrar as formas usando o método toString()
    // b. Calcular o perímetro total (soma de todos os perímetros das formas)
    // c. Calcular a área total (soma de todas as áreas das formas)

    protected String cor;

    FormaGeometrica(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String new_cor) {
        this.cor = new_cor;
    }

    public abstract float calcularArea();
    public abstract float calcularPerimetro();
}