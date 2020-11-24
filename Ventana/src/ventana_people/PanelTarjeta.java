/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana_people;

import clases.Rutas;
import clases.Session;
import clases.Storage;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author victo
 */
public class PanelTarjeta extends javax.swing.JPanel {

    /**
     * Creates new form Cuenta
     */
    public PanelTarjeta() {
        initComponents();
    }
    
    public PanelTarjeta(Session session) {
        initComponents();
        this.perfil = session;
        
        this.campo_nombres.setText( session.getStrNombres() + " " + session.getStrApellidos() );
        this.campo_nombres.setEnabled(false);
        
        this.campo_sexo.setText( "Sexo: " + session.getStrSexo());
        this.campo_sexo.setEnabled(false);
        
        this.campo_email.setText( session.getStrEmail() );
        this.campo_email.setEditable(false);

        
        // Establecer un tamaño al panel para la tarjeta y agregar un imagen de fondo
        this.setSize(600, 135);
        this.fncInsertarPicture(this, getClass().getResource("/img/b2.jpg").getPath(), false);
        
        // Establecer un tamaño al panel para la foto y agregar el imagen del correspondiente...
        this.panel_foto.setSize(165, 135);
        String img_profile = "";
        if( session.getStrImgPerfil().equals("user_default.png") ){
            img_profile = Rutas.path_user_default;
            this.fncInsertarPicture(this.panel_foto, img_profile , false); 
        }else{
            img_profile = Storage.fncStorageCrearRutaProfile(session.getStrEmail(), Rutas.extesion_svg);
            this.fncInsertarPicture(this.panel_foto, img_profile , false);
        }
        
        /*
            * Enviado un mensaje, sin ser am
            ** No he Enviado un mensaje, pero si una solicitud enviada
            # Somos amigos
        */
        
        // Verificar si, si somos amigos...
        String session_friends = Storage.fncStorageCrearRutaProfile(People.session_activa.getStrEmail(), Rutas.extesion_friends);
        if( Storage.fncStorageBuscarUnaLineaProfile(session_friends, this.perfil.getStrEmail() ) ){
            this.somos_amigos = true;
            this.btnAgregarAmigo.setText("Somos amigos");
        }else        
        if( Storage.fncStorageBuscarUnaLineaProfile(session_friends, this.perfil.getStrEmail() + "*") ){
            this.btnAgregarAmigo.setText("Amigo+");
        }
       
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregarAmigo = new javax.swing.JButton();
        btnEnviarMensajeTo = new javax.swing.JButton();
        panel_foto = new javax.swing.JPanel();
        campo_nombres = new javax.swing.JTextField();
        campo_sexo = new javax.swing.JTextField();
        campo_email = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        btnAgregarAmigo.setBackground(new java.awt.Color(255, 102, 102));
        btnAgregarAmigo.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarAmigo.setText("Amigo+");
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

        panel_foto.setPreferredSize(new java.awt.Dimension(165, 135));

        javax.swing.GroupLayout panel_fotoLayout = new javax.swing.GroupLayout(panel_foto);
        panel_foto.setLayout(panel_fotoLayout);
        panel_fotoLayout.setHorizontalGroup(
            panel_fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );
        panel_fotoLayout.setVerticalGroup(
            panel_fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        campo_nombres.setText("jTextField1");

        campo_sexo.setText("jTextField1");

        campo_email.setText("jTextField1");

        jButton3.setBackground(new java.awt.Color(0, 153, 204));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Ver perfil");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campo_nombres, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(campo_sexo)
                    .addComponent(campo_email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEnviarMensajeTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregarAmigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviarMensajeTo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarAmigo)
                    .addComponent(campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(panel_foto, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarMensajeToMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMensajeToMouseReleased
        // TODO add your handling code here:
        
        try{
            String mensaje = JOptionPane.showInputDialog(null, "Saluda a "+ this.perfil.getStrNombres() + " " + this.perfil.getStrApellidos());
            
            if( mensaje.isEmpty() ){
                JOptionPane.showMessageDialog(null, "El mensaje no fue enviado");
            }else{
                                
                // Generar mensaje...
                mensaje = People.session_activa.getStrNombres() + 
                        People.session_activa.getStrApellidos() + 
                        " ("+ People.session_activa.getStrEmail() + "): \n" +
                        mensaje;
                
                // Verificar, Si el Perfil Seleccionado ya habia mandado una mensaje...
                boolean buzon_creado = false;
                
                if( Storage.fncStorageBuscarUnaLineaProfile(People.session_activa.stgFriends, this.perfil.getStrEmail()+"*") ){
                    
                    // Recuperar la conversacion creado por this.perfil.getStrEmail() 
                    // * Los mensajese se agregen en la conversacion la cuenta de this.perfil.getStrEmail()
                    // * Se agrega People.session_activa.getStrEmail() en la cuenta de this.perfil.getStrEmail() 
                    // para notificar que ya se a respondido su mensaje.
                    // * Se copia la conversa creado por this.perfil.getStrEmail() a la cuenta de this.perfil.getStrEmail()
                    
                    // ********* TESTING
                    System.out.println("ESTAGE D ");
                    
                    // * Los mensajese se agregen en la conversacion la cuenta de this.perfil.getStrEmail()
                    String buzo_chat =  Storage.fncStorageCrearRutaChats(this.perfil.getStrEmail(), People.session_activa.getStrEmail());
                    System.out.println("RTT " + buzo_chat);
                    Storage.fncStorageAcoplarUnaLinea(buzo_chat, mensaje);
                    
                    // Se agrega People.session_activa.getStrEmail() en la cuenta de this.perfil.getStrEmail() 
                    String perfil_friends = Storage.fncStorageCrearRutaProfile(this.perfil.getStrEmail(), Rutas.extesion_friends);
                    Storage.fncStorageEliminarUnaLinea(new File(perfil_friends), People.session_activa.getStrEmail() + "*");
                    Storage.fncStorageAcoplarUnaLinea(perfil_friends, People.session_activa.getStrEmail() + "*");
                    
                    // * Se copia la conversa creado por this.perfil.getStrEmail() a la cuenta de this.perfil.getStrEmail()
                    String buzon_clone = Storage.fncStorageCrearRutaChats(People.session_activa.getStrEmail(), this.perfil.getStrEmail());
                    Storage.fncStorageCopiarArchivo(new File(buzo_chat), buzon_clone);
                    
                    // Mostrar un mensaje de exitos...
                    if( 
                       Storage.fncStorageBuscarUnaLineaProfile(this.perfil.stgFriends, People.session_activa.getStrEmail()+"*") 
                    && Storage.fncStorageBuscarUnaLineaProfile(People.session_activa.stgFriends, this.perfil.getStrEmail()+"*")
                    ){
                        JOptionPane.showMessageDialog(null, "Mensaje enviado." + "\nPuedes abrir la conersacion en la lista de amigos.");
                    }else{
                        JOptionPane.showMessageDialog(null, this.perfil.getStrEmail() +  " te ha enviado un mensaje previamente."
                        + "\nPuedes abrir la conersacion en la lista de amigos.");
                    }
                    
                    
                
                    buzon_creado = true;
                }else
                if( Storage.fncStorageBuscarUnaLineaProfile(this.perfil.stgFriends, People.session_activa.getStrEmail()+"*") ){
                    
                    
                    // ##########  Agregando mensanjes en una conversacion que tengo con this.perfil.getStrEmail() ... (INICIO)
                    
                    // Utilizar la conversacion que tengo con this.perfil.getStrEmail() 
                    // * Agregar el nuevo mensaje en People.session_activa.getStrEmail() ,
                    // la conversacion que tengo con this.perfil.getStrEmail()
                    
                    // ********* TESTING
                    System.out.println("ESTAGE C");
                    // * Agregar el nuevo mensaje en People.session_activa.getStrEmail() con this.perfil.getStrEmail()
                    String buzo_chat =  Storage.fncStorageCrearRutaChats(People.session_activa.getStrEmail(), this.perfil.getStrEmail());
                    
                    // ********* TESTING
                    System.out.println("ESTAGE C >>> mensaje capturado ::: " + buzo_chat);
                    
                    if( new File(buzo_chat).exists() ){
                        System.out.println("ESTAGE C >>> mensaje capturado");
                        Storage.fncStorageAcoplarUnaLinea(buzo_chat, mensaje);
                        JOptionPane.showMessageDialog(null, "Mensaje+");
                    }
                    // ##########  Agregando mensanjes en una conversacion que tengo con this.perfil.getStrEmail()... (FIN)
                    
                    
                    // ########## Recuperando la conversacion previa... (INICIO)
                    String chat_perfil = Storage.fncStorageCrearRutaChats(this.perfil.getStrEmail(), People.session_activa.getStrEmail());
                    
                    // ********* TESTING
                    System.out.println("ESTAGE C >>> 2A ::: " +  chat_perfil);
                    
                    // Verificar si la conversacion que en pefil existe o no ... y si no 
                    // la conservacion de session_activa se copa a perfil .. eso para tener 
                    // la misam conversacion.
                    if( new File(chat_perfil).exists() ){
                        
                        System.out.println("ESTAGE C >>> 2A");
                        
                        Storage.fncStorageAcoplarUnaLinea(chat_perfil, mensaje);
                        JOptionPane.showMessageDialog(null, People.session_activa.getStrEmail() + " tienes una conversación previamente con " + this.perfil.getStrEmail()+" ."
                        + "\nPuedes abrir la conersacion en la lista de amigos.");
                        
                        // Registrar como perfil de interes... a mi lista de amigos... de nuevo
                        String session_friends =  Storage.fncStorageCrearRutaProfile(People.session_activa.getStrEmail(), Rutas.extesion_friends);
                        Storage.fncStorageEliminarUnaLinea(new File(session_friends), this.perfil.getStrEmail() + "*");
                        Storage.fncStorageAcoplarUnaLinea(session_friends, this.perfil.getStrEmail() + "*");
                    
                    }
                    
                    // * Activar este si quieres que se vea en la lista de amigos de session_activa
                    // Registrar como perfil de interes... a mi lista de amigos...
                    // Storage.fncStorageEliminarUnaLinea(new File(session_friends), this.perfil.getStrEmail() + "*");
                    // Storage.fncStorageAcoplarUnaLinea(session_friends, this.perfil.getStrEmail() + "*");
                    
                    
                    // ########## Recuperando la conversacion previa... (FIN)
                    
                    
                    buzon_creado = true;
                }
                
                
                
                if( Storage.fncStorageBuscarUnaLineaProfile(People.session_activa.stgFriends, this.perfil.getStrEmail()+"*") == false ){
                    
                    if(buzon_creado == false){
                        
                        // * Crear una converacion .chats para la cuenta this.perfil.getStrEmail() en la cuenta People.session_activa.getStrEmail()  
                        String session_friends = Storage.fncStorageCrearRutaChats(People.session_activa.getStrEmail(), this.perfil.getStrEmail());
                        
                        if(new File(session_friends).createNewFile()){
                            
                            // Crear una conversacion y notificarle a this.perfil.getStrEmail()
                            // * Crear una converacion .chats para la cuenta this.perfil.getStrEmail() en la cuenta People.session_activa.getStrEmail() 
                            // * Se agrega el primer mensaje o saludo
                            // * Se agrega  People.session_activa.getStrEmail() en la lista de amigos .friends de this.perfil.getStrEmail()
                            // para que constente el mensaje , es decir, notificarle a this.perfil.getStrEmail()
                            
                            // ********* TESTING
                            System.out.println("ESTAGE A ");
                        
                            // * Se agrega el primer mensaje o saludo
                            Storage.fncStorageAcoplarUnaLinea(session_friends, mensaje);
                            
                            // * Se agrega  People.session_activa.getStrEmail() en la lista de amigos .friends de this.perfil.getStrEmail()
                            Storage.fncStorageAcoplarUnaLinea(this.perfil.stgFriends, People.session_activa.getStrEmail()+"*");
                            
                            JOptionPane.showMessageDialog(null, "El mensaje se ha enviado, felicidades.");
                            
                        }else{
                            
                            // ********* TESTING
                            System.out.println("ESTAGE B ");
                            System.out.println("El buzon .. no lo cree ... ya existe en " +  session_friends);
                            
                            // Los mensajes se escriben, en la conversacion ya existe
                            String buzo_chat =  Storage.fncStorageCrearRutaChats(People.session_activa.getStrEmail(), this.perfil.getStrEmail());                         
                            
                            // ********* TESTING
                            System.out.println("XXXX  buzo_chat " + buzo_chat);
                            Storage.fncStorageAcoplarUnaLinea(buzo_chat, mensaje);
                            
                            
                            Storage.fncStorageEliminarUnaLinea(new File(this.perfil.stgFriends), People.session_activa.getStrEmail() + "*");
                            Storage.fncStorageAcoplarUnaLinea(this.perfil.stgFriends, People.session_activa.getStrEmail() + "*");
                            
                            //String path_converse = Storage.fncStorageCrearRutaChats(this.perfil.getStrEmail(), People.session_activa.getStrEmail());
                            //Storage.fncStorageCopiarArchivo(new File(buzo_chat), path_converse);
                            
                            JOptionPane.showMessageDialog(null, "El mensaje se ha enviado al usuario " +  this.perfil.getStrEmail() +".");
                            
                            

                            buzon_creado = true;
                        
                        }
                    }
                    
                }
 
            }
        }catch(Exception e){}
        
    }//GEN-LAST:event_btnEnviarMensajeToMouseReleased
    
    private void btnAgregarAmigoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarAmigoMouseReleased
        // TODO add your handling code here:
        /*
        String session_friends = Storage.fncStorageCrearRutaProfile(People.session_activa.getStrEmail(), Rutas.extesion_friends);
        String session_chats = Storage.fncStorageCrearRutaProfile(People.session_activa.getStrEmail(), Rutas.extesion_chats);
        
        if(this.somos_amigos == true){
            int respuesta = JOptionPane.showConfirmDialog(null, this.perfil.getStrNombres() + " y tú son amigos.\nDeseas eliminar de tu lista de amigos?");
            
            if(respuesta == 0){
                // Eliminar de mi lista de amigos
                //Storage.fncStorageEliminarUnaLinea(new File(session_friends), this.perfil.getStrEmail() );
                
                // Si tenemos una conversacion pendiente, entonces te los paso
                if( Storage.fncStorageBuscarUnaLinea(session_chats, this.perfil.getStrEmail()) ){
                    
                    try {
                        //Storage.fncStorageAcoplarUnaLinea(session_friends, this.perfil.getStrEmail() + "*" );
                        String pathA = Storage.fncStorageCrearRutaChats(People.session_activa.getStrEmail(), this.perfil.getStrEmail(), Rutas.storage_chats);
                        String pathB = Storage.fncStorageCrearRutaChats(this.perfil.getStrEmail(), People.session_activa.getStrEmail(), Rutas.storage_chats);
                        Storage.fncStorageMoverArchivo(new File(pathA), pathB );
                    } catch (IOException ex) {
                        Logger.getLogger(PanelTarjeta.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
                
                //this.btnAgregarAmigo.setText("Amigos+");
            }
            
        }
       */
        
    }//GEN-LAST:event_btnAgregarAmigoMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAmigo;
    private javax.swing.JButton btnEnviarMensajeTo;
    private javax.swing.JTextField campo_email;
    private javax.swing.JTextField campo_nombres;
    private javax.swing.JTextField campo_sexo;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel panel_foto;
    // End of variables declaration//GEN-END:variables
    private Session perfil;
    private Session session;
    private boolean solicitud_enviada = false;
    private boolean somos_amigos = false;
    private boolean chat_pendiente = false;
    
    private void fncInsertarPicture(JPanel contenedor, String url, boolean vaciar){
        
        if(vaciar) contenedor.removeAll();
        
        System.out.println(url);
        ImageIcon icono = new ImageIcon( url );
        JLabel etiquetaImagen = new JLabel();
        etiquetaImagen.setBounds(0, 0, contenedor.getWidth(), contenedor.getHeight());
        etiquetaImagen.setIcon( new ImageIcon(icono.getImage().getScaledInstance(etiquetaImagen.getWidth(), etiquetaImagen.getHeight(), Image.SCALE_SMOOTH)) );
        contenedor.add(etiquetaImagen);
        
        if(vaciar) contenedor.validate();
        if(vaciar) contenedor.repaint();
    }
}
