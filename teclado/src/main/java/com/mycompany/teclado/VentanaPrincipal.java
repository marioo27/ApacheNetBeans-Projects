/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.teclado;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton_1 = new javax.swing.JButton();
        jButton_2 = new javax.swing.JButton();
        jButton_3 = new javax.swing.JButton();
        jButton_4 = new javax.swing.JButton();
        jButton_5 = new javax.swing.JButton();
        jButton_M = new javax.swing.JButton();
        jButton_A = new javax.swing.JButton();
        jButton_R = new javax.swing.JButton();
        jButton_I = new javax.swing.JButton();
        jButton_O = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonFondo = new javax.swing.JButton();
        jButtonFuente = new javax.swing.JButton();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        jTextField1.setAlignmentX(0.0F);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jPanel2.setLayout(new java.awt.GridLayout(2, 5, 1, 1));

        jButton_1.setText("1");
        jButton_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_1);

        jButton_2.setText("2");
        jButton_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_2);

        jButton_3.setText("3");
        jButton_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_3);

        jButton_4.setText("4");
        jButton_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_4);

        jButton_5.setText("5");
        jButton_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_5);

        jButton_M.setText("M");
        jButton_M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_M);

        jButton_A.setText("A");
        jButton_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_A);

        jButton_R.setText("R");
        jButton_R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_R);

        jButton_I.setText("I");
        jButton_I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_I);

        jButton_O.setText("O");
        jButton_O.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_O);

        jPanel3.setLayout(new java.awt.GridLayout(3, 1, 1, 1));

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonLimpiar);

        jButtonFondo.setText("Fondo");
        jButtonFondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFondoActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonFondo);

        jButtonFuente.setText("Fuente");
        jButtonFuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFuenteActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonFuente);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_1ActionPerformed
        aniadirCaracter("1");
    }//GEN-LAST:event_jButton_1ActionPerformed

    private void jButton_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_2ActionPerformed
        aniadirCaracter("2");
    }//GEN-LAST:event_jButton_2ActionPerformed

    private void jButton_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_3ActionPerformed
        aniadirCaracter("3");
    }//GEN-LAST:event_jButton_3ActionPerformed

    private void jButton_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_4ActionPerformed
        aniadirCaracter("4");
    }//GEN-LAST:event_jButton_4ActionPerformed

    private void jButton_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_5ActionPerformed
        aniadirCaracter("5");
    }//GEN-LAST:event_jButton_5ActionPerformed
    private void jButton_MActionPerformed(java.awt.event.ActionEvent evt) {                                          
        aniadirCaracter("M");
    }                                         
    private void jButton_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AActionPerformed
        aniadirCaracter("A");
    }//GEN-LAST:event_jButton_AActionPerformed
    private void jButton_RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RActionPerformed
        aniadirCaracter("R");
    }//GEN-LAST:event_jButton_RActionPerformed

    private void jButton_IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IActionPerformed
        aniadirCaracter("I");
    }//GEN-LAST:event_jButton_IActionPerformed

    private void jButton_OActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OActionPerformed
        aniadirCaracter("O");
    }//GEN-LAST:event_jButton_OActionPerformed

    private int indiceFondo = 0;

    private void jButtonFondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFondoActionPerformed

        Color[] colores = {
            Color.RED,
            Color.GREEN,
            Color.BLUE,
            Color.YELLOW,
            Color.CYAN,
            Color.MAGENTA,
            Color.ORANGE,
            Color.LIGHT_GRAY,
            Color.PINK,
            Color.DARK_GRAY
        };

        jPanel1.setBackground(colores[indiceFondo]);
        jPanel2.setBackground(jPanel1.getBackground());
        jPanel3.setBackground(jPanel1.getBackground());

        indiceFondo = (indiceFondo + 1) % colores.length;
    }//GEN-LAST:event_jButtonFondoActionPerformed

    private int indiceFuente = 0;

    private void jButtonFuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFuenteActionPerformed

        Font[] fonts = {
            new Font("Serif", Font.BOLD, 18),
            new Font("SansSerif", Font.ITALIC, 18),
            new Font("Monospaced", Font.PLAIN, 18),
            new Font("Dialog", Font.BOLD | Font.ITALIC, 18)
        };

        // Cambiar la fuente del jTextField1 según el índice actual
        jTextField1.setFont(fonts[indiceFuente]);

        // Incrementar el índice y reiniciar si llega al final
        indiceFuente = (indiceFuente + 1) % fonts.length;
    }//GEN-LAST:event_jButtonFuenteActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        jTextField1.setText("");
    }//GEN-LAST:event_jButtonLimpiarActionPerformed


    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped

        char caracter = evt.getKeyChar();

        if (Character.isLowerCase(caracter)) {
            caracter = Character.toUpperCase(caracter);
        }

        if ("12345MARIO".indexOf(caracter) == -1) {
            evt.consume();
            return;
        }

        aniadirCaracter(String.valueOf(caracter));
        evt.consume();
    }//GEN-LAST:event_formKeyTyped

    private void aniadirCaracter(String caracter) {

        if (jTextField1.getText().length() < 5) {
            jTextField1.setText(jTextField1.getText() + caracter);
        } else {
            // Muestra una advertencia si se alcanza el límite
            JOptionPane.showMessageDialog(this, "Límite de caracteres alcanzado (máximo 5)", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonFondo;
    private javax.swing.JButton jButtonFuente;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButton_1;
    private javax.swing.JButton jButton_2;
    private javax.swing.JButton jButton_3;
    private javax.swing.JButton jButton_4;
    private javax.swing.JButton jButton_5;
    private javax.swing.JButton jButton_A;
    private javax.swing.JButton jButton_I;
    private javax.swing.JButton jButton_M;
    private javax.swing.JButton jButton_O;
    private javax.swing.JButton jButton_R;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
