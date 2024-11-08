
package com.mycompany.triptalk;

import com.google.gson.Gson;
import com.mycompany.triptalk.clases.Usuario;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class UsuariosFrame extends javax.swing.JFrame {
    
    private DefaultListModel<String> listModel = new DefaultListModel<>();
    private ArrayList<Usuario> listUsuarios = new ArrayList<>();
    private String ruta = "C:\\Users\\arman\\Instituto Tecnológico de Morelia\\DANIEL ADRIAN ROQUE CORTES - Red social de sugerencia de viajes\\Files\\";
    
    public UsuariosFrame() {
        initComponents();
        setLocationRelativeTo(null);
        actualizarListaUsuarios();
    }
    
    
    private void cambiarEstadoUsuario(boolean bloquear) {
        int indiceSeleccionado = jListUsuarios.getSelectedIndex();
        if (indiceSeleccionado >= 0) {
            Usuario usuarioSeleccionado = listUsuarios.get(indiceSeleccionado);
            
            // Verificar si el usuario tiene rol "adm"
            if ("adm".equals(usuarioSeleccionado.getRol())) {
                botonBloquear.setEnabled(false);
                botonDesbloquear.setEnabled(false);
            } else {
                botonBloquear.setEnabled(true);
                botonDesbloquear.setEnabled(true);
                
                // Cambiar el estado de bloqueo
                usuarioSeleccionado.setBloqueado(bloquear);
                GuardarUsuarios();
                actualizarListaUsuarios();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un usuario", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }
    // Método para actualizar la lista de usuarios en el JList
    private void actualizarListaUsuarios() {
        cargarUsuarios();
        listModel.clear();
        for (Usuario usuario : listUsuarios) {
            String estado = usuario.isBloqueado() ? "(Bloqueado)" : "(Activo)";
            listModel.addElement(usuario.getIdUsuario() + ":    " + usuario.getNombre() + " " + usuario.getApellido() + " " + estado);
        }
        jListUsuarios.setModel(listModel);
        panelImage1.updateUI();
        GuardarUsuarios();
    }

    // Método para verificar el rol del usuario seleccionado y habilitar/deshabilitar los botones
    private void verificarRolUsuarioSeleccionado() {
        int indiceSeleccionado = jListUsuarios.getSelectedIndex();
        if (indiceSeleccionado >= 0) {
            Usuario usuarioSeleccionado = listUsuarios.get(indiceSeleccionado);

            // Si el usuario tiene rol "adm", deshabilitamos los botones
            if ("adm".equals(usuarioSeleccionado.getRol())) {
                botonBloquear.setEnabled(false);
                botonDesbloquear.setEnabled(false);
            } else {
                // Caso contrario, habilitamos los botones
                botonBloquear.setEnabled(true);
                botonDesbloquear.setEnabled(true);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListUsuarios = new javax.swing.JList<>();
        botonDesbloquear = new org.edisoncor.gui.button.ButtonPopup();
        botonBloquear = new org.edisoncor.gui.button.ButtonPopup();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MARCONaranjaRedondeado.png"))); // NOI18N
        panelImage1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barraNaranja.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USUARIOS");

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        panelImage1.add(panelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 16, -1, -1));

        jListUsuarios.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListUsuarios.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListUsuariosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListUsuarios);

        panelImage1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 56, 340, 140));

        botonDesbloquear.setText("Desbloquear");
        botonDesbloquear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonDesbloquearMouseClicked(evt);
            }
        });
        panelImage1.add(botonDesbloquear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        botonBloquear.setText("Bloquear");
        botonBloquear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonBloquearMouseClicked(evt);
            }
        });
        panelImage1.add(botonBloquear, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jListUsuariosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListUsuariosValueChanged
        verificarRolUsuarioSeleccionado();
    }//GEN-LAST:event_jListUsuariosValueChanged

    private void botonBloquearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBloquearMouseClicked
        cambiarEstadoUsuario(true);
    }//GEN-LAST:event_botonBloquearMouseClicked

    private void botonDesbloquearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDesbloquearMouseClicked
        cambiarEstadoUsuario(false);
    }//GEN-LAST:event_botonDesbloquearMouseClicked
    
    public void GuardarUsuarios(){
        try {
            BufferedWriter bw = new BufferedWriter(
                new FileWriter(ruta+"usuarios.json",false)
            );
            String json = new Gson().toJson(listUsuarios);
            
            bw.write(json);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void cargarUsuarios(){
        try {
            BufferedReader br = new BufferedReader(
                new FileReader(ruta+"usuarios.json")
            );
            String lectura=null;
            String resultado="";
            while((lectura=br.readLine()) != null){
                resultado +=lectura;
            }
            br.close();

            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray)parser.parse(resultado);
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
            java.util.logging.Logger.getLogger(UsuariosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuariosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuariosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuariosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuariosFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonPopup botonBloquear;
    private org.edisoncor.gui.button.ButtonPopup botonDesbloquear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jListUsuarios;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    // End of variables declaration//GEN-END:variables
}
