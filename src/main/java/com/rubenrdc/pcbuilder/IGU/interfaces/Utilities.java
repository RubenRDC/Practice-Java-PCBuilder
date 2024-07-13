package com.rubenrdc.pcbuilder.IGU.interfaces;

import java.util.List;

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
}
