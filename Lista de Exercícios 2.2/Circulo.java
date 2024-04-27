public class Circulo extends FormaGeometrica {

    private Float raio;
    private Float area;
    private Float perimetro;

    Circulo(String cor, float raio) {
        this.cor = cor;
        this.raio = null;
    }

    public Float getRaio() {
        return this.raio;
    }

    public void setRaio(Float raio_value) {
        this.raio = raio_value;
    }

    public float calcularArea() {
        area = (float) 3.14 * raio * raio;

        return area;
    }

    public float calcularPerimetro() {
        perimetro = 2 * (float) 3.14 * raio;

        return perimetro;
    }

    public String toString() {
        return "Circulo de cor " + this.cor + " e raio " + this.raio;
    }
}