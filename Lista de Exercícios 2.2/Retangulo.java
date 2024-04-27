public class Retangulo {

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