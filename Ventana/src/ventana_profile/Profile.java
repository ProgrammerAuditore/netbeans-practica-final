/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana_profile;

// Importar mis clases
import clases.*;
import java.awt.Color;
import java.awt.Dimension;
import ventana_pricipal.Principal;
import jpanelimagen.ImagenFondo;

// Importar librerias java
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.text.DefaultCaret;
import ventana_amigos.Amigos;
import paneles.PanelTarjeta;
import ventana_people.People;
import ventana_singup.SingUp;
import watcher.WatcherNotificaciones;
import watcher.singupWatcherTome;

/**
 *
 * @author max98
 */
public class Profile extends javax.swing.JFrame {

    /**
     * Creates new form SingUp
     */
    public Profile() {  
        initComponents();
        this.InicializarVentana();
    }
    
    public Profile(Session session_activa, Session perfil) {
        initComponents();
        this.session_activa = session_activa;
        this.perfil = perfil;
        this.InicializarVentana();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_2_Background = new jpanelimagen.JPanelImagen();
        panel_foto_de_perfil = new javax.swing.JPanel();
        panel_portada = new jpanelimagen.JPanelImagen();
        campo_nombres = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campo_apellidos = new javax.swing.JTextField();
        campo_email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campo_sexo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        campo_nacimiento = new javax.swing.JTextField();
        btnAgregarAmigo = new javax.swing.JButton();
        btnEnviarMensajeTo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        panel_contedor_firmas = new javax.swing.JPanel();
        panel_lista_de_amigos = new jpanelimagen.JPanelImagen();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_de_amigos = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panel_foto_de_perfil.setBackground(new java.awt.Color(255, 255, 255));
        panel_foto_de_perfil.setToolTipText("Click para cambiar el foto de perfil");

        javax.swing.GroupLayout panel_foto_de_perfilLayout = new javax.swing.GroupLayout(panel_foto_de_perfil);
        panel_foto_de_perfil.setLayout(panel_foto_de_perfilLayout);
        panel_foto_de_perfilLayout.setHorizontalGroup(
            panel_foto_de_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );
        panel_foto_de_perfilLayout.setVerticalGroup(
            panel_foto_de_perfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panel_portada.setBackground(new java.awt.Color(204, 255, 255));

        campo_nombres.setText("jTextField1");
        campo_nombres.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Nombre (s):");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Apellido (s):");

        campo_apellidos.setText("jTextField1");
        campo_apellidos.setEnabled(false);

        campo_email.setText("jTextField1");
        campo_email.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Sexo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Correo electronico:");

        campo_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        campo_sexo.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Fecha de nacimiento");

        campo_nacimiento.setText("jTextField1");
        campo_nacimiento.setEnabled(false);

        btnAgregarAmigo.setBackground(new java.awt.Color(255, 102, 102));
        btnAgregarAmigo.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarAmigo.setText("Amigo+1");
        btnAgregarAmigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAgregarAmigoMouseReleased(evt);
            }
        });

        btnEnviarMensajeTo.setBackground(new java.awt.Color(0, 153, 153));
        btnEnviarMensajeTo.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviarMensajeTo.setText("Enviar mensaje");
        btnEnviarMensajeTo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEnviarMensajeToMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout panel_portadaLayout = new javax.swing.GroupLayout(panel_portada);
        panel_portada.setLayout(panel_portadaLayout);
        panel_portadaLayout.setHorizontalGroup(
            panel_portadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_portadaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_portadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_portadaLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1))
                    .addGroup(panel_portadaLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5))
                    .addComponent(campo_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(panel_portadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_portadaLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2))
                    .addComponent(campo_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_portadaLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4))
                    .addComponent(campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel_portadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_portadaLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel3)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_portadaLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(panel_portadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnAgregarAmigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEnviarMensajeTo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(campo_sexo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39))))
        );
        panel_portadaLayout.setVerticalGroup(
            panel_portadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_portadaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_portadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panel_portadaLayout.createSequentialGroup()
                        .addGroup(panel_portadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_portadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_portadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_portadaLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_portadaLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel_portadaLayout.createSequentialGroup()
                        .addComponent(btnAgregarAmigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnviarMensajeTo)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnVolver.setBackground(new java.awt.Color(0, 102, 153));
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnVolverMouseReleased(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Firmar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_contedor_firmasLayout = new javax.swing.GroupLayout(panel_contedor_firmas);
        panel_contedor_firmas.setLayout(panel_contedor_firmasLayout);
        panel_contedor_firmasLayout.setHorizontalGroup(
            panel_contedor_firmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
        );
        panel_contedor_firmasLayout.setVerticalGroup(
            panel_contedor_firmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
        );

        panel_lista_de_amigos.setBackground(new java.awt.Color(204, 255, 255));

        lista_de_amigos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Cargando..." };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lista_de_amigos.setEnabled(false);
        jScrollPane1.setViewportView(lista_de_amigos);

        jLabel6.setText("Lista de amigos");

        javax.swing.GroupLayout panel_lista_de_amigosLayout = new javax.swing.GroupLayout(panel_lista_de_amigos);
        panel_lista_de_amigos.setLayout(panel_lista_de_amigosLayout);
        panel_lista_de_amigosLayout.setHorizontalGroup(
            panel_lista_de_amigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(panel_lista_de_amigosLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_lista_de_amigosLayout.setVerticalGroup(
            panel_lista_de_amigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_lista_de_amigosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1))
        );

        javax.swing.GroupLayout panel_2_BackgroundLayout = new javax.swing.GroupLayout(panel_2_Background);
        panel_2_Background.setLayout(panel_2_BackgroundLayout);
        panel_2_BackgroundLayout.setHorizontalGroup(
            panel_2_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2_BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_2_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_2_BackgroundLayout.createSequentialGroup()
                        .addComponent(panel_lista_de_amigos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(panel_contedor_firmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_2_BackgroundLayout.createSequentialGroup()
                        .addComponent(panel_foto_de_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel_portada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_2_BackgroundLayout.setVerticalGroup(
            panel_2_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2_BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_2_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_foto_de_perfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_portada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_2_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_contedor_firmas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_lista_de_amigos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_2_Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_2_Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcionesDeCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcionesDeCuentaMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_opcionesDeCuentaMouseClicked

    private void btnVolverMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseReleased
       
        this.fncVolver(); // Método
       
    }//GEN-LAST:event_btnVolverMouseReleased

    private void btnEnviarMensajeToMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMensajeToMouseReleased

        this.fncEnviarMensaje(); // Método
       
    }//GEN-LAST:event_btnEnviarMensajeToMouseReleased

    private void btnAgregarAmigoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarAmigoMouseReleased

        this.fncAgregarAmigoPlus(); // Método
        
    }//GEN-LAST:event_btnAgregarAmigoMouseReleased

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        
        this.fncFirmarMuralDePerfil(); // Método
        
    }//GEN-LAST:event_jButton1MouseReleased
    
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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAmigo;
    private javax.swing.JButton btnEnviarMensajeTo;
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextField campo_apellidos;
    private javax.swing.JTextField campo_email;
    private javax.swing.JTextField campo_nacimiento;
    private javax.swing.JTextField campo_nombres;
    private javax.swing.JComboBox<String> campo_sexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lista_de_amigos;
    private jpanelimagen.JPanelImagen panel_2_Background;
    private javax.swing.JPanel panel_contedor_firmas;
    private javax.swing.JPanel panel_foto_de_perfil;
    private jpanelimagen.JPanelImagen panel_lista_de_amigos;
    private jpanelimagen.JPanelImagen panel_portada;
    // End of variables declaration//GEN-END:variables
    Session perfil;
    Session session_activa;
    public boolean ventana_Amigos=false;
    public boolean ventana_People=false;
    private JPanel panel_firmas;
    private boolean mural_activado = false;
    private boolean firmar_activado = false;
    private singupWatcherTome tome;
    private WatcherNotificaciones amigos;

    
    private void InicializarVentana(){
        
        // Este es para JFrame SingUp (No depende de Session)
        this.setLocationRelativeTo(null);
        this.panel_2_Background.setImagenFondo(new ImagenFondo( new java.io.File( Rutas.path_background_jframe_profile ), 1.0f ));
        this.panel_portada.setImagenFondo(new ImagenFondo( new java.io.File( Rutas.path_background_panel ), .2f ));
        this.panel_lista_de_amigos.setImagenFondo(new ImagenFondo( new java.io.File( Rutas.path_background_panel ), .2f ));
        
        // Este es para JFrame SingUp (Si depende de Session)
        this.fncInstertarDatosDePerfilSeleccionado();
        
        // Insertar el titulo de la ventana
        this.setTitle(this.session_activa.getStrNombres() + " - " + this.session_activa.getStrEmail()  );
        
        // * Verificar si hay una conversación con perfil
        if(Storage.fncStorageBuscarUnaLinea(this.session_activa.stgChats, this.perfil.getStrEmail())){
            this.btnEnviarMensajeTo.setText("Mensaje+1");    
        }
        
        // * Verificar amistad con perfil
        String estado = Storage.fncStorageVerificarAmistad(this.session_activa.stgFriends, this.perfil.getStrEmail());     
        switch (estado) {
            case "amigos":
                this.btnEnviarMensajeTo.setText("Mensaje+1");
                this.btnAgregarAmigo.setText("Son "+ estado + "...");
                break;
            case "none":
            case "pendiente":
                this.btnAgregarAmigo.setText("Amigo+1");
                break;
            default:
                this.btnAgregarAmigo.setText("Solicitud "+estado);
                break;
        }
        
        // * Crear panel para las firmas
        this.panel_firmas = new JPanel();
        this.panel_firmas.setPreferredSize(new Dimension(0,0));
        this.panel_firmas.setLayout(null);
        
        // * Crear un scroll para las firmas a mostrar
        JScrollPane jsp = new JScrollPane( this.panel_firmas, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jsp.setBounds(0, 0, this.panel_contedor_firmas.getWidth(), this.panel_contedor_firmas.getHeight());
        jsp.setAutoscrolls(true);
        this.panel_contedor_firmas.add(jsp);

        // * Establecer invisibe para todos los paneles
        this.panel_contedor_firmas.setOpaque(false);
        this.panel_firmas.setOpaque(false);
        jsp.setOpaque(false);
        jsp.getViewport().setOpaque(false);
        
         // * Quitar bordes a todos los paneles
        //this.panel_contedor_firmas.setBorder(null);
        this.panel_firmas.setBorder(null);
        jsp.setBorder(null);
        jsp.getViewport().setBorder(null);
        
        // * Crear un observador para firmas
        System.out.println("stgTome = " + this.perfil.stgTome );
        tome = new singupWatcherTome(
                this.perfil.getStrEmail(), 
                this.perfil.stgTome,
                this.panel_firmas );

        tome.Inicializar();
        
        // * Crear un observador para la lista de amigos
        amigos = new WatcherNotificaciones(
            this.perfil.stgFriends, this.lista_de_amigos);
        
        amigos.setLista_vacio("Sin amigos...");
        amigos.Inicializar();

    }
    
    private void fncInstertarDatosDePerfilSeleccionado() {
        
        // Seleccionar el foto de perfil adecuado para el usuario
        String img_profile = Storage.fncStorageObtenerImgProfile(this.perfil);
        Storage.fncStorageInsertarPicture(this.panel_foto_de_perfil, img_profile, true);
        
        // Insetar los datos personales del usuario
        this.campo_nombres.setText( perfil.getStrNombres() );
        this.campo_apellidos.setText( perfil.getStrApellidos() );
        this.campo_email.setText( perfil.getStrEmail() );
        this.campo_nacimiento.setText( perfil.getStrNacimiento() );
        this.campo_sexo.setSelectedItem( perfil.getStrSexo() );
 
    }
    
    public void fncBienvenidoToPerfil(){
        
        JOptionPane.showMessageDialog(null, "Bienvenido al mural de " + this.perfil.getStrEmail());
        
        // * Verificar si perfil tiene una firma de session_activa
        if( !Storage.fncStorageEncontrarUnaLinea(this.perfil.stgTome, this.session_activa.getStrEmail()) ){
            JOptionPane.showMessageDialog(null, "Deja una firma para el mural de " + this.perfil.getStrEmail());
        }else{
            JOptionPane.showMessageDialog(null, "Haz firmado el mural de " + this.perfil.getStrEmail());
        }
        
    }
    
    private void fncAgregarAmigoPlus() {
        
        Amistad solicitud = new Amistad(this.session_activa);
        solicitud.fncAmistadEnviarSolicitudTo(this.perfil);
        
        // * Verificar la operación realizada
        if( solicitud.getOperacion().equals("cancelado") || solicitud.getOperacion().equals("eliminado") ){
            this.btnAgregarAmigo.setText("Amigo+1");
        }else{
            this.btnAgregarAmigo.setText("Solicitud " + solicitud.getOperacion());
        }
        
        // * Cargar la lista de amigos de perfil
        this.amigos.Inicializar();
        
    }

    private void fncEnviarMensaje(){
            
        // * Restriccion de mensaje
        // Si el perfil seleccionado es amigo de session_activa puede enviar mensaje...
        if(Storage.fncStorageEncontrarUnaLinea(this.session_activa.stgFriends, this.perfil.getStrEmail()+Storage.identificador_amigo1)){
            // * Testing
            System.out.println("Enviar mensaje a ....");

            try {
                // * Intentar capturar el mensaje...
                String mensaje = JOptionPane.showInputDialog(null,"Escribe un mensaje");

                if( mensaje.isEmpty() && mensaje != null ){

                    if(mensaje.isEmpty())
                    JOptionPane.showMessageDialog(null, "El mensaje no puede estar vacio. No fue enviado.");

                }else{

                    // * Enviar mensaje to ...
                    Mensaje conversacion = new Mensaje(this.session_activa, mensaje.trim());
                    conversacion.fncMensajeEnviarMensajeTo(this.perfil);  

                }

            } catch (Exception e) { }
        }else{
            JOptionPane.showMessageDialog(null, "Este perfil no es tu amigo, enviale una solicitud de amistad.");
        }
        
    }

    private void fncFirmarMuralDePerfil() {
        
        // * Verificar si perfil tiene una firma de session_activa
        if( !Storage.fncStorageEncontrarUnaLinea(this.perfil.stgTome, this.session_activa.getStrEmail()) ){
            
            // * Capturar la firma de session_activa
            String firma = "";
            firma += JOptionPane.showInputDialog(null, "Escribir firmar para el mural de " + this.perfil.getStrEmail());
            
            if( firma.length() > this.session_activa.getStrEmail().length()  && firma.length() < 60 ){
                
                // * Formatear la firma
                firma = Storage.fncStorageFormatearMensaje(firma);

                // * Registar el remitente de la firma
                Storage.fncStorageAcoplarUnaLinea(this.perfil.stgTome, this.session_activa.getStrEmail() );

                // * Regitrar la firma del remitente
                Storage.fncStorageAcoplarUnaLinea(this.perfil.stgTome, firma);
                
                // Mostrar el mensaje de operación
                JOptionPane.showMessageDialog(null, "Haz firmado el mural de " + this.perfil.getStrEmail() );

                this.tome.Inicializar();

            }else{
                // Mostrar el mensaje de operación
                JOptionPane.showMessageDialog(null, "La firma, debe tener minimo " 
                        +  this.session_activa.getStrEmail().length() + " un maximo de 60 caracteres.");
            }
        
        }else{
            // Mostrar el mensaje de operación
            JOptionPane.showMessageDialog(null, "Lo siento, solo puede firmar un mural por perfil de usuario.");
        }
        
    }

    private void fncVolver() {
        
        // Se borra la ventana Profile liberando memoria
        this.setVisible(false); // Desaparece la ventana
        this.dispose(); // Se libera la memoria
        
        // Si la ventana Profile es abierto desde la ventana People
        // se devulve a People
        if( this.ventana_People == true ){
            
            // Evitamos que la ventana People se cierre
            People.CerrarVentana = false; 

            // Se inicializa la ventana de People
            People ventana = new People(this.session_activa);
            this.session_activa = null; // En la ventana Profile se elimina session_activa seleccionado
            this.perfil = null; // En la ventana Profile se elimina de perfil seleccionado
            ventana.setVisible(true); // Se visualiza
            
        }
        
        // Si la ventana Profile es abierto desde la ventana SingUp
        // se devulve a SingUp
        else if( this.ventana_Amigos == true ){
            
            // Se inicializa la ventana de Amigos
            Amigos ventana = new Amigos(this.session_activa);
            this.session_activa = null; // En la ventana Profile se elimina session_activa seleccionado
            this.perfil = null; // En la ventana Profile se elimina de perfil seleccionado
            ventana.setVisible(true); // Se visualiza
            
        }
        
        System.out.println("*** Profile:::De vuelto a ventana People");
        
    }

}
