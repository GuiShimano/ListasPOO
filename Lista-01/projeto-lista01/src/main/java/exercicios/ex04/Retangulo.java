package exercicios.ex04;

public class Retangulo {
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea(){
        return this.base * this.altura;
    }

    public double calcularPerimetro(){
        return this.base * 2 + this.altura * 2;
    }
}
