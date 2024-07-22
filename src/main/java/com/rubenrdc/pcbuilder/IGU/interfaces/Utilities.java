package com.rubenrdc.pcbuilder.IGU.interfaces;

import java.net.MalformedURLException;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author Ruben
 */
public interface Utilities {

    default public void llenarTablaO(javax.swing.JTable table, List<Object[]> lista) {
        clearTable(table);
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) table.getModel();
        for (Object[] objects : lista) {
            model.addRow(objects);
        }
        table.setModel(model);
    }

    default public void clearTable(javax.swing.JTable table) {
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) table.getModel();
        model.setRowCount(0);
        table.setModel(model);
    }

    public static ImageIcon generateImageIcon(String path) {
        if (path != null) {
            if (!path.isEmpty()) {
                try {
                    //Carga la imagen si es que existe caso contrario lanza una excepcion.
                    java.net.URL imgURL = new java.net.URL(path);
                    return new ImageIcon(imgURL);
                } catch (MalformedURLException ex) {
                    System.out.println("19 - " + ex);
                }
            }
        }
        //return new ImageIcon("src/main/java/com/rubenrdc/pcbuilder/miselaneos/icon-image-not-found.jpg");
        return null;
    }
}
