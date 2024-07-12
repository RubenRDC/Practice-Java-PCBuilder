package com.rubenrdc.pcbuilder.models;

import javax.swing.ImageIcon;

/**
 *
 * @author Ruben
 */
public class Articulo implements Comparable {

    private String title, marca, oficialDocumentation;
    private ImageIcon imagen;

    public Articulo(String title, String marca) {
        this.title = title;
        this.marca = marca;
    }

    public Articulo(ImageIcon imagen, String title, String marca) {
        this.imagen = imagen;
        this.title = title;
        this.marca = marca;
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

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(String fileName) {
        this.imagen = new ImageIcon(fileName);
    }

    public String getOficialDocumentation() {
        return oficialDocumentation;
    }

    public void setOficialDocumentation(String oficialDocumentation) {
        this.oficialDocumentation = oficialDocumentation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o.getClass() == this.getClass()) {
            Articulo art = (Articulo) o;
            if (art.getTitle().equals(this.getTitle()) & art.getMarca().equals(this.getMarca())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        Articulo art = (Articulo) o;
        int compareToIgnoreCase = this.title.compareToIgnoreCase(art.title);
        if (compareToIgnoreCase == 0) {
            return 0;
        } else if (compareToIgnoreCase < 0) {
            return -1;
        }
        return 1;
    }
}
