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
import metodos.Placeholder;
import metodos.Validaciones;

/**
 *
 * @author Cristhian
 */
public class RegistroClientes extends javax.swing.JInternalFrame {

    Placeholder placeholder;

    public RegistroClientes() {
        initComponents();
        iniciar_placeholder();
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
        txt_dni = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        txt_apaterno = new javax.swing.JTextField();
        txt_amaterno = new javax.swing.JTextField();
        cb_direccion = new javax.swing.JComboBox<>();
        txt_celular = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Registro");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/register_customer.png"))); // NOI18N

        label_title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_title.setText("Reistro de Clientes");

        txt_dni.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dniKeyTyped(evt);
            }
        });

        txt_nombres.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombresKeyTyped(evt);
            }
        });

        txt_apaterno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_apaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apaternoKeyTyped(evt);
            }
        });

        txt_amaterno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_amaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_amaternoActionPerformed(evt);
            }
        });
        txt_amaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_amaternoKeyTyped(evt);
            }
        });

        cb_direccion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cb_direccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<-Seleccionar->", "31 de Octubre", "El Porton", "Fatima", "Nomara", "Macacara", "Miraflores", "Santa Rosa" }));

        txt_celular.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_celular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_celularKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_celularKeyTyped(evt);
            }
        });

        btn_registrar.setBackground(new java.awt.Color(102, 102, 255));
        btn_registrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/register.png"))); // NOI18N
        btn_registrar.setText("Registrar");
        btn_registrar.setEnabled(false);
        btn_registrar.setPreferredSize(new java.awt.Dimension(120, 25));
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btn_limpiar.setBackground(new java.awt.Color(102, 255, 102));
        btn_limpiar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/clean.png"))); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.setPreferredSize(new java.awt.Dimension(120, 25));
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_cerrar.setBackground(new java.awt.Color(255, 51, 51));
        btn_cerrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/close.png"))); // NOI18N
        btn_cerrar.setText("Cerrar");
        btn_cerrar.setPreferredSize(new java.awt.Dimension(120, 25));
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cb_direccion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(label_title))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_amaterno)
                                .addComponent(txt_apaterno)
                                .addComponent(txt_nombres)
                                .addComponent(txt_dni))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_title)
                .addGap(18, 18, 18)
                .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_apaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_amaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cb_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_amaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_amaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_amaternoActionPerformed

    private void txt_dniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dniKeyTyped
        metodos.Validaciones validar = new Validaciones();
        validar.validacion_numeros(evt);
        validar.limite_txtdni(txt_dni.getText(), evt);
    }//GEN-LAST:event_txt_dniKeyTyped

    private void txt_nombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombresKeyTyped
        metodos.Validaciones validar = new Validaciones();
        validar.validacion_letras(evt);
    }//GEN-LAST:event_txt_nombresKeyTyped

    private void txt_apaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apaternoKeyTyped
        metodos.Validaciones validar = new Validaciones();
        validar.validacion_letras(evt);
    }//GEN-LAST:event_txt_apaternoKeyTyped

    private void txt_amaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_amaternoKeyTyped
        metodos.Validaciones validar = new Validaciones();
        validar.validacion_letras(evt);
    }//GEN-LAST:event_txt_amaternoKeyTyped

    private void txt_celularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_celularKeyTyped
        metodos.Validaciones validar = new Validaciones();
        validar.validacion_numeros(evt);
        validar.limite_txtcelular(txt_celular.getText(), evt);
    }//GEN-LAST:event_txt_celularKeyTyped

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        clean();
        btn_registrar.setEnabled(false);
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        clean();
        dispose();
        RegistroIPs cargar_rip = new RegistroIPs();
        escritorio.add(cargar_rip);
        Dimension escritorio_size = escritorio.getSize();
        Dimension rip_size = cargar_rip.getSize();
        cargar_rip.setLocation((escritorio_size.width - rip_size.width) / 2, (escritorio_size.height - rip_size.height) / 2);
        cargar_rip.show();
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void txt_celularKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_celularKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            verificar();
        }
    }//GEN-LAST:event_txt_celularKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JComboBox<String> cb_direccion;
    private javax.swing.JLabel label_title;
    private javax.swing.JTextField txt_amaterno;
    private javax.swing.JTextField txt_apaterno;
    private javax.swing.JTextField txt_celular;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_nombres;
    // End of variables declaration//GEN-END:variables

    private void clean() {
        txt_dni.setText("");
        txt_nombres.setText("");
        txt_apaterno.setText("");
        txt_amaterno.setText("");
        cb_direccion.setSelectedIndex(0);
        txt_celular.setText("");
        txt_dni.requestFocus();
    }

    private void verificar() {
        if (txt_dni.getText().isEmpty() || txt_nombres.getText().isEmpty() || txt_apaterno.getText().isEmpty()
                || txt_amaterno.getText().isEmpty() || txt_celular.getText().isEmpty() || cb_direccion.getSelectedIndex() == 0) {
            txt_dni.requestFocus();
            JOptionPane.showMessageDialog(this, "ES OBLIGATORIO RELLENAR TODOS LOS CAMPOS", "ERROR...", JOptionPane.ERROR_MESSAGE);
        } else {
            btn_registrar.setEnabled(true);
        }
    }

    private void iniciar_placeholder() {
        placeholder = new Placeholder("Ingrese su DNI", txt_dni);
        placeholder = new Placeholder("Ingrese su Nombre", txt_nombres);
        placeholder = new Placeholder("Ingrese su Apellido Paterno", txt_apaterno);
        placeholder = new Placeholder("Ingrese su Apellido Materno", txt_amaterno);
        placeholder = new Placeholder("Ingrese su Celular", txt_celular);
    }
}
