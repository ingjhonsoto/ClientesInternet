/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import com.sun.glass.events.KeyEvent;
import static interfaces.Menu.escritorio;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import metodos.Validaciones;

/**
 *
 * @author Cristhian
 */
public class RegistroIPs extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegistroIPs
     */
    int num = 0;

    public RegistroIPs() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_title = new javax.swing.JLabel();
        label_ip0 = new javax.swing.JLabel();
        label_subtitle = new javax.swing.JLabel();
        txt_ip0 = new javax.swing.JTextField();
        txt_ip1 = new javax.swing.JTextField();
        txt_ip2 = new javax.swing.JTextField();
        txt_ip3 = new javax.swing.JTextField();
        txt_ip4 = new javax.swing.JTextField();
        txt_ip5 = new javax.swing.JTextField();
        txt_ip6 = new javax.swing.JTextField();
        txt_ip7 = new javax.swing.JTextField();
        txt_ip8 = new javax.swing.JTextField();
        txt_ip9 = new javax.swing.JTextField();
        txt_ip10 = new javax.swing.JTextField();
        txt_ip11 = new javax.swing.JTextField();
        txt_ip12 = new javax.swing.JTextField();
        txt_ip13 = new javax.swing.JTextField();
        txt_ip14 = new javax.swing.JTextField();
        txt_ip15 = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/register_customer.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(355, 380));

        label_title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_title.setText("Registro de IP's");

        label_ip0.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        label_ip0.setText("Equipo Cliente:");

        label_subtitle.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        label_subtitle.setText("Dispositivos Conectados:");

        txt_ip0.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_ip0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ip0KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ip0KeyTyped(evt);
            }
        });

        txt_ip1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_ip1.setEnabled(false);
        txt_ip1.setPreferredSize(new java.awt.Dimension(100, 25));
        txt_ip1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ip1KeyTyped(evt);
            }
        });

        txt_ip2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_ip2.setEnabled(false);
        txt_ip2.setPreferredSize(new java.awt.Dimension(100, 25));
        txt_ip2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ip2KeyTyped(evt);
            }
        });

        txt_ip3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_ip3.setEnabled(false);
        txt_ip3.setPreferredSize(new java.awt.Dimension(100, 25));
        txt_ip3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ip3KeyTyped(evt);
            }
        });

        txt_ip4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_ip4.setEnabled(false);
        txt_ip4.setPreferredSize(new java.awt.Dimension(100, 25));
        txt_ip4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ip4KeyTyped(evt);
            }
        });

        txt_ip5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_ip5.setEnabled(false);
        txt_ip5.setPreferredSize(new java.awt.Dimension(100, 25));
        txt_ip5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ip5KeyTyped(evt);
            }
        });

        txt_ip6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_ip6.setEnabled(false);
        txt_ip6.setPreferredSize(new java.awt.Dimension(100, 25));
        txt_ip6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ip6KeyTyped(evt);
            }
        });

        txt_ip7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_ip7.setEnabled(false);
        txt_ip7.setPreferredSize(new java.awt.Dimension(100, 25));
        txt_ip7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ip7KeyTyped(evt);
            }
        });

        txt_ip8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_ip8.setEnabled(false);
        txt_ip8.setPreferredSize(new java.awt.Dimension(100, 25));
        txt_ip8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ip8KeyTyped(evt);
            }
        });

        txt_ip9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_ip9.setEnabled(false);
        txt_ip9.setPreferredSize(new java.awt.Dimension(100, 25));
        txt_ip9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ip9KeyTyped(evt);
            }
        });

        txt_ip10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_ip10.setEnabled(false);
        txt_ip10.setPreferredSize(new java.awt.Dimension(100, 25));
        txt_ip10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ip10KeyTyped(evt);
            }
        });

        txt_ip11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_ip11.setEnabled(false);
        txt_ip11.setPreferredSize(new java.awt.Dimension(100, 25));
        txt_ip11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ip11KeyTyped(evt);
            }
        });

        txt_ip12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_ip12.setEnabled(false);
        txt_ip12.setPreferredSize(new java.awt.Dimension(100, 25));
        txt_ip12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ip12KeyTyped(evt);
            }
        });

        txt_ip13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_ip13.setEnabled(false);
        txt_ip13.setPreferredSize(new java.awt.Dimension(100, 25));
        txt_ip13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ip13KeyTyped(evt);
            }
        });

        txt_ip14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_ip14.setEnabled(false);
        txt_ip14.setPreferredSize(new java.awt.Dimension(100, 25));
        txt_ip14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ip14KeyTyped(evt);
            }
        });

        txt_ip15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_ip15.setEnabled(false);
        txt_ip15.setPreferredSize(new java.awt.Dimension(100, 25));
        txt_ip15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ip15KeyTyped(evt);
            }
        });

        btn_registrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_ip4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_ip7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_ip10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_ip13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt_ip14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_ip11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_ip8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_ip5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_ip1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_ip2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_ip15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_ip12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_ip3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_ip6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_ip9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(label_subtitle, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(105, 105, 105))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(label_ip0)
                        .addGap(18, 18, 18)
                        .addComponent(txt_ip0, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(label_title)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_ip0)
                    .addComponent(txt_ip0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txt_ip3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_ip6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_ip9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_ip12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_ip15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label_subtitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_ip1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ip2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_ip5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ip4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_ip8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_ip11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_ip14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_ip7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_ip10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_ip13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(btn_registrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_ip0KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip0KeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txt_ip0.getText().isEmpty()) {
                txt_ip1.requestFocus();
                num = Integer.valueOf(JOptionPane.showInputDialog(null, "¿Cuántos dispositivos tiene?", "Verifique su Respuesta", JOptionPane.QUESTION_MESSAGE));
                if (num > 15) {
                    num = Integer.valueOf(JOptionPane.showInputDialog(null, "¿Cuántos dispositivos tiene?", "Verifique su Respuesta", JOptionPane.QUESTION_MESSAGE));
                    habilitar(num);
                } else {
                    habilitar(num);
                }
            }
        }
    }//GEN-LAST:event_txt_ip0KeyReleased

    private void txt_ip0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip0KeyTyped
        metodos.Validaciones val = new Validaciones();
        val.validacion_ip(txt_ip0.getText(), evt);
    }//GEN-LAST:event_txt_ip0KeyTyped

    private void txt_ip1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip1KeyTyped
        metodos.Validaciones val = new Validaciones();
        val.validacion_ip(txt_ip1.getText(), evt);
    }//GEN-LAST:event_txt_ip1KeyTyped

    private void txt_ip4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip4KeyTyped
        metodos.Validaciones val = new Validaciones();
        val.validacion_ip(txt_ip4.getText(), evt);
    }//GEN-LAST:event_txt_ip4KeyTyped

    private void txt_ip7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip7KeyTyped
        metodos.Validaciones val = new Validaciones();
        val.validacion_ip(txt_ip7.getText(), evt);
    }//GEN-LAST:event_txt_ip7KeyTyped

    private void txt_ip10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip10KeyTyped
        metodos.Validaciones val = new Validaciones();
        val.validacion_ip(txt_ip10.getText(), evt);
    }//GEN-LAST:event_txt_ip10KeyTyped

    private void txt_ip13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip13KeyTyped
        metodos.Validaciones val = new Validaciones();
        val.validacion_ip(txt_ip13.getText(), evt);
    }//GEN-LAST:event_txt_ip13KeyTyped

    private void txt_ip2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip2KeyTyped
        metodos.Validaciones val = new Validaciones();
        val.validacion_ip(txt_ip2.getText(), evt);
    }//GEN-LAST:event_txt_ip2KeyTyped

    private void txt_ip5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip5KeyTyped
        metodos.Validaciones val = new Validaciones();
        val.validacion_ip(txt_ip5.getText(), evt);
    }//GEN-LAST:event_txt_ip5KeyTyped

    private void txt_ip8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip8KeyTyped
        metodos.Validaciones val = new Validaciones();
        val.validacion_ip(txt_ip8.getText(), evt);
    }//GEN-LAST:event_txt_ip8KeyTyped

    private void txt_ip11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip11KeyTyped
        metodos.Validaciones val = new Validaciones();
        val.validacion_ip(txt_ip11.getText(), evt);
    }//GEN-LAST:event_txt_ip11KeyTyped

    private void txt_ip14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip14KeyTyped
        metodos.Validaciones val = new Validaciones();
        val.validacion_ip(txt_ip14.getText(), evt);
    }//GEN-LAST:event_txt_ip14KeyTyped

    private void txt_ip3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip3KeyTyped
        metodos.Validaciones val = new Validaciones();
        val.validacion_ip(txt_ip3.getText(), evt);
    }//GEN-LAST:event_txt_ip3KeyTyped

    private void txt_ip6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip6KeyTyped
        metodos.Validaciones val = new Validaciones();
        val.validacion_ip(txt_ip6.getText(), evt);
    }//GEN-LAST:event_txt_ip6KeyTyped

    private void txt_ip9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip9KeyTyped
        metodos.Validaciones val = new Validaciones();
        val.validacion_ip(txt_ip9.getText(), evt);
    }//GEN-LAST:event_txt_ip9KeyTyped

    private void txt_ip12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip12KeyTyped
        metodos.Validaciones val = new Validaciones();
        val.validacion_ip(txt_ip12.getText(), evt);
    }//GEN-LAST:event_txt_ip12KeyTyped

    private void txt_ip15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ip15KeyTyped
        metodos.Validaciones val = new Validaciones();
        val.validacion_ip(txt_ip15.getText(), evt);
    }//GEN-LAST:event_txt_ip15KeyTyped

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        limpiar_cajas();
        JOptionPane.showMessageDialog(this, "Datos guardados con éxito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        dispose();
        regresar();
    }//GEN-LAST:event_btn_registrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registrar;
    private javax.swing.JLabel label_ip0;
    private javax.swing.JLabel label_subtitle;
    private javax.swing.JLabel label_title;
    private javax.swing.JTextField txt_ip0;
    private javax.swing.JTextField txt_ip1;
    private javax.swing.JTextField txt_ip10;
    private javax.swing.JTextField txt_ip11;
    private javax.swing.JTextField txt_ip12;
    private javax.swing.JTextField txt_ip13;
    private javax.swing.JTextField txt_ip14;
    private javax.swing.JTextField txt_ip15;
    private javax.swing.JTextField txt_ip2;
    private javax.swing.JTextField txt_ip3;
    private javax.swing.JTextField txt_ip4;
    private javax.swing.JTextField txt_ip5;
    private javax.swing.JTextField txt_ip6;
    private javax.swing.JTextField txt_ip7;
    private javax.swing.JTextField txt_ip8;
    private javax.swing.JTextField txt_ip9;
    // End of variables declaration//GEN-END:variables

    public void habilitar(int numero) {
        switch (numero) {
            case 1:
                txt_ip1.setEnabled(true);
                break;
            case 2:
                txt_ip1.setEnabled(true);
                txt_ip2.setEnabled(true);
                break;
            case 3:
                txt_ip1.setEnabled(true);
                txt_ip2.setEnabled(true);
                txt_ip3.setEnabled(true);
                break;
            case 4:
                txt_ip1.setEnabled(true);
                txt_ip2.setEnabled(true);
                txt_ip3.setEnabled(true);
                txt_ip4.setEnabled(true);
                break;
            case 5:
                txt_ip1.setEnabled(true);
                txt_ip2.setEnabled(true);
                txt_ip3.setEnabled(true);
                txt_ip4.setEnabled(true);
                txt_ip5.setEnabled(true);
                break;
            case 6:
                txt_ip1.setEnabled(true);
                txt_ip2.setEnabled(true);
                txt_ip3.setEnabled(true);
                txt_ip4.setEnabled(true);
                txt_ip5.setEnabled(true);
                txt_ip6.setEnabled(true);
                break;
            case 7:
                txt_ip1.setEnabled(true);
                txt_ip2.setEnabled(true);
                txt_ip3.setEnabled(true);
                txt_ip4.setEnabled(true);
                txt_ip5.setEnabled(true);
                txt_ip6.setEnabled(true);
                txt_ip7.setEnabled(true);
                break;
            case 8:
                txt_ip1.setEnabled(true);
                txt_ip2.setEnabled(true);
                txt_ip3.setEnabled(true);
                txt_ip4.setEnabled(true);
                txt_ip5.setEnabled(true);
                txt_ip6.setEnabled(true);
                txt_ip7.setEnabled(true);
                txt_ip8.setEnabled(true);
                break;
            case 9:
                txt_ip1.setEnabled(true);
                txt_ip2.setEnabled(true);
                txt_ip3.setEnabled(true);
                txt_ip4.setEnabled(true);
                txt_ip5.setEnabled(true);
                txt_ip6.setEnabled(true);
                txt_ip7.setEnabled(true);
                txt_ip8.setEnabled(true);
                txt_ip9.setEnabled(true);
                break;
            case 10:
                txt_ip1.setEnabled(true);
                txt_ip2.setEnabled(true);
                txt_ip3.setEnabled(true);
                txt_ip4.setEnabled(true);
                txt_ip5.setEnabled(true);
                txt_ip6.setEnabled(true);
                txt_ip7.setEnabled(true);
                txt_ip8.setEnabled(true);
                txt_ip9.setEnabled(true);
                txt_ip10.setEnabled(true);
                break;
            case 11:
                txt_ip1.setEnabled(true);
                txt_ip2.setEnabled(true);
                txt_ip3.setEnabled(true);
                txt_ip4.setEnabled(true);
                txt_ip5.setEnabled(true);
                txt_ip6.setEnabled(true);
                txt_ip7.setEnabled(true);
                txt_ip8.setEnabled(true);
                txt_ip9.setEnabled(true);
                txt_ip10.setEnabled(true);
                txt_ip11.setEnabled(true);
                break;
            case 12:
                txt_ip1.setEnabled(true);
                txt_ip2.setEnabled(true);
                txt_ip3.setEnabled(true);
                txt_ip4.setEnabled(true);
                txt_ip5.setEnabled(true);
                txt_ip6.setEnabled(true);
                txt_ip7.setEnabled(true);
                txt_ip8.setEnabled(true);
                txt_ip9.setEnabled(true);
                txt_ip10.setEnabled(true);
                txt_ip11.setEnabled(true);
                txt_ip12.setEnabled(true);
                break;
            case 13:
                txt_ip1.setEnabled(true);
                txt_ip2.setEnabled(true);
                txt_ip3.setEnabled(true);
                txt_ip4.setEnabled(true);
                txt_ip5.setEnabled(true);
                txt_ip6.setEnabled(true);
                txt_ip7.setEnabled(true);
                txt_ip8.setEnabled(true);
                txt_ip9.setEnabled(true);
                txt_ip10.setEnabled(true);
                txt_ip11.setEnabled(true);
                txt_ip12.setEnabled(true);
                txt_ip13.setEnabled(true);
                break;
            case 14:
                txt_ip1.setEnabled(true);
                txt_ip2.setEnabled(true);
                txt_ip3.setEnabled(true);
                txt_ip4.setEnabled(true);
                txt_ip5.setEnabled(true);
                txt_ip6.setEnabled(true);
                txt_ip7.setEnabled(true);
                txt_ip8.setEnabled(true);
                txt_ip9.setEnabled(true);
                txt_ip10.setEnabled(true);
                txt_ip11.setEnabled(true);
                txt_ip12.setEnabled(true);
                txt_ip13.setEnabled(true);
                txt_ip14.setEnabled(true);
                break;
            case 15:
                txt_ip1.setEnabled(true);
                txt_ip2.setEnabled(true);
                txt_ip3.setEnabled(true);
                txt_ip4.setEnabled(true);
                txt_ip5.setEnabled(true);
                txt_ip6.setEnabled(true);
                txt_ip7.setEnabled(true);
                txt_ip8.setEnabled(true);
                txt_ip9.setEnabled(true);
                txt_ip10.setEnabled(true);
                txt_ip11.setEnabled(true);
                txt_ip12.setEnabled(true);
                txt_ip13.setEnabled(true);
                txt_ip14.setEnabled(true);
                txt_ip15.setEnabled(true);
                break;
        }
    }

    private void limpiar_cajas() {
        txt_ip0.setText("");
        txt_ip1.setText("");
        txt_ip2.setText("");
        txt_ip3.setText("");
        txt_ip4.setText("");
        txt_ip5.setText("");
        txt_ip6.setText("");
        txt_ip7.setText("");
        txt_ip8.setText("");
        txt_ip9.setText("");
        txt_ip10.setText("");
        txt_ip11.setText("");
        txt_ip12.setText("");
        txt_ip13.setText("");
        txt_ip14.setText("");
        txt_ip15.setText("");
    }

    private void regresar() {
        RegistroClientes rc = new RegistroClientes();
        escritorio.add(rc);
        Dimension escritorio_size = escritorio.getSize();
        Dimension rc_size = rc.getSize();
        rc.setLocation((escritorio_size.width - rc_size.width) / 2, (escritorio_size.height - rc_size.height) / 2);
        rc.show();
    }
}
