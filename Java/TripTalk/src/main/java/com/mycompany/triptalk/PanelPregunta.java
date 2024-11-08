
package com.mycompany.triptalk;

import com.google.gson.Gson;
import com.mycompany.triptalk.clases.Pregunta;
import com.mycompany.triptalk.clases.Publicacion;
import com.mycompany.triptalk.clases.Respuesta;
import com.mycompany.triptalk.clases.Usuario;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class PanelPregunta extends javax.swing.JPanel {
    
    private Pregunta pregunta;
    private Usuario usuarioActual;
    private ArrayList<Usuario> listUsuarios = new ArrayList<>();
    private ArrayList<Respuesta> listRespuestas = new ArrayList<>();
    
    private String ruta = "C:\\Users\\arman\\Instituto Tecnológico de Morelia\\DANIEL ADRIAN ROQUE CORTES - Red social de sugerencia de viajes\\Files\\";
    
    public PanelPregunta() {
        initComponents();
    }
    
    public PanelPregunta(Pregunta pregunta, Usuario usuarioActual) {
        initComponents();
        this.pregunta=pregunta;
        this.usuarioActual=usuarioActual;
        ActualizarInfo();
    }
    
    public void ActualizarInfo(){
        if(usuarioActual.getRol().equalsIgnoreCase("npc")){
            btnEliminar.setVisible(false);
            btnEliminarImagen.setVisible(false);
        }
        Usuario usuarioPregunta = obtenerUsuario(pregunta.getIdUsuario());
        labelNombre.setText(usuarioPregunta.getNombre()+" "+usuarioPregunta.getApellido());
        txtPanelPregunta.setText(pregunta.getPregunta());
        txtPaneRespuestas.setText("");
        ActualizarRespuestas();
    }
    
    public void ActualizarRespuestas(){
        CargarRespuestas();
        for (Respuesta respuesta : listRespuestas) {
            if (respuesta.getIdPregunta()== pregunta.getIdPregunta()) {
                Usuario usuario = obtenerUsuario(respuesta.getIdUsuario());
                if (usuario != null) {
                    String textoRespuesta = usuario.getNombre() + " " + usuario.getApellido() + ": " + respuesta.getRespuesta() + "\n";
                    // Agregar la respuesta al text pane
                    txtPaneRespuestas.setText(txtPaneRespuestas.getText()+textoRespuesta);
                }
            }
        }
        panelImage1.updateUI();
    }
    
    public void CargarUsuarios(){
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
    
    public void CargarRespuestas(){
        try {
            BufferedReader br = new BufferedReader(
                new FileReader(ruta+"respuestas.json")
            );
            String lectura=null;
            String resultado="";
            while((lectura=br.readLine()) != null){
                resultado +=lectura;
            }
            br.close();

            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray)parser.parse(resultado);
            listRespuestas.clear();
            for (int i = 0; i < jsonArray.size(); i++) {
                Respuesta respuesta = new Gson().fromJson(
                    jsonArray.get(i).toString(), Respuesta.class
                );

                listRespuestas.add(respuesta);
            }
        } catch (Exception e) {
            System.out.println("No se cargaron las respuestas del json correctamente");
        }
    }
    
    public void GuardarRespuestas(){
        try {
            BufferedWriter bw = new BufferedWriter(
                new FileWriter(ruta+"respuestas.json",false)
            );
            String json = new Gson().toJson(listRespuestas);
            
            bw.write(json);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Usuario obtenerUsuario(int idUsuario) {
        CargarUsuarios();
        for (Usuario usuario : listUsuarios) {
            if (usuario.getIdUsuario() == idUsuario) {
                return usuario;
            }
        }
        return null; // Retorna null si no se encuentra el usuario
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
        labelNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtFieldResponder = new javax.swing.JTextField();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtPaneRespuestas = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtPanelPregunta = new javax.swing.JTextPane();
        btnEliminarImagen = new org.edisoncor.gui.panel.PanelImage();
        btnEliminar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MARCONaranjaRedondeado.png"))); // NOI18N
        panelImage1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNombre.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(255, 153, 51));
        labelNombre.setText("jLabel1");
        panelImage1.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 15, 450, 19));

        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Respuestas:    Escribe una respuesta al comentario");
        panelImage1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 544, 20));

        txtFieldResponder.setBackground(new java.awt.Color(249, 231, 212));
        txtFieldResponder.setForeground(new java.awt.Color(51, 51, 51));
        panelImage1.add(txtFieldResponder, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 510, -1));

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barraNaranja.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enviar");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        panelImage1.add(panelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, -1, 22));

        txtPaneRespuestas.setEditable(false);
        jScrollPane3.setViewportView(txtPaneRespuestas);

        panelImage1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 610, 69));

        jScrollPane8.setBorder(null);

        txtPanelPregunta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPanelPregunta.setText("Aquí debe ir una pregunta");
        jScrollPane8.setViewportView(txtPanelPregunta);

        panelImage1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 600, 60));

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
            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        btnEliminarImagenLayout.setVerticalGroup(
            btnEliminarImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelImage1.add(btnEliminarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 30, 30));

        add(panelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 260));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        String respuestaString = txtFieldResponder.getText();
        if(respuestaString.isEmpty()){
            JOptionPane.showMessageDialog(null, "¡Antes debes escribir una respuesta!");
        }else{
            int id;
            if(listRespuestas.isEmpty()){
                id=0;
            }else{
               id = listRespuestas.getLast().getIdRespuesta() + 1;
            }
            Respuesta respuesta = new Respuesta(id,pregunta.getIdPregunta(),respuestaString,usuarioActual.getIdUsuario());
            listRespuestas.add(respuesta);
            txtFieldResponder.setText("");
            GuardarRespuestas();
            ActualizarRespuestas();
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        ComentariosFrame comentariosFrame = (ComentariosFrame) SwingUtilities.getWindowAncestor(PanelPregunta.this);
        try {
            comentariosFrame.EliminarPregunta(pregunta);
            comentariosFrame.ActualizarComentarios();
        } catch (Exception ex) {
            System.out.println("No se pudo eliminar el comentario");
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnEliminarImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarImagenMouseClicked

    }//GEN-LAST:event_btnEliminarImagenMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnEliminar;
    private org.edisoncor.gui.panel.PanelImage btnEliminarImagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel labelNombre;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private javax.swing.JTextField txtFieldResponder;
    private javax.swing.JTextPane txtPaneRespuestas;
    private javax.swing.JTextPane txtPanelPregunta;
    // End of variables declaration//GEN-END:variables
}
