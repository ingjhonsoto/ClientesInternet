/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import estilos.GestionCeldas;
import estilos.GestionEncabezadoTabla;
import estilos.ModeloTablaLU;
import static interfaces.Menu.escritorio;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Cristhian
 */
public class DetallesConexion extends javax.swing.JInternalFrame {

    ModeloTablaLU dtm_detalle;
    ArrayList<String> dispo;
    ArrayList<String> ip;
    
    public DetallesConexion() {
        initComponents();
        cargar_datos();
        dtm_detalle=new ModeloTablaLU();
        tbl_datos.setModel(dtm_detalle);
        tabla_cargada();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_regresar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        eti_title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_datos = new javax.swing.JTable();

        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/connection_info.png"))); // NOI18N

        btn_regresar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/back.png"))); // NOI18N
        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        btn_salir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/close.png"))); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        eti_title.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        eti_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eti_title.setText("Detalles de Conexión");

        tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_datos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eti_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eti_title)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_regresar)
                    .addComponent(btn_salir))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        regresar();
        dispose();
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel eti_title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_datos;
    // End of variables declaration//GEN-END:variables

    private void regresar() {
        InfoConexion ic = new InfoConexion();
        escritorio.add(ic);
        try {
            ic.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        ic.show();
    }
    private void cargar_datos(){
        dispo=new ArrayList<>();
        ip=new ArrayList<>();
        dispo.add("PC");
        dispo.add("Laptop");
        dispo.add("Celular");
        ip.add("192.168.6.100");
        ip.add("192.168.6.101");
        ip.add("192.168.6.102");
    }
    private void cabecera(){
        dtm_detalle.addColumn("DISPOSITIVO");
        dtm_detalle.addColumn("IP");
    }
    private void llenar_celdas(){
        String data[]=new String[2];
        for (int i = 0; i < dispo.size(); i++) {
            data[0]=dispo.get(i);
            data[1]=ip.get(i);
            dtm_detalle.addRow(data);
        }
    }
    private void tabla_cargada(){
        cabecera();
        llenar_celdas();
        //estilo de celda
        tbl_datos.getColumnModel().getColumn(0).setCellRenderer(new GestionCeldas("texto"));
        tbl_datos.getColumnModel().getColumn(1).setCellRenderer(new GestionCeldas("numerico"));
        //reordenar la tabla
        tbl_datos.getTableHeader().setReorderingAllowed(false);
        //alto de las celdas
        tbl_datos.setRowHeight(30);        
        //estilos de cabecera
        JTableHeader jTableHeader = tbl_datos.getTableHeader();
        jTableHeader.setDefaultRenderer(new GestionEncabezadoTabla());
        tbl_datos.setTableHeader(jTableHeader);
    }
}
