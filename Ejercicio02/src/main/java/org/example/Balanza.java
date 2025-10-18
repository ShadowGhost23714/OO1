package org.example;

public class Balanza {
    private int cantidadDeProductos = 0;
    private double precioTotal = 0;
    private double pesoTotal = 0;

    public void ponerEnCero () {
        cantidadDeProductos = 0;
        precioTotal = 0;
        pesoTotal = 0;
    }

    public void agregarProducto (Producto producto) {
        cantidadDeProductos++;
        precioTotal += producto.getPrecio();
        pesoTotal += producto.getPeso();
    }

    public Ticket emitirTicket () {
        Ticket ticket = new Ticket(cantidadDeProductos, pesoTotal, precioTotal);
        return ticket;
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
