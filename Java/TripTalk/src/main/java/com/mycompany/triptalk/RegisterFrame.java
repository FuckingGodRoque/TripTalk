
package com.mycompany.triptalk;

import com.google.gson.Gson;
import com.mycompany.triptalk.clases.Usuario;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class RegisterFrame extends javax.swing.JFrame {
    
    private ArrayList<Usuario> listUsuarios = new ArrayList<>();
    private String ruta = "C:\\Users\\arman\\Instituto Tecnológico de Morelia\\DANIEL ADRIAN ROQUE CORTES - Red social de sugerencia de viajes\\Files\\";
    
    public RegisterFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        panelCorreo = new org.edisoncor.gui.panel.PanelImage();
        txtFieldCorreo = new javax.swing.JTextField();
        panelNombre = new org.edisoncor.gui.panel.PanelImage();
        txtFieldNombre = new javax.swing.JTextField();
        panelApellido = new org.edisoncor.gui.panel.PanelImage();
        txtFieldApellido = new javax.swing.JTextField();
        panelPwd = new org.edisoncor.gui.panel.PanelImage();
        txtFieldPassword = new javax.swing.JTextField();
        panelImage5 = new org.edisoncor.gui.panel.PanelImage();
        btnLogin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(360, 360));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Captura de pantalla 2024-11-05 194159.png"))); // NOI18N
        panelImage1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoTripTalk.png"))); // NOI18N

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        panelImage1.add(panelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 260, 140));

        panelCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/roundedbar.png"))); // NOI18N

        txtFieldCorreo.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        txtFieldCorreo.setForeground(new java.awt.Color(204, 204, 204));
        txtFieldCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFieldCorreo.setText("Correo");
        txtFieldCorreo.setBorder(null);
        txtFieldCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldCorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldCorreoFocusLost(evt);
            }
        });
        txtFieldCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFieldCorreoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelCorreoLayout = new javax.swing.GroupLayout(panelCorreo);
        panelCorreo.setLayout(panelCorreoLayout);
        panelCorreoLayout.setHorizontalGroup(
            panelCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCorreoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelCorreoLayout.setVerticalGroup(
            panelCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCorreoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panelImage1.add(panelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 290, 60));

        panelNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/roundedbar.png"))); // NOI18N

        txtFieldNombre.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        txtFieldNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFieldNombre.setText("Nombre");
        txtFieldNombre.setBorder(null);
        txtFieldNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldNombreFocusLost(evt);
            }
        });
        txtFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFieldNombreKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelNombreLayout = new javax.swing.GroupLayout(panelNombre);
        panelNombre.setLayout(panelNombreLayout);
        panelNombreLayout.setHorizontalGroup(
            panelNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNombreLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelNombreLayout.setVerticalGroup(
            panelNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNombreLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panelImage1.add(panelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 290, 60));

        panelApellido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/roundedbar.png"))); // NOI18N

        txtFieldApellido.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        txtFieldApellido.setForeground(new java.awt.Color(204, 204, 204));
        txtFieldApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFieldApellido.setText("Apellido");
        txtFieldApellido.setBorder(null);
        txtFieldApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldApellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldApellidoFocusLost(evt);
            }
        });
        txtFieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFieldApellidoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelApellidoLayout = new javax.swing.GroupLayout(panelApellido);
        panelApellido.setLayout(panelApellidoLayout);
        panelApellidoLayout.setHorizontalGroup(
            panelApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelApellidoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelApellidoLayout.setVerticalGroup(
            panelApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelApellidoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panelImage1.add(panelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 290, 60));

        panelPwd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/roundedbar.png"))); // NOI18N

        txtFieldPassword.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        txtFieldPassword.setForeground(new java.awt.Color(204, 204, 204));
        txtFieldPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFieldPassword.setText("Contraseña ");
        txtFieldPassword.setBorder(null);
        txtFieldPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldPasswordFocusLost(evt);
            }
        });
        txtFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldPasswordActionPerformed(evt);
            }
        });
        txtFieldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFieldPasswordKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelPwdLayout = new javax.swing.GroupLayout(panelPwd);
        panelPwd.setLayout(panelPwdLayout);
        panelPwdLayout.setHorizontalGroup(
            panelPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPwdLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(txtFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelPwdLayout.setVerticalGroup(
            panelPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPwdLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panelImage1.add(panelPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        panelImage5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barraNaranja.png"))); // NOI18N

        btnLogin.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogin.setText("Registar");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelImage5Layout = new javax.swing.GroupLayout(panelImage5);
        panelImage5.setLayout(panelImage5Layout);
        panelImage5Layout.setHorizontalGroup(
            panelImage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelImage5Layout.setVerticalGroup(
            panelImage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelImage1.add(panelImage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 240, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Iniciar Sesión");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        panelImage1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 416, 120, 40));

        getContentPane().add(panelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldCorreoFocusGained
        if(txtFieldCorreo.getText().equals("Correo")){
            txtFieldCorreo.setText("");
            txtFieldCorreo.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtFieldCorreoFocusGained

    private void txtFieldCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldCorreoFocusLost
        if(txtFieldCorreo.getText().equals("")){
            txtFieldCorreo.setText("Correo");
            txtFieldCorreo.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_txtFieldCorreoFocusLost

    private void txtFieldPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldPasswordFocusGained
        if(txtFieldPassword.getText().equals("Contraseña ")){
            txtFieldPassword.setText("");
            txtFieldPassword.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtFieldPasswordFocusGained

    private void txtFieldPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldPasswordFocusLost
        if(txtFieldPassword.getText().equals("")){
            txtFieldPassword.setText("Contraseña ");
            txtFieldPassword.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_txtFieldPasswordFocusLost

    private void txtFieldCorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldCorreoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtFieldPassword.requestFocusInWindow();
        }
    }//GEN-LAST:event_txtFieldCorreoKeyPressed

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        String nombre = txtFieldNombre.getText();
        String apellido = txtFieldApellido.getText();
        String correo = txtFieldCorreo.getText();
        String pwd = txtFieldPassword.getText();
        if(
            !correo.equals("") && !correo.equals("Correo") &&
            !pwd.equals("") && !pwd.equals("Contraseña ") &&
            !nombre.equals("") && !nombre.equals("Nombre") &&
            !apellido.equals("") && !apellido.equals("Apellido") 
        ){
            int id = listUsuarios.size();
            Usuario usuario = new Usuario(id,nombre,apellido,pwd,correo,"npc");
            listUsuarios.add(usuario);
            JOptionPane.showMessageDialog(null, nombre.toUpperCase()+" "+apellido.toUpperCase()+", has sido registrado");
            formWindowClosing(null);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Ingresa los datos correctos");
        }
    }//GEN-LAST:event_btnLoginMouseClicked

    private void txtFieldPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldPasswordKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnLoginMouseClicked(null);
        }
    }//GEN-LAST:event_txtFieldPasswordKeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
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
        new LoginFrame().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
        new LoginFrame().setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
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
    }//GEN-LAST:event_formWindowOpened

    private void txtFieldNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldNombreFocusGained
        if(txtFieldNombre.getText().equals("Nombre")){
            txtFieldNombre.setText("");
            txtFieldNombre.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtFieldNombreFocusGained

    private void txtFieldNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldNombreFocusLost
        if(txtFieldNombre.getText().equals("")){
            txtFieldNombre.setText("Nombre");
            txtFieldNombre.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_txtFieldNombreFocusLost

    private void txtFieldNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldNombreKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtFieldApellido.requestFocusInWindow();
        }
    }//GEN-LAST:event_txtFieldNombreKeyPressed

    private void txtFieldApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldApellidoFocusGained
        if(txtFieldApellido.getText().equals("Apellido")){
            txtFieldApellido.setText("");
            txtFieldApellido.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtFieldApellidoFocusGained

    private void txtFieldApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldApellidoFocusLost
        if(txtFieldApellido.getText().equals("")){
            txtFieldApellido.setText("Apellido");
            txtFieldApellido.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_txtFieldApellidoFocusLost

    private void txtFieldApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldApellidoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtFieldCorreo.requestFocusInWindow();
        }
    }//GEN-LAST:event_txtFieldApellidoKeyPressed

    private void txtFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnLogin;
    private javax.swing.JLabel jLabel3;
    private org.edisoncor.gui.panel.PanelImage panelApellido;
    private org.edisoncor.gui.panel.PanelImage panelCorreo;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelImage panelImage5;
    private org.edisoncor.gui.panel.PanelImage panelNombre;
    private org.edisoncor.gui.panel.PanelImage panelPwd;
    private javax.swing.JTextField txtFieldApellido;
    private javax.swing.JTextField txtFieldCorreo;
    private javax.swing.JTextField txtFieldNombre;
    private javax.swing.JTextField txtFieldPassword;
    // End of variables declaration//GEN-END:variables
}
