package com.rubenrdc.pcbuilder.IGU;

import com.rubenrdc.pcbuilder.FrameAdmin;
import com.rubenrdc.pcbuilder.IGU.interfaces.Utilities;
import com.rubenrdc.pcbuilder.models.*;
import com.rubenrdc.pcbuilder.models.list.ListaSeleccion;
import com.rubenrdc.pcbuilderserver.logic.LogicPacksAL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruben
 */
public class PCBuilderIGU extends javax.swing.JFrame implements Utilities {

    public static final int TYPE_INTEL = 0, TYPE_AMD = 1;
    private int pageSelected = 0, selectedType = 0;
    private final FrameAdmin frameAdmin = new FrameAdmin(this);
    private final LogicPacksAL logicDao = new LogicPacksAL();
    private final ListaSeleccion listSeleccion = new ListaSeleccion();

    public PCBuilderIGU(int Type) {
        initComponents();
        this.selectedType = Type;
        //jTabbedPane1.setEnabledAt(0, false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelBasicInfo = new javax.swing.JPanel();
        imgLabel = new javax.swing.JLabel();
        labelInfo1 = new javax.swing.JLabel();
        txtInfo1 = new javax.swing.JTextField();
        labelInfo2 = new javax.swing.JLabel();
        txtInfo2 = new javax.swing.JTextField();
        txtInfo3 = new javax.swing.JTextField();
        labelInfo3 = new javax.swing.JLabel();
        txtInfo4 = new javax.swing.JTextField();
        labelInfo4 = new javax.swing.JLabel();
        addArtSelectedBtn = new javax.swing.JButton();
        moreInfoBtn = new javax.swing.JButton();
        ViewSelectedListBtn = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelProcesador = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableProcesador = new javax.swing.JTable();
        PanelMother = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableMother = new javax.swing.JTable();
        PanelCooler = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableCooler = new javax.swing.JTable();
        PanelRam = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableRam = new javax.swing.JTable();
        PanelGPU = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TableGPU = new javax.swing.JTable();
        PanelAlmacenamiento = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TableAlmacenamiento = new javax.swing.JTable();
        PanelFuente = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TableFuente = new javax.swing.JTable();
        PanelGabinete = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        TableGabinete = new javax.swing.JTable();
        PanelEnd = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        TableEnd = new javax.swing.JTable();
        nextBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        updateListBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(null);
        setMinimumSize(null);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        imgLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        imgLabel.setPreferredSize(new java.awt.Dimension(200, 200));
        imgLabel.setRequestFocusEnabled(false);

        labelInfo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelInfo1.setText("Titulo:");

        txtInfo1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtInfo1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtInfo1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtInfo1.setEnabled(false);
        txtInfo1.setPreferredSize(new java.awt.Dimension(71, 24));

        labelInfo2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelInfo2.setText("Marca:");

        txtInfo2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtInfo2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtInfo2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtInfo2.setEnabled(false);
        txtInfo2.setPreferredSize(new java.awt.Dimension(71, 24));

        txtInfo3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtInfo3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtInfo3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtInfo3.setEnabled(false);
        txtInfo3.setPreferredSize(new java.awt.Dimension(71, 24));

        labelInfo3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelInfo3.setText("Chipset:");

        txtInfo4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtInfo4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtInfo4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtInfo4.setEnabled(false);
        txtInfo4.setPreferredSize(new java.awt.Dimension(71, 24));

        labelInfo4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelInfo4.setText("Factor:");

        addArtSelectedBtn.setText("Añadir Seleccion");
        addArtSelectedBtn.setFocusable(false);
        addArtSelectedBtn.setMargin(new java.awt.Insets(1, 1, 1, 1));
        addArtSelectedBtn.setPreferredSize(new java.awt.Dimension(128, 32));
        addArtSelectedBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addArtSelectedBtnMouseClicked(evt);
            }
        });

        moreInfoBtn.setText("Ver Mas Info");
        moreInfoBtn.setFocusable(false);
        moreInfoBtn.setMargin(new java.awt.Insets(1, 1, 1, 1));
        moreInfoBtn.setPreferredSize(new java.awt.Dimension(128, 32));

        ViewSelectedListBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ViewSelectedListBtn.setIcon(new ImageIcon("src/main/java/com/rubenrdc/pcbuilder/IGU/miselaneos/Selections25x25.png"));
        ViewSelectedListBtn.setText("0");
        ViewSelectedListBtn.setFocusable(false);
        ViewSelectedListBtn.setMargin(new java.awt.Insets(1, 1, 1, 1));
        ViewSelectedListBtn.setPreferredSize(new java.awt.Dimension(30, 30));
        ViewSelectedListBtn.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ViewSelectedListBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ViewSelectedListBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewSelectedListBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBasicInfoLayout = new javax.swing.GroupLayout(panelBasicInfo);
        panelBasicInfo.setLayout(panelBasicInfoLayout);
        panelBasicInfoLayout.setHorizontalGroup(
            panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBasicInfoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelInfo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtInfo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelInfo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtInfo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelInfo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtInfo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelInfo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtInfo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBasicInfoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addArtSelectedBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(moreInfoBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ViewSelectedListBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imgLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0))
        );
        panelBasicInfoLayout.setVerticalGroup(
            panelBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBasicInfoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(ViewSelectedListBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelInfo2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtInfo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelInfo3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtInfo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelInfo4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtInfo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(moreInfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addArtSelectedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTabbedPane1.setFocusable(false);
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(744, 564));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jScrollPane2.setBorder(null);

        TableProcesador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TableProcesador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                null
            },
            new String [] {
                "Titulo","Marca","N. Nucleos","N. Hilos","Frec. Turbo"
            }
        ){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        TableProcesador.setRowHeight(25);
        TableProcesador.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TableProcesador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableProcesadorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableProcesador);

        javax.swing.GroupLayout PanelProcesadorLayout = new javax.swing.GroupLayout(PanelProcesador);
        PanelProcesador.setLayout(PanelProcesadorLayout);
        PanelProcesadorLayout.setHorizontalGroup(
            PanelProcesadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProcesadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelProcesadorLayout.setVerticalGroup(
            PanelProcesadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProcesadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Procesador", PanelProcesador);

        jScrollPane1.setBorder(null);

        TableMother.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TableMother.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                null
            },
            new String [] {
                "Titulo","Marca","Chipset","Factor"
            }
        ){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        TableMother.setRowHeight(25);
        TableMother.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(TableMother);

        javax.swing.GroupLayout PanelMotherLayout = new javax.swing.GroupLayout(PanelMother);
        PanelMother.setLayout(PanelMotherLayout);
        PanelMotherLayout.setHorizontalGroup(
            PanelMotherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMotherLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelMotherLayout.setVerticalGroup(
            PanelMotherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMotherLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Placa Base", PanelMother);

        jScrollPane3.setBorder(null);

        TableCooler.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TableCooler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                null
            },
            new String [] {
                "Titulo","Marca","Tipo","TDP"
            }
        ){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        TableCooler.setRowHeight(25);
        TableCooler.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(TableCooler);

        javax.swing.GroupLayout PanelCoolerLayout = new javax.swing.GroupLayout(PanelCooler);
        PanelCooler.setLayout(PanelCoolerLayout);
        PanelCoolerLayout.setHorizontalGroup(
            PanelCoolerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCoolerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelCoolerLayout.setVerticalGroup(
            PanelCoolerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCoolerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cooler", PanelCooler);

        jScrollPane4.setBorder(null);

        TableRam.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TableRam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                null
            },
            new String [] {
                "Titulo","Marca","Capacidad","Frecuencia"
            }
        ){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        TableRam.setRowHeight(25);
        TableRam.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(TableRam);

        javax.swing.GroupLayout PanelRamLayout = new javax.swing.GroupLayout(PanelRam);
        PanelRam.setLayout(PanelRamLayout);
        PanelRamLayout.setHorizontalGroup(
            PanelRamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelRamLayout.setVerticalGroup(
            PanelRamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Ram", PanelRam);

        jScrollPane5.setBorder(null);

        TableGPU.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TableGPU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                null
            },
            new String [] {
                "Titulo","Marca","Tipo de Memoria","MemoriaVram"
            }
        ){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        TableGPU.setRowHeight(25);
        TableGPU.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(TableGPU);

        javax.swing.GroupLayout PanelGPULayout = new javax.swing.GroupLayout(PanelGPU);
        PanelGPU.setLayout(PanelGPULayout);
        PanelGPULayout.setHorizontalGroup(
            PanelGPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGPULayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelGPULayout.setVerticalGroup(
            PanelGPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGPULayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("GPU", PanelGPU);

        jScrollPane6.setBorder(null);

        TableAlmacenamiento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TableAlmacenamiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                null
            },
            new String [] {
                "Titulo","Marca","Tipo","Factor"
            }
        ){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        TableAlmacenamiento.setRowHeight(25);
        TableAlmacenamiento.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane6.setViewportView(TableAlmacenamiento);

        javax.swing.GroupLayout PanelAlmacenamientoLayout = new javax.swing.GroupLayout(PanelAlmacenamiento);
        PanelAlmacenamiento.setLayout(PanelAlmacenamientoLayout);
        PanelAlmacenamientoLayout.setHorizontalGroup(
            PanelAlmacenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAlmacenamientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelAlmacenamientoLayout.setVerticalGroup(
            PanelAlmacenamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAlmacenamientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Almacenamiento", PanelAlmacenamiento);

        jScrollPane7.setBorder(null);

        TableFuente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TableFuente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                null
            },
            new String [] {
                "Titulo","Marca","Watts Reales","Factor"
            }
        ){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        TableFuente.setRowHeight(25);
        TableFuente.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane7.setViewportView(TableFuente);

        javax.swing.GroupLayout PanelFuenteLayout = new javax.swing.GroupLayout(PanelFuente);
        PanelFuente.setLayout(PanelFuenteLayout);
        PanelFuenteLayout.setHorizontalGroup(
            PanelFuenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFuenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelFuenteLayout.setVerticalGroup(
            PanelFuenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFuenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Fuente", PanelFuente);

        jScrollPane8.setBorder(null);

        TableGabinete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TableGabinete.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                null
            },
            new String [] {
                "Titulo","Marca","Factor Mother","Factor Fuente"
            }
        ){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        TableGabinete.setRowHeight(25);
        TableGabinete.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane8.setViewportView(TableGabinete);

        javax.swing.GroupLayout PanelGabineteLayout = new javax.swing.GroupLayout(PanelGabinete);
        PanelGabinete.setLayout(PanelGabineteLayout);
        PanelGabineteLayout.setHorizontalGroup(
            PanelGabineteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGabineteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelGabineteLayout.setVerticalGroup(
            PanelGabineteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGabineteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Gabinete", PanelGabinete);

        jScrollPane9.setBorder(null);

        TableEnd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TableEnd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                null
            },
            new String [] {

            }
        ){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        TableEnd.setRowHeight(25);
        jScrollPane9.setViewportView(TableEnd);

        javax.swing.GroupLayout PanelEndLayout = new javax.swing.GroupLayout(PanelEnd);
        PanelEnd.setLayout(PanelEndLayout);
        PanelEndLayout.setHorizontalGroup(
            PanelEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEndLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelEndLayout.setVerticalGroup(
            PanelEndLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEndLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Finalizar", PanelEnd);

        nextBtn.setText("Paso Siguiente ->");
        nextBtn.setFocusable(false);
        nextBtn.setMargin(new java.awt.Insets(1, 1, 1, 1));
        nextBtn.setPreferredSize(new java.awt.Dimension(134, 32));
        nextBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextBtnMouseClicked(evt);
            }
        });

        backBtn.setText("<- Paso Anterior");
        backBtn.setEnabled(false);
        backBtn.setFocusable(false);
        backBtn.setMargin(new java.awt.Insets(1, 1, 1, 1));
        backBtn.setPreferredSize(new java.awt.Dimension(134, 32));
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });

        updateListBtn.setText("Actualizar Lista");
        updateListBtn.setFocusable(false);
        updateListBtn.setMargin(new java.awt.Insets(1, 1, 1, 1));
        updateListBtn.setPreferredSize(new java.awt.Dimension(128, 32));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(updateListBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addComponent(panelBasicInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBasicInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateListBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8))
        );

        //jTabbedPane1.setEnabledAt(0, false);
        jTabbedPane1.setEnabledAt(1, false);
        jTabbedPane1.setEnabledAt(2, false);
        jTabbedPane1.setEnabledAt(3, false);
        jTabbedPane1.setEnabledAt(4, false);
        jTabbedPane1.setEnabledAt(5, false);
        jTabbedPane1.setEnabledAt(6, false);
        jTabbedPane1.setEnabledAt(7, false);

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

    private void goNextPage() {
        if (pageSelected < (jTabbedPane1.getTabCount() - 1)) {
            if (getNextPageInfo(pageSelected)) {
                pageSelected++;
                jTabbedPane1.setSelectedIndex(pageSelected);
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un articulo en la lista actual para\nencontrar los componentes compatibles q lo prosiguen.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (pageSelected > 0) {
            backBtn.setEnabled(true);
        } else if (pageSelected == (jTabbedPane1.getTabCount() - 1)) {
            nextBtn.setEnabled(false);
            updateListBtn.setEnabled(false);
        }
    }

    private void goBackPage() {
        if (pageSelected <= (jTabbedPane1.getTabCount() - 1) & pageSelected > 0) {
            pageSelected--;
            jTabbedPane1.setSelectedIndex(pageSelected);
        }
        if (pageSelected == 0) {
            backBtn.setEnabled(false);
        }
        if (pageSelected != (jTabbedPane1.getTabCount() - 1)) {
            nextBtn.setEnabled(true);
            updateListBtn.setEnabled(true);
        }
    }

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked

    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void nextBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBtnMouseClicked
        if (nextBtn.isEnabled()) {
            goNextPage();
        }

    }//GEN-LAST:event_nextBtnMouseClicked

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        if (backBtn.isEnabled()) {
            goBackPage();
        }
    }//GEN-LAST:event_backBtnMouseClicked

    private void ViewSelectedListBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewSelectedListBtnMouseClicked
        if (!listSeleccion.isEmpty()) {
            frameAdmin.OpenNewFrame(FrameAdmin.TYPE_SELECTED_ART_LIST);
        }
    }//GEN-LAST:event_ViewSelectedListBtnMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        logicDao.setListCPUs(selectedType);
        llenarTabla(TableProcesador, logicDao.getListCPUs());
    }//GEN-LAST:event_formWindowOpened

    private void TableProcesadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableProcesadorMouseClicked
        int selectedRow = TableProcesador.getSelectedRow();
        if (selectedRow != -1) {
            setInfoBasic(pageSelected, (Procesador) logicDao.getListCPUs().get(selectedRow));
        }
    }//GEN-LAST:event_TableProcesadorMouseClicked

    private void addArtSelectedBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addArtSelectedBtnMouseClicked
        
        //Aqui Falta!!!!!!!!!
        listSeleccion.add(logicDao.getListCPUs().get(TableProcesador.getSelectedRow()));
        goNextPage();
    }//GEN-LAST:event_addArtSelectedBtnMouseClicked

    private boolean getNextPageInfo(int pageActual) {
        switch (pageActual) {
            case 0://Se encuentra en la pagina de Procesador
                Procesador p = (Procesador) listSeleccion.getSeleccionExpecifica("Procesador");
                if (p != null) {
                    logicDao.setListMothers(p.getSocket());
                    llenarTabla(this.TableMother, logicDao.getListMothers());
                    return true;
                }
                break;
            case 1://Pagina Mother
                p = (Procesador) listSeleccion.getSeleccionExpecifica("Procesador");
                if (p != null) {
                    logicDao.setListCoolers(p.getSocket(), p.getTDP());
                    llenarTabla(this.TableCooler, logicDao.getListCoolers());
                    return true;
                }
            case 2://Pagina Cooler
                MotherBoard m = (MotherBoard) listSeleccion.getSeleccionExpecifica("MotherBoard");
                if (m != null) {
                    logicDao.setListRams(m.getMemoryType());
                    llenarTabla(this.TableCooler, logicDao.getListRams());
                    return true;
                }
                break;
            case 3://Pagina Ram
                logicDao.setListGPUs();
                llenarTabla(this.TableGPU, logicDao.getListGPUs());
                return true;
            case 4://Pagina GPU
                logicDao.setListStorages();
                llenarTabla(this.TableAlmacenamiento, logicDao.getListStorages());
                return true;
            case 5://Pagina Almacenamiento
                logicDao.setListPowers(listSeleccion.getConsumoActual());
                llenarTabla(this.TableAlmacenamiento, logicDao.getListPowers());
                return true;
            case 6://Pagina Fuente
                m = (MotherBoard) listSeleccion.getSeleccionExpecifica("MotherBoard");
                Fuente power = (Fuente) listSeleccion.getSeleccionExpecifica("Fuente");
                GPU gpu = (GPU) listSeleccion.getSeleccionExpecifica("GPU");
                Cooler c = (Cooler) listSeleccion.getSeleccionExpecifica("Cooler");
                logicDao.setListTowers(m.getFactor(), power.getFactor(), gpu.getLength(), c.getType(), c.getHighCooler(), c.getCoolersFans(), c.getSizeCoolerFans());
                llenarTabla(this.TableGabinete, logicDao.getListTowers());
                return true;
        }
        return false;
    }

    private <E extends Articulo> void setInfoBasic(int pageActual, E elemento) {
        if (!panelBasicInfo.isEnabled()) {
            setPanelEnabled(panelBasicInfo, true);
        }
        switch (pageActual) {
            case 0://Procesador
                Procesador e = (Procesador) elemento;
                setCamps(e.getImagen(), e.getTitle(), e.getMarca(), e.getSocket(), Double.toString(e.getFrequencyTurbo()), "Socket:", "Frecuencia Turbo:");
                break;
            case 1:
                MotherBoard m = (MotherBoard) elemento;
                setCamps(m.getImagen(), m.getTitle(), m.getMarca(), m.getChipset(), m.getFactor(), "Chipset:", "Factor:");
                break;
            case 2:
                //Cooler
                Cooler c = (Cooler) elemento;
                setCamps(c.getImagen(), c.getTitle(), c.getMarca(), c.getType(), Integer.toString(c.getTDP()), "Tipo:", "TDP:");
                break;
            case 3:
                //Ram
                Ram r = (Ram) elemento;
                setCamps(r.getImagen(), r.getTitle(), r.getMarca(), Integer.toString(r.getCapacity()), Integer.toString(r.getFrequencyRam()), "Cantidad de Memoria:", "Frecuancia:");
                break;
            case 4:
                //GPU
                GPU gpu = (GPU) elemento;
                setCamps(gpu.getImagen(), gpu.getTitle(), gpu.getMarca(), gpu.getTypeMemory(), Integer.toString(gpu.getMemoryVRam()), "Tipo de Memoria:", "Memoria VRam:");
                break;
            case 5:
                //Almacenamiento
                Almacenamiento alm = (Almacenamiento) elemento;
                setCamps(alm.getImagen(), alm.getTitle(), alm.getMarca(), alm.getType(), alm.getFactor(), "Tipo:", "Factor:");
                break;
            case 6:
                //Fuente
                Fuente f = (Fuente) elemento;
                setCamps(f.getImagen(), f.getTitle(), f.getMarca(), Integer.toString(f.getRealWatts()), f.getFactor(), "Tipo:", "Factor:");
                break;
            case 7:
                //Gabinete
                Gabinete ga = (Gabinete) elemento;
                setCamps(ga.getImagen(), ga.getTitle(), ga.getMarca(), ga.getFactorMother(), ga.getPowerFactor(), "Factor de Mother:", "Factor de Fuente:");
                break;
            default:
                setPanelEnabled(panelBasicInfo, false);
                break;
        }
    }

    private void setCamps(String pathImg, String x1, String x2, String x3, String x4, String x5, String x6) {
        imgLabel.setIcon(generateImageIcon(pathImg, imgLabel));
        this.txtInfo1.setText(x1);
        this.txtInfo2.setText(x2);
        this.txtInfo3.setText(x3);
        this.txtInfo4.setText(x4);
        this.labelInfo3.setText(x5);
        this.labelInfo4.setText(x6);
    }

    protected ListaSeleccion getListSeleccion() {
        return listSeleccion;
    }

    protected void setPageActual(int page) {
        pageSelected = page;
        jTabbedPane1.setSelectedIndex(page);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAlmacenamiento;
    private javax.swing.JPanel PanelCooler;
    private javax.swing.JPanel PanelEnd;
    private javax.swing.JPanel PanelFuente;
    private javax.swing.JPanel PanelGPU;
    private javax.swing.JPanel PanelGabinete;
    private javax.swing.JPanel PanelMother;
    private javax.swing.JPanel PanelProcesador;
    private javax.swing.JPanel PanelRam;
    private javax.swing.JTable TableAlmacenamiento;
    private javax.swing.JTable TableCooler;
    private javax.swing.JTable TableEnd;
    private javax.swing.JTable TableFuente;
    private javax.swing.JTable TableGPU;
    private javax.swing.JTable TableGabinete;
    private javax.swing.JTable TableMother;
    private javax.swing.JTable TableProcesador;
    private javax.swing.JTable TableRam;
    private javax.swing.JButton ViewSelectedListBtn;
    private javax.swing.JButton addArtSelectedBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelInfo1;
    private javax.swing.JLabel labelInfo2;
    private javax.swing.JLabel labelInfo3;
    private javax.swing.JLabel labelInfo4;
    private javax.swing.JButton moreInfoBtn;
    private javax.swing.JButton nextBtn;
    private javax.swing.JPanel panelBasicInfo;
    private javax.swing.JTextField txtInfo1;
    private javax.swing.JTextField txtInfo2;
    private javax.swing.JTextField txtInfo3;
    private javax.swing.JTextField txtInfo4;
    private javax.swing.JButton updateListBtn;
    // End of variables declaration//GEN-END:variables
}
