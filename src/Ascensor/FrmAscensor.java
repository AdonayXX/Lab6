
package Ascensor;

/**
 *
 * @author ekard
 */
public class FrmAscensor extends javax.swing.JFrame {
    
    private Ascensor ascensor;
    public FrmAscensor() {
        initComponents();
        ascensor = new Ascensor();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        cajaTexto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        spinner = new javax.swing.JSpinner();
        btnSubir = new javax.swing.JButton();
        btnBajar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 355, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 152, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(cajaTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(cajaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel2.setLayout(new java.awt.GridLayout(3, 4));

        boton1.setText("1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        jPanel2.add(boton1);

        boton2.setText("2");
        jPanel2.add(boton2);

        boton3.setText("3");
        jPanel2.add(boton3);

        boton4.setText("4");
        jPanel2.add(boton4);

        boton5.setText("5");
        jPanel2.add(boton5);

        boton6.setText("6");
        jPanel2.add(boton6);

        boton7.setText("7");
        jPanel2.add(boton7);

        boton8.setText("8");
        jPanel2.add(boton8);

        boton9.setText("9");
        jPanel2.add(boton9);

        spinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 9, 1));
        spinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnSubir.setText("Subir");
        btnSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirActionPerformed(evt);
            }
        });

        btnBajar.setText("Bajar");
        btnBajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSubir, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBajar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnSubir)
                        .addGap(25, 25, 25)
                        .addComponent(btnBajar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        int selectedFloor = (int) spinner.getValue(); // Obtener el piso seleccionado en el Spinner
        direccionEnum currentDirection = ascensor.getDireccion(); // Obtener la dirección actual del ascensor
        
        // Llamar al método llamar del ascensor con el piso seleccionado y la dirección actual
        ascensor.llamar(new classPiso(selectedFloor), currentDirection);
        
        // Actualizar el contenido del TextField con el estado actual del ascensor
        actualizarEstadoAscensor();
    }//GEN-LAST:event_boton1ActionPerformed

    private void btnSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirActionPerformed
        ascensor.mover(); // Mover el ascensor (simulación)
        
        // Actualizar el contenido del TextField con el estado actual del ascensor
        actualizarEstadoAscensor();
                                   
    }//GEN-LAST:event_btnSubirActionPerformed

    private void btnBajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajarActionPerformed
        ascensor.mover(); // Mover el ascensor (simulación)
        
        // Actualizar el contenido del TextField con el estado actual del ascensor
        actualizarEstadoAscensor();
    }//GEN-LAST:event_btnBajarActionPerformed

    
    private void actualizarEstadoAscensor() {
        classPiso currentFloor = ascensor.getPisoActual();
        direccionEnum currentDirection = ascensor.getDireccion();
        
        // Actualizar el contenido del TextField con el estado actual del ascensor
        cajaTexto.setText("Piso actual: " + currentFloor + "" + currentDirection);
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
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmAscensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAscensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAscensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAscensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAscensor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton btnBajar;
    private javax.swing.JButton btnSubir;
    private javax.swing.JTextField cajaTexto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner spinner;
    // End of variables declaration//GEN-END:variables
}
