package org.example;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
    private int cantidadDeProductos = 0;
    private double precioTotal = 0;
    private double pesoTotal = 0;
    private List<Producto> productos;

    public void ponerEnCero () {
        cantidadDeProductos = 0;
        precioTotal = 0;
        pesoTotal = 0;
        productos = new ArrayList<>();
    }

    public void agregarProducto (Producto producto) {
        cantidadDeProductos++;
        precioTotal += producto.getPrecio();
        pesoTotal += producto.getPeso();
        productos.add(producto);
    }

    public Ticket emitirTicket () {
        return new Ticket(cantidadDeProductos, pesoTotal, precioTotal, new ArrayList<>(productos));
    }

    public List<Producto> getProductos () {
        return productos;
    }

    public Balanza() {
        this.ponerEnCero();
    }

    public int getCantidadDeProductos() {
        return cantidadDeProductos;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }


}
