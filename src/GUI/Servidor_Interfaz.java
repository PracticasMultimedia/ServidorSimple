package GUI;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import servidorsimple.FileSystem;
import servidorsimple.Connect;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Adrian Jesus
 */
public class Servidor_Interfaz extends javax.swing.JFrame {

    String path;
    Connect sd;

    /**
     * Creates new form Servidor_Interfaz
     */
    public Servidor_Interfaz() {
        initComponents();
        try {
            Image img = ImageIO.read(getClass().getResource("/images/icon.png"));
            this.setIconImage(img);
        } catch (IOException ex) {
        }
        elegirRutaBase.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        cmd.setWrapStyleWord(false);
        cmd.setLineWrap(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        elegirRutaBase = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        cmd = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        elegirbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        udpconnect = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Music Share Server");

        cmd.setColumns(20);
        cmd.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmd.setRows(5);
        jScrollPane1.setViewportView(cmd);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(128, 128, 128), 1, true), "Selección de Ruta Base"));

        elegirbtn.setText("Elegir ruta base");
        elegirbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elegirbtnActionPerformed(evt);
            }
        });

        jLabel2.setText("<html>\nLa selección de su Ruta Base es imprescindible para el correcto funcionamiento de la aplicación. Debe seleccionar una carpeta para que el servidor se ponga en marcha.\n</html>");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info.png"))); // NOI18N
        jLabel3.setText("<html>\n<a href=\"\"> ¿Por qué?</a>\n</html>");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 117, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(elegirbtn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 146, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 38, Short.MAX_VALUE)
                        .add(elegirbtn))
                    .add(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(6, 6, 6))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(128, 128, 128), 1, true), "Conexión Directa "));

        jLabel1.setText("<html>Para permitir la conexión directa de un usuario a través de UDP active el botón:</html>");

        udpconnect.setText("Permitir Conexión Directa");
        udpconnect.setEnabled(false);
        udpconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                udpconnectActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info.png"))); // NOI18N
        jLabel4.setText("<html> <a href=\"\">     ¿Qué es esto?</a> </html>");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(udpconnect))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 117, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, 0)
                .add(udpconnect)
                .add(6, 6, 6))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 255, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo que lanza un dialog para seleccionar la ruta base y lanza el
     * servidor
     *
     * @param evt informacion sobre el evento que llamo a este método
     */
    private void elegirbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elegirbtnActionPerformed
        // TODO add your handling code here:
        int sel = elegirRutaBase.showOpenDialog(this);
        if (sel == JFileChooser.APPROVE_OPTION) {
            path = elegirRutaBase.getSelectedFile().getAbsolutePath();
            out("Se ha establecido la ruta base en: " + path);
            //info.setText("Ruta base: " + path);
            if (sd == null) {
                try {
                    sd = new Connect(path, this);
                    sd.start();
                    out("Creado en servidor...");
                } catch (Exception e) {
                }
            } else {
                sd.setPath(path);
            }
            udpconnect.setEnabled(true);

        }
    }//GEN-LAST:event_elegirbtnActionPerformed

    private void udpconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_udpconnectActionPerformed
        //lanzamos o paramos el servidor udp
        if (udpconnect.isSelected()) {
            sd.initUDPBroadcast();
        } else {
            sd.stopUDPBroadcast();
        }
    }//GEN-LAST:event_udpconnectActionPerformed

    /**
     * Muestra información sobre la selección de ruta base.
     * @param evt 
     */
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this , "<html><justify>"
                + "Para mantener toda la privacidad y seguridad posible,<br>"
                + "no daremos al cliente de esta aplicación acceso a todos<br>"
                + "su sistema de archivos, sino que sólamente podrá ver<br>"
                + "aquellos directorios que cuelguen de la carpeta seleccionada<br>"
                + "en este paso.<br>"
                + "Por ello, el servidor no se iniciará hasta que no indique<br>"
                + "la ruta de su directorio base, ya que, hasta ese momento, la<br>"
                + "aplicación no sabrá qué directorios y archivos puede mostrar<br>"
                + "al Cliente.</justify></html>", "Información", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jLabel3MouseClicked

    /**
     * Muestra información sobre la conexión directa.
     * @param evt 
     */
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "<html>"
                + "La conexión directa permitirá al Cliente poder conextarse<br>"
                + "con el servidor de forma automática, sin tener que conocer<br>"
                + "la dirección IP del Servidor. Si no conoce este dato, la <br>"
                + "conexión directa es la forma más sencilla de iniciar el <br>"
                + "Cliente. Si conoce la dirección IP del Servidor, introducirla<br>"
                + "manualmente es la forma más segura de establecer la conexión."
                + "</html>", "Información", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jLabel4MouseClicked

    /**
     * Este método esta para simplificar la impresion por consola
     *
     * @param s string para imprimir
     */
    public void out(String s) {
        cmd.insert(s + "\n", cmd.getText().length());
    }

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
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Servidor_Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Servidor_Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Servidor_Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Servidor_Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Servidor_Interfaz().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea cmd;
    private javax.swing.JFileChooser elegirRutaBase;
    private javax.swing.JButton elegirbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton udpconnect;
    // End of variables declaration//GEN-END:variables
}
