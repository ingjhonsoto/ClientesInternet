/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import estilos.GestionCeldas;
import estilos.GestionEncabezadoTabla;
import estilos.ModeloTablaLU;
import java.util.ArrayList;
import javax.swing.table.JTableHeader;
import metodos.Placeholder;
import objetos.Estado_cliente;

/**
 *
 * @author Cristhian
 */
public class EstadoCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form EstadoCliente
     */
    ModeloTablaLU dtm_ec;
    ArrayList<Estado_cliente> listaec;
    Estado_cliente additem;
    Placeholder placeholder;
    
    public EstadoCliente() {
        initComponents();
        dtm_ec=new ModeloTablaLU();
        listaec=new ArrayList<>();
        cargar_datos();
        tbl_datos.setModel(dtm_ec);
        placeholder=new Placeholder("Ingrese el ID del estado", txt_id);
        placeholder=new Placeholder("Ingrese la descripciòn", txt_descripcion);
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

        label_id = new javax.swing.JLabel();
        label_descripcion = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_datos = new javax.swing.JTable();
        btn_nuevo = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Estado de Cliente");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/user_state.png"))); // NOI18N

        label_id.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        label_id.setText("ID:");

        label_descripcion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        label_descripcion.setText("Descripción:");

        txt_id.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_id.setEnabled(false);

        txt_descripcion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_descripcion.setEnabled(false);

        tbl_datos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(tbl_datos);

        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/new.png"))); // NOI18N
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/add.png"))); // NOI18N
        btn_agregar.setEnabled(false);
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_actualizar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/update.png"))); // NOI18N
        btn_actualizar.setText("Actualizar");
        btn_actualizar.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_id)
                            .addComponent(label_descripcion))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_id)
                            .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_id)
                        .addGap(23, 23, 23)
                        .addComponent(label_descripcion))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_actualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        txt_id.setEnabled(true);
        txt_descripcion.setEnabled(true);
        btn_agregar.setEnabled(true);
        btn_nuevo.setEnabled(false);
        txt_id.requestFocus();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        txt_id.setEnabled(false);
        txt_descripcion.setEnabled(false);
        btn_agregar.setEnabled(false);
        btn_nuevo.setEnabled(true);
        btn_actualizar.setEnabled(true);
    }//GEN-LAST:event_btn_agregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_descripcion;
    private javax.swing.JLabel label_id;
    private javax.swing.JTable tbl_datos;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
    
    private void cabecera() {
        dtm_ec.addColumn("ID");
        dtm_ec.addColumn("DESCRIPCIÓN");
        dtm_ec.addColumn("FECHA DE MODIFICACIÓN");
    }

    private void cargar_datos() {
        additem = new Estado_cliente("IN", "Inactivo", "01/08/2020");
        listaec.add(additem);
        additem = new Estado_cliente("AC", "Activo", "08/09/2020");
        listaec.add(additem);
        additem = new Estado_cliente("CO", "Corte", "09/10/2020");
        listaec.add(additem);
        additem = new Estado_cliente("PA", "Pagado", "11/11/2020");
        listaec.add(additem);
        additem = new Estado_cliente("DE", "Deudor", "10/12/2020");
        listaec.add(additem);
        additem = new Estado_cliente("PD", "Pendiente de pago", "12/12/2020");
        listaec.add(additem);
    }

    private void llenar_celdas() {
        //copiar datos de la lista a la tabla
        String data[] = new String[3];
        for (int i = 0; i < listaec.size(); i++) {
            data[0] = listaec.get(i).getId();
            data[1] = listaec.get(i).getDescripcion();
            data[2] = listaec.get(i).getFecha_mod();
            dtm_ec.addRow(data);
        }
    }

    private void tabla_cargada() {
        //datos de cabecera
        cabecera();
        //llenado de celdas
        llenar_celdas();
        //estilo de celda
        tbl_datos.getColumnModel().getColumn(0).setCellRenderer(new GestionCeldas("texto"));
        tbl_datos.getColumnModel().getColumn(1).setCellRenderer(new GestionCeldas("texto"));
        tbl_datos.getColumnModel().getColumn(2).setCellRenderer(new GestionCeldas("numerico"));
        //reordenar la tabla
        tbl_datos.getTableHeader().setReorderingAllowed(false);
        //alto de las celdas
        tbl_datos.setRowHeight(30);
        //Ancho de las celdas
        tbl_datos.getColumnModel().getColumn(0).setPreferredWidth(45);
        tbl_datos.getColumnModel().getColumn(1).setPreferredWidth(90);
        tbl_datos.getColumnModel().getColumn(2).setPreferredWidth(120);
        //estilos de cabecera
        JTableHeader jTableHeader = tbl_datos.getTableHeader();
        jTableHeader.setDefaultRenderer(new GestionEncabezadoTabla());
        tbl_datos.setTableHeader(jTableHeader);

    }
}
