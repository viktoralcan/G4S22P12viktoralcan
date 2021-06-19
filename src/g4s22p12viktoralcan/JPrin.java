package g4s22p12viktoralcan;

import Almacen.Archivo;
import Informacion.Datos;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JPrin extends javax.swing.JFrame {

    public JPrin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtE = new javax.swing.JTextField();
        TxtC = new javax.swing.JTextField();
        BtnG = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        BtnLeer = new javax.swing.JButton();
        TxtN = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        jLabel1.setText("Agenda");

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel3.setText("Edad:");

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel4.setText("Correo:");

        TxtE.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N

        TxtC.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N

        BtnG.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        BtnG.setText("Grabar");
        BtnG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGActionPerformed(evt);
            }
        });

        txtArea.setEditable(false);
        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        BtnLeer.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        BtnLeer.setText("Leer");
        BtnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLeerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TxtC)
                                            .addComponent(TxtE, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(BtnG)
                                                .addGap(147, 147, 147)
                                                .addComponent(BtnLeer))
                                            .addComponent(TxtN, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))))))
                        .addGap(0, 117, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnG)
                    .addComponent(BtnLeer))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGActionPerformed
        
        Datos datos = new Datos();
        Archivo archivo = new Archivo ();
        datos.setNombre(TxtN.getText().toString());
        datos.setEdad(Integer.parseInt(TxtE.getText().toString()));
        datos.setCorreo(TxtC.getText().toString());
        archivo.agregaUsuario(datos); 
        
        limpiar();
        
    }//GEN-LAST:event_BtnGActionPerformed

    private void BtnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLeerActionPerformed
        
        List<Datos> listdatos = new ArrayList<>();
        Archivo archivo = new Archivo();
        listdatos = archivo.leerUsuarios();
        
        listdatos.forEach(dato -> {
            System.out.println("Nombre: " + dato.getNombre() + "\t\tEdad: " + 
                    dato.getEdad() + "\tCorreo: " + dato.getCorreo());
        });
        
       /* listdatos.listIterator(datos -> {
            txtArea.setText("Nombre: " + datos.getNombre() + "\t\tEdad: " + 
                    datos.getEdad() + "\tCorreo: " + datos.getCorreo());
        });*/

    }//GEN-LAST:event_BtnLeerActionPerformed

    public void limpiar(){
        TxtN.setText("");
        TxtE.setText("");
        TxtC.setText("");
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
            java.util.logging.Logger.getLogger(JPrin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JPrin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JPrin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JPrin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JPrin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnG;
    private javax.swing.JButton BtnLeer;
    private javax.swing.JTextField TxtC;
    private javax.swing.JTextField TxtE;
    private javax.swing.JTextField TxtN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
