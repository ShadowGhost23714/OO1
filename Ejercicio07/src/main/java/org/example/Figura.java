package org.example;

public abstract class Figura {
    private double perimetro;
    private double area;

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public abstract double getPerimetro();
    public abstract double getArea();
}
