public class Triangulo extends FormaGeometrica {

    private float lado1;
    private float lado2;
    private float lado3;

    Triangulo(String cor, float lado1, float lado2, float lado3) {
        super(cor);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public float getLado1() {
        return this.lado1;
    }

    public void setLado1(float new_lado1) {
        this.lado1 = new_lado1;
    }

    public float getLado2() {
        return this.lado2;
    }

    public void setLado2(float new_lado2) {
        this.lado2 = new_lado2;
    }

    public float getLado3() {
        return this.lado3;
    }

    public void setLado3(float new_lado3) {
        this.lado3 = new_lado3;
    }

    @Override
    public float calcularArea() {
        float perimetro = calcularPerimetro();
        double area = Math.sqrt(perimetro * (perimetro - lado1) * (perimetro - lado2) * (perimetro - lado3));

        return (float) area;
    }

    @Override
    public float calcularPerimetro() {
        float perimetro = lado1 + lado2 + lado3;

        return perimetro;
    }

    public String toString() {
        return "Triangulo de cor " + this.cor + ", lado1 " + this.lado1 + ", lado2 " + this.lado2 + " e lado3 " + this.lado3;
    }
}