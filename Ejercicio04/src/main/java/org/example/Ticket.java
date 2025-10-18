package org.example;

import java.time.LocalDate;
import java.util.List;

public class Ticket {
    private LocalDate fecha;
    private int cantidadDeProductos;
    private double pesoTotal;
    private double precioTotal;
    private List<Producto> productos;

    public double impuesto() {
        return precioTotal * 0.21;
    }

    public Ticket(int cantidadDeProductos, double pesoTotal, double precioTotal, List<Producto> productos) {
        fecha = LocalDate.now();
        this.cantidadDeProductos = cantidadDeProductos;
        this.pesoTotal = pesoTotal;
        this.precioTotal = precioTotal;
        this.productos = productos;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getCantidadDeProductos() {
        return cantidadDeProductos;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }
}