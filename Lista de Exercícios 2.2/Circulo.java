public class Circulo {

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