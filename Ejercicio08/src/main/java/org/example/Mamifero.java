package org.example;

import java.util.Date;

public class Mamifero {
    private String identificador;
    private String especie;
    private Date fechaNaciemiento;
    private Mamifero padre;
    private Mamifero madre;
    private Mamifero abueloMaterno;
    private Mamifero abuelaMaterna;
    private Mamifero abueloPaterno;
    private Mamifero abuelaPaterna;

    public Mamifero() {
    }

    public Mamifero(String identificador) {
        this.identificador = identificador;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Date getFechaNaciemiento() {
        return fechaNaciemiento;
    }

    public void setFechaNaciemiento(Date fechaNaciemiento) {
        this.fechaNaciemiento = fechaNaciemiento;
    }

    public Mamifero getPadre() {
        return padre;
    }

    public void setPadre(Mamifero padre) {
        this.padre = padre;
    }

    public Mamifero getMadre() {
        return madre;
    }

    public void setMadre(Mamifero madre) {
        this.madre = madre;
    }

    public Mamifero getAbueloMaterno() {
        if (madre == null)
            return null;
        return madre.getPadre();
    }

    public Mamifero getAbuelaMaterna() {
        if (madre == null)
            return null;
        return madre.getMadre();
    }

    public Mamifero getAbueloPaterno() {
        if (padre == null)
            return null;
        return padre.getPadre();
    }

    public Mamifero getAbuelaPaterna() {
        if (padre == null)
            return null;
        return padre.getMadre();
    }

    public boolean tieneComoAncestroA (Mamifero mamifero) {
        if (mamifero == null || mamifero == this) {
            return false;
        }
        if (padre == mamifero || madre == mamifero) {
            return true;
        }
        boolean porPadre = (padre != null) && padre.tieneComoAncestroA(mamifero);
        boolean porMadre = (madre != null) && madre.tieneComoAncestroA(mamifero);
        return porPadre || porMadre;
    }
}
