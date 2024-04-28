public class Circulo extends FormaGeometrica {

    private float raio;

    Circulo(String cor, float raio) {
        this.cor = cor;
        this.raio = 0;
    }

    public float getRaio() {
        return this.raio;
    }

    public void setRaio(float raio_value) {
        this.raio = raio_value;
    }

    public float calcularArea() {
        float area = (float) 3.14 * raio * raio;

        return area;
    }

    public float calcularPerimetro() {
        float perimetro = 2 * (float) 3.14 * raio;

        return perimetro;
    }

    public String toString() {
        return "Circulo de cor " + this.cor + " e raio " + this.raio;
    }
}