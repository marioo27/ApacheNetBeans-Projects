/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.garcia_mario_examen_ud2;

import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

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
        jComboBoxEstilos.setVisible(false);
        jTextFieldMantisa.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });
        DefaultComboBoxModel dcm = new DefaultComboBoxModel();
        for (UIManager.LookAndFeelInfo lfi : UIManager.getInstalledLookAndFeels()) {
            dcm.addElement((lfi.getName()));
        }

        jComboBoxEstilos.setModel(dcm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jTextFieldMantisa = new javax.swing.JTextField();
        jPanelNumerosBorrar = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonCA = new javax.swing.JButton();
        jPanelOperaciones = new javax.swing.JPanel();
        jButtonSuma = new javax.swing.JButton();
        jButtonResta = new javax.swing.JButton();
        jButtonMultiplicacion = new javax.swing.JButton();
        jButtonDivision = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();
        jComboBoxFondo = new javax.swing.JComboBox<>();
        jComboBoxEstilos = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCalculadora = new javax.swing.JMenu();
        jMenuItemUser = new javax.swing.JMenuItem();
        jMenuItemLookAndFeel = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldMantisa.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jPanelNumerosBorrar.setLayout(new java.awt.GridLayout(4, 3));

        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanelNumerosBorrar.add(jButton7);

        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanelNumerosBorrar.add(jButton8);

        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanelNumerosBorrar.add(jButton9);

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanelNumerosBorrar.add(jButton4);

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanelNumerosBorrar.add(jButton5);

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanelNumerosBorrar.add(jButton6);

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelNumerosBorrar.add(jButton1);

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanelNumerosBorrar.add(jButton2);

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanelNumerosBorrar.add(jButton3);

        jButtonC.setText("C");
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });
        jPanelNumerosBorrar.add(jButtonC);

        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });
        jPanelNumerosBorrar.add(jButton0);

        jButtonCA.setText("CA");
        jButtonCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCAActionPerformed(evt);
            }
        });
        jPanelNumerosBorrar.add(jButtonCA);

        jPanelOperaciones.setLayout(new java.awt.GridLayout(5, 1));

        jButtonSuma.setText("+");
        jButtonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSumaActionPerformed(evt);
            }
        });
        jPanelOperaciones.add(jButtonSuma);

        jButtonResta.setText("-");
        jButtonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestaActionPerformed(evt);
            }
        });
        jPanelOperaciones.add(jButtonResta);

        jButtonMultiplicacion.setText("*");
        jButtonMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicacionActionPerformed(evt);
            }
        });
        jPanelOperaciones.add(jButtonMultiplicacion);

        jButtonDivision.setText("/");
        jButtonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivisionActionPerformed(evt);
            }
        });
        jPanelOperaciones.add(jButtonDivision);

        jButtonIgual.setText("=");
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualActionPerformed(evt);
            }
        });
        jPanelOperaciones.add(jButtonIgual);

        jComboBoxFondo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Azul", "Amarillo" }));
        jComboBoxFondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFondoActionPerformed(evt);
            }
        });

        jComboBoxEstilos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxEstilos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstilosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldMantisa)
                .addContainerGap())
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanelNumerosBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jPanelOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jComboBoxFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBoxEstilos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jTextFieldMantisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelNumerosBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxEstilos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jMenuCalculadora.setText("Calculadora");

        jMenuItemUser.setText("Nombre Usuario");
        jMenuItemUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUserActionPerformed(evt);
            }
        });
        jMenuCalculadora.add(jMenuItemUser);

        jMenuItemLookAndFeel.setText("LookAndFeel");
        jMenuItemLookAndFeel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLookAndFeelActionPerformed(evt);
            }
        });
        jMenuCalculadora.add(jMenuItemLookAndFeel);

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuCalculadora.add(jMenuItemSalir);

        jMenuBar1.add(jMenuCalculadora);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        comprobarTecla(9);
        aniadirCaracter("9");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButtonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestaActionPerformed
        aniadirCaracter("-");
    }//GEN-LAST:event_jButtonRestaActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        comprobarTecla(7);
        aniadirCaracter("7");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        comprobarTecla(8);
        aniadirCaracter("8");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        comprobarTecla(4);
        aniadirCaracter("4");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        comprobarTecla(5);
        aniadirCaracter("5");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        comprobarTecla(6);
        aniadirCaracter("6");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        comprobarTecla(1);
        aniadirCaracter("1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        comprobarTecla(2);
        aniadirCaracter("2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        comprobarTecla(3);
        aniadirCaracter("3");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        comprobarTecla(0);
        aniadirCaracter("0");
    }//GEN-LAST:event_jButton0ActionPerformed

    int num = 0, num2 = 0;

    private void jButtonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSumaActionPerformed

        aniadirCaracter("+");
    }//GEN-LAST:event_jButtonSumaActionPerformed

    private void jButtonMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicacionActionPerformed
        aniadirCaracter("*");
    }//GEN-LAST:event_jButtonMultiplicacionActionPerformed

    private void jButtonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivisionActionPerformed
        aniadirCaracter("/");
    }//GEN-LAST:event_jButtonDivisionActionPerformed

    private void jButtonCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCAActionPerformed
        jTextFieldMantisa.setText("");
        num = 0;
        num2 = 0;
    }//GEN-LAST:event_jButtonCAActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
        jTextFieldMantisa.setText("");
        num = 0;
        num2 = 0;
    }//GEN-LAST:event_jButtonCActionPerformed

    private void jButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgualActionPerformed

        int resultado = 0;

        if (jTextFieldMantisa.getText().contains("+")) {
            resultado = num + num2;
        } else if (jTextFieldMantisa.getText().contains("-")) {
            resultado = num - num2;
        } else if (jTextFieldMantisa.getText().contains("*")) {
            resultado = num * num2;
        } else if (jTextFieldMantisa.getText().contains("/")) {
            if (num2 != 0) {
                resultado = num / num2;
            } else {
                JOptionPane.showMessageDialog(this, "No se puede dividir entre 0", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }
        String c = "" + resultado;
        jTextFieldMantisa.setText(c);

        num = resultado;
        num2 = 0;
    }//GEN-LAST:event_jButtonIgualActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemLookAndFeelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLookAndFeelActionPerformed
        jComboBoxEstilos.setVisible(true);
    }//GEN-LAST:event_jMenuItemLookAndFeelActionPerformed

    private void jComboBoxEstilosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstilosActionPerformed
        try {
            UIManager.LookAndFeelInfo lookAndFeel = UIManager.getInstalledLookAndFeels()[jComboBoxEstilos.getSelectedIndex()];
            UIManager.setLookAndFeel(lookAndFeel.getClassName());
            SwingUtilities.updateComponentTreeUI(this);

        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            System.out.println("ERROR" + e.getMessage());
        }
    }//GEN-LAST:event_jComboBoxEstilosActionPerformed

    private void jComboBoxFondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFondoActionPerformed

        String color = jComboBoxFondo.getSelectedItem().toString();
        switch (color) {
            case "Rojo" -> {
                jPanelPrincipal.setBackground(Color.RED);
                jPanelOperaciones.setBackground(Color.RED);
                jPanelNumerosBorrar.setBackground(Color.RED);
            }
            case "Azul" -> {
                jPanelPrincipal.setBackground(Color.BLUE);
                jPanelOperaciones.setBackground(Color.BLUE);
                jPanelNumerosBorrar.setBackground(Color.BLUE);
            }
            case "Amarillo" -> {
                jPanelPrincipal.setBackground(Color.YELLOW);
                jPanelOperaciones.setBackground(Color.YELLOW);
                jPanelNumerosBorrar.setBackground(Color.YELLOW);
            }
            default -> {
            }
        }
    }//GEN-LAST:event_jComboBoxFondoActionPerformed

    private void jMenuItemUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUserActionPerformed

        String nombre = JOptionPane.showInputDialog("Introduzca su nombre de usuario");
        JOptionPane.showMessageDialog(this, "Hola, bienvenido " + nombre);

    }//GEN-LAST:event_jMenuItemUserActionPerformed

    public void comprobarTecla(int n) {

        if (!jTextFieldMantisa.getText().contains("+")
                && !jTextFieldMantisa.getText().contains("-")
                && !jTextFieldMantisa.getText().contains("*")
                && !jTextFieldMantisa.getText().contains("/")) {
            num = num * 10 + n;
        } else {
            num2 = num2 * 10 + n;
        }
    }

    private void formKeyTyped(java.awt.event.KeyEvent evt) {

        char caracter = evt.getKeyChar();

        if ("1234567890+-/*=".indexOf(caracter) == -1) {
            evt.consume();
            return;
        }

        aniadirCaracter(String.valueOf(caracter));
        evt.consume();
    }

    private void aniadirCaracter(String c) {
        jTextFieldMantisa.setText(jTextFieldMantisa.getText() + c);
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonCA;
    private javax.swing.JButton jButtonDivision;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonMultiplicacion;
    private javax.swing.JButton jButtonResta;
    private javax.swing.JButton jButtonSuma;
    private javax.swing.JComboBox<String> jComboBoxEstilos;
    private javax.swing.JComboBox<String> jComboBoxFondo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCalculadora;
    private javax.swing.JMenuItem jMenuItemLookAndFeel;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenuItem jMenuItemUser;
    private javax.swing.JPanel jPanelNumerosBorrar;
    private javax.swing.JPanel jPanelOperaciones;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JTextField jTextFieldMantisa;
    // End of variables declaration//GEN-END:variables
}
