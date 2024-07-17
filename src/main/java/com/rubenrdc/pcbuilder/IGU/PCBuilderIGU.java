package com.rubenrdc.pcbuilder.IGU;

import com.rubenrdc.pcbuilder.FrameAdmin;
import com.rubenrdc.pcbuilder.IGU.interfaces.Utilities;
import com.rubenrdc.pcbuilder.models.Almacenamiento;
import com.rubenrdc.pcbuilder.models.Articulo;
import com.rubenrdc.pcbuilder.models.Cooler;
import com.rubenrdc.pcbuilder.models.Fuente;
import com.rubenrdc.pcbuilder.models.GPU;
import com.rubenrdc.pcbuilder.models.Gabinete;
import com.rubenrdc.pcbuilder.models.MotherBoard;
import com.rubenrdc.pcbuilder.models.Procesador;
import com.rubenrdc.pcbuilder.models.Ram;
import com.rubenrdc.pcbuilder.models.list.ListaSeleccion;
import com.rubenrdc.pcbuilder.models.paquete.PaquetePeticionClient;
import com.rubenrdc.pcbuilder.models.paquete.PaqueteRecepcionClient;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author Ruben
 */
public class PCBuilderIGU extends javax.swing.JFrame implements Utilities {

    public static final int TYPE_INTEL = 0, TYPE_AMD = 1;
    private int indexSelected = 0;
    private final FrameAdmin frameAdmin = new FrameAdmin(this);
    private final ListaSeleccion listaSeleccion = new ListaSeleccion();
    private List<Almacenamiento> listStorages;
    private List<Cooler> listCoolers;
    private List<Fuente> listPowers;
    private List<GPU> listGPUs;
    private List<Gabinete> listTowers;
    private List<MotherBoard> listMothers;
    private List<Procesador> listCPUs;
    private List<Ram> listRams;
    private PaquetePeticionClient PackagePet;
    private PaqueteRecepcionClient PackageRec;

    public PCBuilderIGU(int Type) {
        initComponents();
        //jTabbedPane1.setEnabledAt(0, false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        imgLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        titleArtTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        marcaTxt = new javax.swing.JTextField();
        varArt1Txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        varArt2Txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
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

        imgLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        imgLabel.setPreferredSize(new java.awt.Dimension(200, 200));
        imgLabel.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Titulo:");

        titleArtTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        titleArtTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        titleArtTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        titleArtTxt.setEnabled(false);
        titleArtTxt.setPreferredSize(new java.awt.Dimension(71, 24));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Marca:");

        marcaTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        marcaTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        marcaTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        marcaTxt.setEnabled(false);
        marcaTxt.setPreferredSize(new java.awt.Dimension(71, 24));

        varArt1Txt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        varArt1Txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        varArt1Txt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        varArt1Txt.setEnabled(false);
        varArt1Txt.setPreferredSize(new java.awt.Dimension(71, 24));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Chipset:");

        varArt2Txt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        varArt2Txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        varArt2Txt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        varArt2Txt.setEnabled(false);
        varArt2Txt.setPreferredSize(new java.awt.Dimension(71, 24));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Factor:");

        addArtSelectedBtn.setText("Añadir Seleccion");
        addArtSelectedBtn.setFocusable(false);
        addArtSelectedBtn.setMargin(new java.awt.Insets(1, 1, 1, 1));
        addArtSelectedBtn.setPreferredSize(new java.awt.Dimension(128, 32));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleArtTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marcaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(varArt1Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(varArt2Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addArtSelectedBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(moreInfoBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ViewSelectedListBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imgLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(ViewSelectedListBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(titleArtTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(marcaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(varArt1Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(varArt2Txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

            }
        ){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        TableProcesador.setRowHeight(25);
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

            }
        ){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        TableMother.setRowHeight(25);
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

            }
        ){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        TableCooler.setRowHeight(25);
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

            }
        ){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        TableRam.setRowHeight(25);
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

            }
        ){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        TableGPU.setRowHeight(25);
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

            }
        ){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        TableAlmacenamiento.setRowHeight(25);
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

            }
        ){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        TableFuente.setRowHeight(25);
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

            }
        ){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        TableGabinete.setRowHeight(25);
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        //indexSelected = jTabbedPane1.getSelectedIndex();
        //System.out.println(jTabbedPane1.getSelectedIndex());
        //jTabbedPane1.setSelectedIndex(7);

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
        frameAdmin.OpenNewFrame(FrameAdmin.TYPE_SELECTED_ART_LIST);
    }//GEN-LAST:event_ViewSelectedListBtnMouseClicked

    private void goNextPage() {
        if (indexSelected < (jTabbedPane1.getTabCount() - 1)) {
            indexSelected++;
            jTabbedPane1.setSelectedIndex(indexSelected);
        }
        if (indexSelected > 0) {
            backBtn.setEnabled(true);
        }
        if (indexSelected == (jTabbedPane1.getTabCount() - 1)) {
            nextBtn.setEnabled(false);
            updateListBtn.setEnabled(false);
        }
    }

    private void goBackPage() {
        if (indexSelected <= (jTabbedPane1.getTabCount() - 1) & indexSelected > 0) {
            indexSelected--;
            jTabbedPane1.setSelectedIndex(indexSelected);
        }
        if (indexSelected == 0) {
            backBtn.setEnabled(false);
        }
        if (indexSelected != (jTabbedPane1.getTabCount() - 1)) {
            nextBtn.setEnabled(true);
            updateListBtn.setEnabled(true);
        }
    }
    
    private <T extends Articulo> void llenarTabla(javax.swing.JTable table, List<T> lista) {
        clearTable(table);
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) table.getModel();
        for (T articulo : lista) {
            model.addRow(articulo.getRow());
        }
        table.setModel(model);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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
    private javax.swing.JTextField marcaTxt;
    private javax.swing.JButton moreInfoBtn;
    private javax.swing.JButton nextBtn;
    private javax.swing.JTextField titleArtTxt;
    private javax.swing.JButton updateListBtn;
    private javax.swing.JTextField varArt1Txt;
    private javax.swing.JTextField varArt2Txt;
    // End of variables declaration//GEN-END:variables
}
