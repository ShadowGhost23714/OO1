package org.example;

public class Circulo extends Figura{
    private double radio;
    private double diametro;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return radio * 2;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getPerimetro() {
        return Math.PI * getDiametro();
    }

    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

}
