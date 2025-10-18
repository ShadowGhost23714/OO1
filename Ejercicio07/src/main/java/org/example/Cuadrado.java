package org.example;

public class Cuadrado extends Figura{
    private double lado;
    private double perimetro;
    private double area;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getPerimetro() {
        return lado * 4;
    }

    public double getArea() {
        return lado * lado;
    }

}
