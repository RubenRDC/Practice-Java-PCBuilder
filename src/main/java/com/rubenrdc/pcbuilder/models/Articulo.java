package com.rubenrdc.pcbuilder.models;

/**
 *
 * @author Ruben
 */
public class Articulo {
    private String title,marca;
    
    public Articulo(String title,String marca) {
        this.title=title;
        this.marca=marca;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
