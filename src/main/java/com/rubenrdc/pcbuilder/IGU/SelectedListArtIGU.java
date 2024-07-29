package com.rubenrdc.pcbuilder.IGU;

import com.rubenrdc.pcbuilder.IGU.interfaces.Utilities;
import com.rubenrdc.pcbuilder.models.*;
import com.rubenrdc.pcbuilder.models.list.ListaSeleccion;

/**
 *
 * @author Ruben
 */
public class SelectedListArtIGU extends javax.swing.JDialog implements Utilities {

    private ListaSeleccion listaSeleccion;
    private PCBuilderIGU father;

    public SelectedListArtIGU(javax.swing.JFrame parent, boolean modal) {
        super(parent, modal);
        father = (PCBuilderIGU) parent;
        listaSeleccion = father.getListSeleccion();
        initComponents();
        llenarTablaO(listComponentsTable, listaSeleccion.getListTitleAndCant());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listComponentsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        delectSelectedBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        listComponentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Cant."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listComponentsTable.setFocusable(false);
        listComponentsTable.setRowHeight(25);
        listComponentsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listComponentsTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Previzualizacion de Componentes Seleccionados");

        delectSelectedBtn.setText("Eliminar Seleccion");
        delectSelectedBtn.setFocusable(false);
        delectSelectedBtn.setMargin(new java.awt.Insets(1, 1, 1, 1));
        delectSelectedBtn.setPreferredSize(new java.awt.Dimension(128, 32));
        delectSelectedBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delectSelectedBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(delectSelectedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delectSelectedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void delectSelectedBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delectSelectedBtnMouseClicked
        int selectedRow = listComponentsTable.getSelectedRow();
        if (selectedRow != -1) {
            Articulo remove = listaSeleccion.remove(listComponentsTable.getSelectedRow());
            llenarTablaO(listComponentsTable, listaSeleccion.getListTitleAndCant());
            verificRemoveEl(remove);
            father.setViewSelectedListBtnText(listaSeleccion.size());
        }
    }//GEN-LAST:event_delectSelectedBtnMouseClicked

    private void verificRemoveEl(Articulo remove) {
        if (remove instanceof Procesador) {
            father.setPageActual(0);
        } else if (remove instanceof MotherBoard) {
            father.setPageActual(1);
        } else if (remove instanceof Cooler) {
            father.setPageActual(2);
        } else if (remove instanceof Ram) {
            father.setPageActual(3);
        } else if (remove instanceof GPU) {
            father.setPageActual(4);
        } else if (remove instanceof Almacenamiento) {
            father.setPageActual(5);
        } else if (remove instanceof Fuente) {
            father.setPageActual(6);
        } else if (remove instanceof Gabinete) {
            father.setPageActual(7);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delectSelectedBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listComponentsTable;
    // End of variables declaration//GEN-END:variables
}
