
package com.mycompany.triptalk;

import com.google.gson.Gson;
import com.mycompany.triptalk.clases.Pregunta;
import com.mycompany.triptalk.clases.Publicacion;
import com.mycompany.triptalk.clases.Usuario;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;


public class ComentariosFrame extends javax.swing.JFrame {
    
    private Usuario usuarioActual;
    private Publicacion publicacion;
    private GridLayout grid = new GridLayout(1, 1);
    private ArrayList<Pregunta> listPreguntas = new ArrayList<>();
    
    private String ruta = "C:\\Users\\arman\\Instituto Tecnológico de Morelia\\DANIEL ADRIAN ROQUE CORTES - Red social de sugerencia de viajes\\Files\\";

    public ComentariosFrame() {
        initComponents();
    }
    
    public ComentariosFrame(Publicacion publicacion, Usuario usuarioActual) {
        initComponents();
        this.usuarioActual=usuarioActual;
        this.publicacion = publicacion;
        panelComentarios.setLayout(grid);
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

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelComentarios = new org.edisoncor.gui.panel.PanelImage();
        txtFieldComentario = new javax.swing.JTextField();
        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Comentarios de la Publicación");
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

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/panelBlancoRedondeado.png"))); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        panelComentarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/panelBlancoRedondeado.png"))); // NOI18N

        javax.swing.GroupLayout panelComentariosLayout = new javax.swing.GroupLayout(panelComentarios);
        panelComentarios.setLayout(panelComentariosLayout);
        panelComentariosLayout.setHorizontalGroup(
            panelComentariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 683, Short.MAX_VALUE)
        );
        panelComentariosLayout.setVerticalGroup(
            panelComentariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(panelComentarios);

        txtFieldComentario.setBackground(new java.awt.Color(255, 204, 153));
        txtFieldComentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldComentarioActionPerformed(evt);
            }
        });

        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barraNaranja.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enviar");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelImage3Layout = new javax.swing.GroupLayout(panelImage3);
        panelImage3.setLayout(panelImage3Layout);
        panelImage3Layout.setHorizontalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );
        panelImage3Layout.setVerticalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addComponent(txtFieldComentario, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelImage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFieldComentario, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(panelImage3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(panelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldComentarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldComentarioActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // ENVIAR PREGUNTA
        String preguntaString = txtFieldComentario.getText();
        if(preguntaString.isEmpty()){
            JOptionPane.showMessageDialog(null, "¡Antes debes escribir una pregunta!");
        }else{
            int id;
            if (listPreguntas.isEmpty()){
                id=0;
            }else{
                id = listPreguntas.getLast().getIdPregunta() + 1;
            }
            Pregunta pregunta = new Pregunta (id,publicacion.getIdPublicacion(),preguntaString,usuarioActual.getIdUsuario());
            listPreguntas.add(pregunta);
            txtFieldComentario.setText("");
            GuardarPreguntas();
            ActualizarComentarios();
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        CargarPreguntas();
        ActualizarComentarios();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        GuardarPreguntas();
    }//GEN-LAST:event_formWindowClosing
    
    public void ActualizarComentarios(){
        panelComentarios.removeAll();
        grid.setRows(listPreguntas.size());
        for (Pregunta pregunta : listPreguntas) {
            if(publicacion.getIdPublicacion()==pregunta.getIdPublicacion()){
                PanelPregunta panelPregunta = new PanelPregunta(pregunta,usuarioActual);
                panelComentarios.add(panelPregunta);
            }
        }
        panelComentarios.updateUI();
    }
    
    public void CargarPreguntas(){
        try {
            BufferedReader br = new BufferedReader(
                new FileReader(ruta+"preguntas.json")
            );
            String lectura=null;
            String resultado="";
            while((lectura=br.readLine()) != null){
                resultado +=lectura;
            }
            br.close();

            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray)parser.parse(resultado);
            listPreguntas.clear();
            for (int i = 0; i < jsonArray.size(); i++) {
                Pregunta pregunta = new Gson().fromJson(
                    jsonArray.get(i).toString(), Pregunta.class
                );

                listPreguntas.add(pregunta);
            }
        } catch (Exception e) {
            System.out.println("No se cargaron las preguntas del json correctamente");
        }
    }
    
    public void GuardarPreguntas(){
        try {
            BufferedWriter bw = new BufferedWriter(
                new FileWriter(ruta+"preguntas.json",false)
            );
            String json = new Gson().toJson(listPreguntas);
            
            bw.write(json);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void EliminarPregunta(Pregunta pregunta){
        listPreguntas.remove(pregunta);
        GuardarPreguntas();
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
            java.util.logging.Logger.getLogger(ComentariosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComentariosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComentariosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComentariosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComentariosFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.panel.PanelImage panelComentarios;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private javax.swing.JTextField txtFieldComentario;
    // End of variables declaration//GEN-END:variables
}
