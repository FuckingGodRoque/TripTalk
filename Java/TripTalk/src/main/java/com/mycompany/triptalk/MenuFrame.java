
package com.mycompany.triptalk;

public class MenuFrame extends javax.swing.JFrame {


    public MenuFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new org.edisoncor.gui.panel.Panel();
        jPanel1 = new javax.swing.JPanel();
        logo = new org.edisoncor.gui.panel.PanelImage();
        labelNombre = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        btnCrearViaje1 = new org.edisoncor.gui.panel.PanelImage();
        jLabel3 = new javax.swing.JLabel();
        btnCrearOpinion = new org.edisoncor.gui.panel.PanelImage();
        jLabel1 = new javax.swing.JLabel();
        btnCrearViaje = new org.edisoncor.gui.panel.PanelImage();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        MenuInicio = new javax.swing.JPanel();
        MenuPrincipal = new org.edisoncor.gui.panel.PanelImage();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        btnOpiniones = new javax.swing.JLabel();
        panelImage6 = new org.edisoncor.gui.panel.PanelImage();
        btnViajes = new javax.swing.JLabel();
        panelImage7 = new org.edisoncor.gui.panel.PanelImage();
        btnMisPublicaciones = new javax.swing.JLabel();
        scrollPrincipal = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        CrearOpinion = new javax.swing.JPanel();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        jLabel4 = new javax.swing.JLabel();
        panelImage4 = new org.edisoncor.gui.panel.PanelImage();
        panelImage5 = new org.edisoncor.gui.panel.PanelImage();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        btnAtras = new org.edisoncor.gui.panel.PanelImage();
        panelImage8 = new org.edisoncor.gui.panel.PanelImage();
        jLabel11 = new javax.swing.JLabel();
        CrearViaje = new javax.swing.JPanel();
        panelImage3 = new org.edisoncor.gui.panel.PanelImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1070, 660));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setForeground(new java.awt.Color(255, 255, 255));
        fondo.setColorPrimario(new java.awt.Color(246, 252, 251));
        fondo.setColorSecundario(new java.awt.Color(246, 252, 251));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(246, 252, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoTripTalk.png"))); // NOI18N

        javax.swing.GroupLayout logoLayout = new javax.swing.GroupLayout(logo);
        logo.setLayout(logoLayout);
        logoLayout.setHorizontalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        logoLayout.setVerticalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 220, 120));

        labelNombre.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNombre.setText("NOMBRE NAME");
        jPanel1.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 200, 50));

        labelApellido.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelApellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelApellido.setText("APELLIDOS");
        jPanel1.add(labelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 200, 50));

        btnCrearViaje1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonBlancoSombra.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 173, 172));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cerrar Sesión");

        javax.swing.GroupLayout btnCrearViaje1Layout = new javax.swing.GroupLayout(btnCrearViaje1);
        btnCrearViaje1.setLayout(btnCrearViaje1Layout);
        btnCrearViaje1Layout.setHorizontalGroup(
            btnCrearViaje1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        btnCrearViaje1Layout.setVerticalGroup(
            btnCrearViaje1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(btnCrearViaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 200, 50));

        btnCrearOpinion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barraNaranja.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crear Opinión");

        javax.swing.GroupLayout btnCrearOpinionLayout = new javax.swing.GroupLayout(btnCrearOpinion);
        btnCrearOpinion.setLayout(btnCrearOpinionLayout);
        btnCrearOpinionLayout.setHorizontalGroup(
            btnCrearOpinionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        btnCrearOpinionLayout.setVerticalGroup(
            btnCrearOpinionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCrearOpinionLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(btnCrearOpinion, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 290, 190, 50));

        btnCrearViaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barraNaranja.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ofrecer Viaje");

        javax.swing.GroupLayout btnCrearViajeLayout = new javax.swing.GroupLayout(btnCrearViaje);
        btnCrearViaje.setLayout(btnCrearViajeLayout);
        btnCrearViajeLayout.setHorizontalGroup(
            btnCrearViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        btnCrearViajeLayout.setVerticalGroup(
            btnCrearViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(btnCrearViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 350, -1, -1));

        fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 660));

        jTabbedPane1.setBackground(new java.awt.Color(246, 252, 251));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        MenuInicio.setBackground(new java.awt.Color(246, 252, 251));

        MenuPrincipal.setBackground(new java.awt.Color(246, 252, 251));
        MenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/panelBlancoRedondeado.png"))); // NOI18N
        MenuPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonGrisSombra.png"))); // NOI18N

        btnOpiniones.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnOpiniones.setForeground(new java.awt.Color(255, 255, 255));
        btnOpiniones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnOpiniones.setText("Opiniones");
        btnOpiniones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnOpiniones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnOpiniones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        MenuPrincipal.add(panelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 140, 40));

        panelImage6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonBlancoSombra.png"))); // NOI18N

        btnViajes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnViajes.setForeground(new java.awt.Color(102, 102, 102));
        btnViajes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnViajes.setText("Viajes");
        btnViajes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelImage6Layout = new javax.swing.GroupLayout(panelImage6);
        panelImage6.setLayout(panelImage6Layout);
        panelImage6Layout.setHorizontalGroup(
            panelImage6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnViajes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        panelImage6Layout.setVerticalGroup(
            panelImage6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnViajes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        MenuPrincipal.add(panelImage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 140, 40));

        panelImage7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonBlancoSombra.png"))); // NOI18N

        btnMisPublicaciones.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMisPublicaciones.setForeground(new java.awt.Color(102, 102, 102));
        btnMisPublicaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMisPublicaciones.setText("Mis publicaciones");
        btnMisPublicaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelImage7Layout = new javax.swing.GroupLayout(panelImage7);
        panelImage7.setLayout(panelImage7Layout);
        panelImage7Layout.setHorizontalGroup(
            panelImage7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMisPublicaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        panelImage7Layout.setVerticalGroup(
            panelImage7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMisPublicaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        MenuPrincipal.add(panelImage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 140, 40));

        scrollPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        scrollPrincipal.setBorder(null);
        scrollPrincipal.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        scrollPrincipal.setViewportView(jPanel2);

        MenuPrincipal.add(scrollPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 800, 540));

        javax.swing.GroupLayout MenuInicioLayout = new javax.swing.GroupLayout(MenuInicio);
        MenuInicio.setLayout(MenuInicioLayout);
        MenuInicioLayout.setHorizontalGroup(
            MenuInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 867, Short.MAX_VALUE)
            .addGroup(MenuInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MenuInicioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        MenuInicioLayout.setVerticalGroup(
            MenuInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
            .addGroup(MenuInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MenuInicioLayout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(MenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 5, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("tab5", MenuInicio);

        CrearOpinion.setBackground(new java.awt.Color(246, 252, 251));

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/panelBlancoRedondeado.png"))); // NOI18N
        panelImage2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("OPINA SOBRE UN LUGAR");
        panelImage2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 490, 50));

        panelImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barraNaranja.png"))); // NOI18N

        javax.swing.GroupLayout panelImage4Layout = new javax.swing.GroupLayout(panelImage4);
        panelImage4.setLayout(panelImage4Layout);
        panelImage4Layout.setHorizontalGroup(
            panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelImage4Layout.setVerticalGroup(
            panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panelImage2.add(panelImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 280, 50));

        panelImage5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barraNaranja.png"))); // NOI18N

        javax.swing.GroupLayout panelImage5Layout = new javax.swing.GroupLayout(panelImage5);
        panelImage5.setLayout(panelImage5Layout);
        panelImage5Layout.setHorizontalGroup(
            panelImage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        panelImage5Layout.setVerticalGroup(
            panelImage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panelImage2.add(panelImage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 320, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(189, 75, 0));
        jLabel5.setText("¿Qué lugar visitaste?");
        panelImage2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 150, -1));

        jTextField1.setBackground(new java.awt.Color(255, 240, 222));
        jTextField1.setToolTipText("Escribe el nombre del lugar");
        panelImage2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 740, -1));

        jTextField2.setBackground(new java.awt.Color(255, 240, 222));
        jTextField2.setToolTipText("Escribe una cantidad");
        panelImage2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 150, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(189, 75, 0));
        jLabel6.setText("¿Qué presupuesto recomiendas para visitar este lugar?");
        panelImage2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 410, -1));
        panelImage2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 263, 760, 10));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(189, 75, 0));
        jLabel7.setText("Principal obstáculo durante este viaje");
        panelImage2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 290, -1));

        jTextField3.setBackground(new java.awt.Color(255, 240, 222));
        panelImage2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 230, -1));

        jTextField4.setBackground(new java.awt.Color(255, 240, 222));
        panelImage2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 270, -1));

        jTextField5.setBackground(new java.awt.Color(255, 240, 222));
        panelImage2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 230, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(189, 75, 0));
        jLabel8.setText("Recomienda tres sitios para visitar en este viaje ");
        panelImage2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        jTextArea1.setBackground(new java.awt.Color(255, 240, 222));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        panelImage2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 350, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(189, 75, 0));
        jLabel9.setText("¿Qué recomiendas llevar en el equipaje?");
        panelImage2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 290, -1));

        jTextArea2.setBackground(new java.awt.Color(255, 240, 222));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        panelImage2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 340, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(189, 75, 0));
        jLabel10.setText("Mejores fechas para este viaje");
        panelImage2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 290, -1));

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(255, 240, 222));
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        panelImage2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 350, 70));

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N

        javax.swing.GroupLayout btnAtrasLayout = new javax.swing.GroupLayout(btnAtras);
        btnAtras.setLayout(btnAtrasLayout);
        btnAtrasLayout.setHorizontalGroup(
            btnAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        btnAtrasLayout.setVerticalGroup(
            btnAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        panelImage2.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 70, 70));

        panelImage8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barraNaranja.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Publicar");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelImage8Layout = new javax.swing.GroupLayout(panelImage8);
        panelImage8.setLayout(panelImage8Layout);
        panelImage8Layout.setHorizontalGroup(
            panelImage8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        panelImage8Layout.setVerticalGroup(
            panelImage8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelImage2.add(panelImage8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 550, 130, 50));

        javax.swing.GroupLayout CrearOpinionLayout = new javax.swing.GroupLayout(CrearOpinion);
        CrearOpinion.setLayout(CrearOpinionLayout);
        CrearOpinionLayout.setHorizontalGroup(
            CrearOpinionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage2, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
        );
        CrearOpinionLayout.setVerticalGroup(
            CrearOpinionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CrearOpinionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelImage2, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", CrearOpinion);

        CrearViaje.setBackground(new java.awt.Color(246, 252, 251));

        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/panelBlancoRedondeado.png"))); // NOI18N
        panelImage3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout CrearViajeLayout = new javax.swing.GroupLayout(CrearViaje);
        CrearViaje.setLayout(CrearViajeLayout);
        CrearViajeLayout.setHorizontalGroup(
            CrearViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CrearViajeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelImage3, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
                .addContainerGap())
        );
        CrearViajeLayout.setVerticalGroup(
            CrearViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CrearViajeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelImage3, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", CrearViaje);

        fondo.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -9, 920, 670));

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CrearOpinion;
    private javax.swing.JPanel CrearViaje;
    private javax.swing.JPanel MenuInicio;
    private org.edisoncor.gui.panel.PanelImage MenuPrincipal;
    private org.edisoncor.gui.panel.PanelImage btnAtras;
    private org.edisoncor.gui.panel.PanelImage btnCrearOpinion;
    private org.edisoncor.gui.panel.PanelImage btnCrearViaje;
    private org.edisoncor.gui.panel.PanelImage btnCrearViaje1;
    private javax.swing.JLabel btnMisPublicaciones;
    private javax.swing.JLabel btnOpiniones;
    private javax.swing.JLabel btnViajes;
    private org.edisoncor.gui.panel.Panel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelNombre;
    private org.edisoncor.gui.panel.PanelImage logo;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private org.edisoncor.gui.panel.PanelImage panelImage4;
    private org.edisoncor.gui.panel.PanelImage panelImage5;
    private org.edisoncor.gui.panel.PanelImage panelImage6;
    private org.edisoncor.gui.panel.PanelImage panelImage7;
    private org.edisoncor.gui.panel.PanelImage panelImage8;
    private javax.swing.JScrollPane scrollPrincipal;
    // End of variables declaration//GEN-END:variables
}
