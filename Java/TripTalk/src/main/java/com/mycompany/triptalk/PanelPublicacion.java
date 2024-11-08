package com.mycompany.triptalk;

import com.google.gson.Gson;
import com.mycompany.triptalk.clases.ViajeInteres;
import com.mycompany.triptalk.clases.Publicacion;
import com.mycompany.triptalk.clases.Usuario;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
//excel
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PanelPublicacion extends javax.swing.JPanel {

    private ArrayList<ViajeInteres> listViajesInteres = new ArrayList<>();
    private ArrayList<Usuario> listUsuarios = new ArrayList<>();
    private String ruta = "C:\\Users\\arman\\Instituto Tecnológico de Morelia\\DANIEL ADRIAN ROQUE CORTES - Red social de sugerencia de viajes\\Files\\";

    private Publicacion publicacion;
    private Usuario usuario;
    private Usuario usuarioActual;
    private boolean leInteresa;

    public PanelPublicacion() {
        initComponents();
    }

    public PanelPublicacion(Publicacion publicacion, Usuario usuario, Usuario usuarioActual) {
        initComponents();
        this.publicacion = publicacion;
        this.usuario = usuario;
        this.usuarioActual = usuarioActual;
        leInteresa = false;
        AjustarInfo();
    }

    public void AjustarInfo() {
        if (publicacion.getTipo().equalsIgnoreCase("Opinion")) {
            btnExcel.setVisible(false);
            labelBtnExcel.setVisible(false);
        }

        if (usuarioActual.getRol().equalsIgnoreCase("npc")) {
            btnEliminarImagen.setVisible(false);
            btnEliminar.setVisible(false);
            btnExcel.setVisible(false);
            labelBtnExcel.setVisible(false);
        }
        if (publicacion.getIdUsuario() == usuarioActual.getIdUsuario()) {
            btnEliminarImagen.setVisible(true);
            btnEliminar.setVisible(true);
        }
        if (publicacion.getTipo().equalsIgnoreCase("opinion")) {
            panelViaje.setVisible(false);
            labelNombrePersona.setText(usuario.getNombre() + " " + usuario.getApellido());
            labelNombreLugar.setText(publicacion.getLugar());
            labelLugar1.setText(publicacion.getLugarRecomendado1());
            labelLugar2.setText(publicacion.getLugarRecomendado2());
            labelLugar3.setText(publicacion.getLugarRecomendado3());
            labelPresupuesto.setText(publicacion.getPresupuesto());
            txtPaneEquipaje.setText(publicacion.getEquipaje());
            txtPaneFechas.setText(publicacion.getFechasRecomendadas());
            txtPaneObstaculo.setText(publicacion.getObstaculos());
        } else {
            PanelOpinion.setVisible(false);
            labelNombrePersona2.setText(usuario.getNombre() + " " + usuario.getApellido());
            labelNombreLugar2.setText(publicacion.getLugar());
            labelPresupuesto2.setText(publicacion.getPresupuesto());
            txtPaneDetalles.setText(publicacion.getDetalles());
        }
        DefinirInteres();
    }

    public void DefinirInteres() {
        CargarViajesInteres();
        for (ViajeInteres viajeInteres : listViajesInteres) {
            if (viajeInteres.getIdUsuario() == usuarioActual.getIdUsuario() && viajeInteres.getIdPublicacion() == publicacion.getIdPublicacion()) {
                leInteresa = true;
                labelInteres.setText("Ya no me interesa");
            }
        }
        panelViaje.updateUI();
    }

    public void CargarViajesInteres() {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader(ruta + "viajesinteres.json")
            );
            String lectura = null;
            String resultado = "";
            while ((lectura = br.readLine()) != null) {
                resultado += lectura;
            }
            br.close();

            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray) parser.parse(resultado);
            listViajesInteres.clear();
            for (int i = 0; i < jsonArray.size(); i++) {
                ViajeInteres viajeInteres = new Gson().fromJson(
                        jsonArray.get(i).toString(), ViajeInteres.class
                );

                listViajesInteres.add(viajeInteres);
            }
        } catch (Exception e) {
            System.out.println("No se cargaron los intereses del json correctamente");
        }
    }

    public void GuardarViajesInteres() {
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter(ruta + "viajesInteres.json", false)
            );
            String json = new Gson().toJson(listViajesInteres);

            bw.write(json);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnExcel = new org.edisoncor.gui.panel.PanelImage();
        labelBtnExcel = new javax.swing.JLabel();
        btnEliminarImagen = new org.edisoncor.gui.panel.PanelImage();
        btnEliminar = new javax.swing.JLabel();
        panelViaje = new org.edisoncor.gui.panel.PanelImage();
        labelNombrePersona2 = new javax.swing.JLabel();
        labelNombreLugar2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelPresupuesto2 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtPaneDetalles = new javax.swing.JTextPane();
        panelImage6 = new org.edisoncor.gui.panel.PanelImage();
        labelInteres = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        PanelOpinion = new org.edisoncor.gui.panel.PanelImage();
        labelNombrePersona = new javax.swing.JLabel();
        labelNombreLugar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        labelLugar3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelPresupuesto = new javax.swing.JLabel();
        labelLugar1 = new javax.swing.JLabel();
        labelLugar2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPaneObstaculo = new javax.swing.JTextPane();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtPaneEquipaje = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtPaneFechas = new javax.swing.JTextPane();
        jLabel12 = new javax.swing.JLabel();
        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        jLabel13 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barraNaranja.png"))); // NOI18N

        labelBtnExcel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelBtnExcel.setForeground(new java.awt.Color(255, 255, 255));
        labelBtnExcel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBtnExcel.setText("Excel");
        labelBtnExcel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelBtnExcel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBtnExcelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnExcelLayout = new javax.swing.GroupLayout(btnExcel);
        btnExcel.setLayout(btnExcelLayout);
        btnExcelLayout.setHorizontalGroup(
            btnExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBtnExcel, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
        );
        btnExcelLayout.setVerticalGroup(
            btnExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBtnExcel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        add(btnExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 325, -1, -1));

        btnEliminarImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/deleteIcon.png"))); // NOI18N
        btnEliminarImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarImagenMouseClicked(evt);
            }
        });

        btnEliminar.setToolTipText("Eliminar publicación");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnEliminarImagenLayout = new javax.swing.GroupLayout(btnEliminarImagen);
        btnEliminarImagen.setLayout(btnEliminarImagenLayout);
        btnEliminarImagenLayout.setHorizontalGroup(
            btnEliminarImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        btnEliminarImagenLayout.setVerticalGroup(
            btnEliminarImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        add(btnEliminarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, 40, 40));

        panelViaje.setBackground(new java.awt.Color(255, 255, 255));
        panelViaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MARCONaranjaRedondeado.png"))); // NOI18N
        panelViaje.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNombrePersona2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        labelNombrePersona2.setForeground(new java.awt.Color(51, 102, 255));
        labelNombrePersona2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNombrePersona2.setText("Nombre del que publica");
        panelViaje.add(labelNombrePersona2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 370, 50));

        labelNombreLugar2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelNombreLugar2.setForeground(new java.awt.Color(0, 204, 102));
        labelNombreLugar2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelNombreLugar2.setText("NOMBRE DEL LUGAR - AQUI VA EL NOMBRE");
        panelViaje.add(labelNombreLugar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 700, 100));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Detalles");
        panelViaje.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 130, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("COSTO:");
        panelViaje.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        labelPresupuesto2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelPresupuesto2.setForeground(new java.awt.Color(255, 102, 102));
        labelPresupuesto2.setText("$$$");
        panelViaje.add(labelPresupuesto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 80, -1));

        jScrollPane8.setBorder(null);

        txtPaneDetalles.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPaneDetalles.setText("Aquí deben ir los detalles del viaje\n");
        jScrollPane8.setViewportView(txtPaneDetalles);

        panelViaje.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 690, 70));

        panelImage6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonGrisSombra.png"))); // NOI18N

        labelInteres.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelInteres.setForeground(new java.awt.Color(255, 255, 255));
        labelInteres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInteres.setText("Me interesa");
        labelInteres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelInteres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelInteresMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelImage6Layout = new javax.swing.GroupLayout(panelImage6);
        panelImage6.setLayout(panelImage6Layout);
        panelImage6Layout.setHorizontalGroup(
            panelImage6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelInteres, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelImage6Layout.setVerticalGroup(
            panelImage6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelInteres, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelViaje.add(panelImage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 170, -1));
        panelViaje.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 710, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("Viaje ofrecido por:");
        panelViaje.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        add(panelViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 370));

        PanelOpinion.setBackground(new java.awt.Color(255, 255, 255));
        PanelOpinion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MARCONaranjaRedondeado.png"))); // NOI18N
        PanelOpinion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNombrePersona.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        labelNombrePersona.setForeground(new java.awt.Color(51, 102, 255));
        labelNombrePersona.setText("Nombre del que publica");
        PanelOpinion.add(labelNombrePersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 370, 30));

        labelNombreLugar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelNombreLugar.setForeground(new java.awt.Color(255, 153, 0));
        labelNombreLugar.setText("NOMBRE DEL LUGAR - AQUI VA EL NOMBRE");
        PanelOpinion.add(labelNombreLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 700, -1));

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        PanelOpinion.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 86, 720, 10));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Principal Obstáculo");
        PanelOpinion.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 130, 20));

        labelLugar3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelLugar3.setForeground(new java.awt.Color(0, 102, 102));
        labelLugar3.setText("Tercero lugar recomendado");
        PanelOpinion.add(labelLugar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 170, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Presupuesto:");
        PanelOpinion.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        labelPresupuesto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelPresupuesto.setForeground(new java.awt.Color(0, 102, 102));
        labelPresupuesto.setText("$$$");
        PanelOpinion.add(labelPresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 80, -1));

        labelLugar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelLugar1.setForeground(new java.awt.Color(0, 102, 102));
        labelLugar1.setText("Primer lugar recomendado");
        PanelOpinion.add(labelLugar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, 20));

        labelLugar2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelLugar2.setForeground(new java.awt.Color(0, 102, 102));
        labelLugar2.setText("Segundo lugar recomendado");
        PanelOpinion.add(labelLugar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 170, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Lugares remendados:");
        PanelOpinion.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, 20));

        txtPaneObstaculo.setText("Aquí debe ir el principal obstaculo de este lugar y este es el escrito");
        jScrollPane2.setViewportView(txtPaneObstaculo);

        PanelOpinion.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 200, 100));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("¿Qué llevar en el equipaje?");
        PanelOpinion.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 180, 20));

        txtPaneEquipaje.setText("Aquí describirás que debe llevar en el equipaje");
        jScrollPane3.setViewportView(txtPaneEquipaje);

        PanelOpinion.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 220, 100));

        txtPaneFechas.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        txtPaneFechas.setText("Aquí describirás que debe llevar en el equipaje");
        jScrollPane4.setViewportView(txtPaneFechas);

        PanelOpinion.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 190, 100));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Mejores fechas");
        PanelOpinion.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 90, 20));

        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botonGrisSombra.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Ver comentarios");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelImage3Layout = new javax.swing.GroupLayout(panelImage3);
        panelImage3.setLayout(panelImage3Layout);
        panelImage3Layout.setHorizontalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelImage3Layout.setVerticalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        PanelOpinion.add(panelImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 170, -1));
        PanelOpinion.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 710, 20));

        add(PanelOpinion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        new ComentariosFrame(publicacion, usuarioActual).setVisible(true);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void btnEliminarImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarImagenMouseClicked

    }//GEN-LAST:event_btnEliminarImagenMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        MenuFrame menu = (MenuFrame) SwingUtilities.getWindowAncestor(PanelPublicacion.this);
        try {
            menu.eliminarPublicacion(publicacion);
            menu.ActualizarFeed();
        } catch (Exception ex) {
            Logger.getLogger(PanelPublicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void labelInteresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelInteresMouseClicked
        try {
            if (leInteresa == false) {
                ViajeInteres viajeInteres = new ViajeInteres(usuarioActual.getIdUsuario(), publicacion.getIdPublicacion());
                listViajesInteres.add(viajeInteres);
                labelInteres.setText("Ya no me interesa");
                GuardarViajesInteres();
            } else {
                CargarViajesInteres();
                leInteresa = false;
                labelInteres.setText("Me interesa");
                for (ViajeInteres viajeInteres : listViajesInteres) {
                    if (viajeInteres.getIdUsuario() == usuarioActual.getIdUsuario() && viajeInteres.getIdPublicacion() == publicacion.getIdPublicacion()) {
                        listViajesInteres.remove(viajeInteres);
                        GuardarViajesInteres();
                    }
                }
            }
            panelViaje.updateUI();
        } catch (Exception e) {
            System.out.println("Interes");
        }
    }//GEN-LAST:event_labelInteresMouseClicked

    private void labelBtnExcelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBtnExcelMouseClicked
        CargarViajesInteres();
        CargarUsuarios();
        try {
            // GENERAR EXCEL DE INTERESADOS
            crearExcelInteresados(publicacion, listUsuarios, listViajesInteres);
        } catch (IOException ex) {
            Logger.getLogger(PanelPublicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_labelBtnExcelMouseClicked

    public void crearExcelInteresados(Publicacion publicacion, List<Usuario> listUsuarios, 
                                      List<ViajeInteres> listViajeInteres) throws IOException {
        
        // Filtrar los usuarios interesados en esta publicación
        List<Usuario> usuariosInteresados = listViajeInteres.stream()
                .filter(viaje -> viaje.getIdPublicacion() == publicacion.getIdPublicacion())
                .map(viaje -> listUsuarios.stream()
                        .filter(user -> user.getIdUsuario() == viaje.getIdUsuario())
                        .findFirst()
                        .orElse(null))
                .collect(Collectors.toList());

        // Crear el archivo Excel
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Interesados en " + publicacion.getLugar());

            // Crear la fila de encabezado
            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Lugar de Publicación");
            headerRow.createCell(1).setCellValue("Nombre");
            headerRow.createCell(2).setCellValue("Apellido");

            // Crear estilos de celda con color
            CellStyle lugarStyle = workbook.createCellStyle();
            lugarStyle.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
            lugarStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

            CellStyle nombreApellidoStyle = workbook.createCellStyle();
            nombreApellidoStyle.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
            nombreApellidoStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

            // Aplicar estilos al encabezado
            headerRow.getCell(0).setCellStyle(lugarStyle);
            headerRow.getCell(1).setCellStyle(nombreApellidoStyle);
            headerRow.getCell(2).setCellStyle(nombreApellidoStyle);

            // Agregar el lugar solo en la primera fila
            int rowNum = 1;
            Row row = sheet.createRow(rowNum++);
            Cell lugarCell = row.createCell(0);
            lugarCell.setCellValue(publicacion.getLugar());
            lugarCell.setCellStyle(lugarStyle);

            // Rellenar los nombres y apellidos de los usuarios interesados
            for (Usuario usuario : usuariosInteresados) {
                if (usuario != null) { // Para evitar posibles valores nulos
                    row = sheet.createRow(rowNum++);
                    Cell nombreCell = row.createCell(1);
                    Cell apellidoCell = row.createCell(2);
                    
                    nombreCell.setCellValue(usuario.getNombre());
                    apellidoCell.setCellValue(usuario.getApellido());

                    // Aplicar estilo a las celdas de nombres y apellidos
                    nombreCell.setCellStyle(nombreApellidoStyle);
                    apellidoCell.setCellStyle(nombreApellidoStyle);
                }
            }

            // Agregar una fila al final para mostrar el número total de interesados
            Row totalRow = sheet.createRow(rowNum);
            totalRow.createCell(0).setCellValue("Total de interesados:");
            totalRow.createCell(1).setCellValue(usuariosInteresados.size());

            // Ajustar el tamaño de las columnas
            for (int i = 0; i < 3; i++) {
                sheet.autoSizeColumn(i);
            }

            // Guardar el archivo Excel
            try (FileOutputStream fileOut = new FileOutputStream(ruta + "PUBLI" + publicacion.getIdPublicacion() + publicacion.getLugar() + ".xlsx")) {
                workbook.write(fileOut);
            }
            File file = new File(ruta + "PUBLI" + publicacion.getIdPublicacion() + publicacion.getLugar() + ".xlsx");
            if (file.exists()) {
                Desktop desktop = Desktop.getDesktop();
                desktop.open(file); // Esto abrirá el archivo con la aplicación predeterminada (Excel)
            }
        }
    }
    
    
    public void CargarUsuarios() {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader(ruta + "usuarios.json")
            );
            String lectura = null;
            String resultado = "";
            while ((lectura = br.readLine()) != null) {
                resultado += lectura;
            }
            br.close();

            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray) parser.parse(resultado);
            listUsuarios.clear();
            for (int i = 0; i < jsonArray.size(); i++) {
                Usuario user = new Gson().fromJson(
                        jsonArray.get(i).toString(), Usuario.class
                );

                listUsuarios.add(user);
            }
        } catch (Exception e) {
            System.out.println("No se cargaron los Usuarios del json correctamente");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.panel.PanelImage PanelOpinion;
    private javax.swing.JLabel btnEliminar;
    private org.edisoncor.gui.panel.PanelImage btnEliminarImagen;
    private org.edisoncor.gui.panel.PanelImage btnExcel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel labelBtnExcel;
    private javax.swing.JLabel labelInteres;
    private javax.swing.JLabel labelLugar1;
    private javax.swing.JLabel labelLugar2;
    private javax.swing.JLabel labelLugar3;
    private javax.swing.JLabel labelNombreLugar;
    private javax.swing.JLabel labelNombreLugar2;
    private javax.swing.JLabel labelNombrePersona;
    private javax.swing.JLabel labelNombrePersona2;
    private javax.swing.JLabel labelPresupuesto;
    private javax.swing.JLabel labelPresupuesto2;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private org.edisoncor.gui.panel.PanelImage panelImage6;
    private org.edisoncor.gui.panel.PanelImage panelViaje;
    private javax.swing.JTextPane txtPaneDetalles;
    private javax.swing.JTextPane txtPaneEquipaje;
    private javax.swing.JTextPane txtPaneFechas;
    private javax.swing.JTextPane txtPaneObstaculo;
    // End of variables declaration//GEN-END:variables
}
