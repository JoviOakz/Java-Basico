public class Retangulo extends FormaGeometrica {

    private float largura;
    private float altura;

    Retangulo(String cor, float largura, float altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    public float getLargura() {
        return this.largura;
    }

    public void setLargura(float new_largura) {
        this.largura = new_largura;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float new_altura) {
        this.altura = new_altura;
    }

    @Override
    public float calcularArea() {
        float area = largura * altura;

        return area;
    }

    @Override
    public float calcularPerimetro() {
        float perimetro = (2 * largura) + (2 * altura);

        return perimetro;
    }

    public String toString() {
        return "Retangulo de cor " + this.cor + ", largura " + this.largura + " e altura " + this.altura;
    }
}