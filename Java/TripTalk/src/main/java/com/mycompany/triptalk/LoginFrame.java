
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


public class LoginFrame extends javax.swing.JFrame {
    private ArrayList<Usuario> listUsuarios = new ArrayList<>();
    private String ruta = "C:\\Users\\arman\\Instituto Tecnológico de Morelia\\DANIEL ADRIAN ROQUE CORTES - Red social de sugerencia de viajes\\Files\\";

    public LoginFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        jLabel1 = new javax.swing.JLabel();
        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        txtFieldCorreo = new javax.swing.JTextField();
        panelImage4 = new org.edisoncor.gui.panel.PanelImage();
        txtFieldPassword = new javax.swing.JPasswordField();
        panelImage5 = new org.edisoncor.gui.panel.PanelImage();
        btnLogin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(360, 360));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoNaranja.png"))); // NOI18N
        panelImage1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoTripTalk.png"))); // NOI18N

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        panelImage1.add(panelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 350, 180));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido");
        panelImage1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 230, -1));

        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/roundedbar.png"))); // NOI18N

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

        javax.swing.GroupLayout panelImage3Layout = new javax.swing.GroupLayout(panelImage3);
        panelImage3.setLayout(panelImage3Layout);
        panelImage3Layout.setHorizontalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelImage3Layout.setVerticalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panelImage1.add(panelImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 290, 60));

        panelImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/roundedbar.png"))); // NOI18N

        txtFieldPassword.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtFieldPassword.setForeground(new java.awt.Color(153, 153, 153));
        txtFieldPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFieldPassword.setText("passworddd");
        txtFieldPassword.setBorder(null);
        txtFieldPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFieldPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFieldPasswordFocusLost(evt);
            }
        });
        txtFieldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFieldPasswordKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelImage4Layout = new javax.swing.GroupLayout(panelImage4);
        panelImage4.setLayout(panelImage4Layout);
        panelImage4Layout.setHorizontalGroup(
            panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage4Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(txtFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        panelImage4Layout.setVerticalGroup(
            panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage4Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(txtFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        panelImage1.add(panelImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        panelImage5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barraNaranja.png"))); // NOI18N

        btnLogin.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogin.setText("Iniciar Sesión");
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
            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        panelImage5Layout.setVerticalGroup(
            panelImage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelImage1.add(panelImage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 220, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registarse");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        panelImage1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 436, 170, 30));

        getContentPane().add(panelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            System.out.println("No se cargaron los archivos json de Usuarios");
        }
    }//GEN-LAST:event_formWindowOpened

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new RegisterFrame().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        String correo = txtFieldCorreo.getText();
        char[] passwordChars = txtFieldPassword.getPassword();
        String pwd = new String(passwordChars);
        boolean existe=false;
        for(Usuario usuario: listUsuarios){
            if(usuario.getCorreo().equalsIgnoreCase(correo) && usuario.getPassword().equals(pwd)){
                existe = true;
                new MenuFrame(usuario).setVisible(true);
                this.dispose();
                break;
            }
        }
        if(!existe){
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
        }
    }//GEN-LAST:event_btnLoginMouseClicked

    private void txtFieldPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldPasswordKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnLoginMouseClicked(null);
        }
    }//GEN-LAST:event_txtFieldPasswordKeyPressed

    private void txtFieldPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldPasswordFocusLost
        char[] passwordChars = txtFieldPassword.getPassword();
        String pwd = new String(passwordChars);
        if(pwd.equals("")){
            txtFieldPassword.setText("passworddd");
            txtFieldPassword.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtFieldPasswordFocusLost

    private void txtFieldPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldPasswordFocusGained
        char[] passwordChars = txtFieldPassword.getPassword();
        String pwd = new String(passwordChars);
        if(pwd.equals("passworddd")){
            txtFieldPassword.setText("");
            txtFieldPassword.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtFieldPasswordFocusGained

    private void txtFieldCorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldCorreoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtFieldPassword.requestFocusInWindow();
        }
    }//GEN-LAST:event_txtFieldCorreoKeyPressed

    private void txtFieldCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldCorreoFocusLost
        if(txtFieldCorreo.getText().equals("")){
            txtFieldCorreo.setText("Correo");
            txtFieldCorreo.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtFieldCorreoFocusLost

    private void txtFieldCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFieldCorreoFocusGained
        if(txtFieldCorreo.getText().equals("Correo")){
            txtFieldCorreo.setText("");
            txtFieldCorreo.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtFieldCorreoFocusGained

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private org.edisoncor.gui.panel.PanelImage panelImage4;
    private org.edisoncor.gui.panel.PanelImage panelImage5;
    private javax.swing.JTextField txtFieldCorreo;
    private javax.swing.JPasswordField txtFieldPassword;
    // End of variables declaration//GEN-END:variables
}
