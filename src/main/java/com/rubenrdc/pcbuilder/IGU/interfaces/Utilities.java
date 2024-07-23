package com.rubenrdc.pcbuilder.IGU.interfaces;

import com.rubenrdc.pcbuilder.models.Articulo;
import java.awt.Component;
import java.net.MalformedURLException;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruben
 */
public interface Utilities {

    default public <T extends Articulo> void llenarTabla(javax.swing.JTable table, List<T> lista) {
        clearTable(table);
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) table.getModel();
        for (T articulo : lista) {
            model.addRow(articulo.getRow());
        }
        JOptionPane.showMessageDialog(null, "Cantidad de elementos encontrados: " + lista.size(), "Lista Cargada.", JOptionPane.INFORMATION_MESSAGE);
        table.setModel(model);
    }
    
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

    default public ImageIcon generateImageIcon(String path, javax.swing.JLabel label) {
        if (path != null) {
            if (!path.isEmpty()) {
                try {
                    //Carga la imagen si es que existe caso contrario lanza una excepcion.
                    java.net.URL imgURL = new java.net.URL(path);
                    return iconScaled(new ImageIcon(imgURL), label);
                } catch (MalformedURLException ex) {
                    //System.out.println("19 - " + ex);
                }
            }
        }
        return iconScaled(new ImageIcon("src/main/java/com/rubenrdc/pcbuilder/IGU/miselaneos/icon-image-not-found.jpg"), label);
    }

    private ImageIcon iconScaled(javax.swing.ImageIcon icon, javax.swing.JLabel label) {
        java.awt.Image img = icon.getImage();
        java.awt.Image imgS = img.getScaledInstance(label.getWidth(), label.getHeight(), java.awt.Image.SCALE_SMOOTH);
        javax.swing.ImageIcon iconS = new javax.swing.ImageIcon(imgS);
        return iconS;
    }
    default public void setPanelEnabled(javax.swing.JPanel panel, Boolean isEnabled) {
        panel.setEnabled(isEnabled);
        java.awt.Component[] components = panel.getComponents();
        for (Component component : components) {
            //System.out.println(" ... " + component);
            component.setEnabled(isEnabled);
        }
    }
}
