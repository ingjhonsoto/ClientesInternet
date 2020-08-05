/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import estilos.GestionCeldas;
import estilos.GestionEncabezadoTabla;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import objetos.Tipos_user;

/**
 *
 * @author Cristhian
 */
public class TipoUsuario extends javax.swing.JInternalFrame{

    /**
     * Creates new form TipoUsuario
     */
    DefaultTableModel model_table;
    ArrayList<Tipos_user> list_tipou;
    Tipos_user add_tipo;

    public TipoUsuario() {
        initComponents();
        model_table = new DefaultTableModel();
        list_tipou = new ArrayList<>();  
        cargar_datos();
        table_tipos.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        table_tipos.setModel(model_table);
        tabla_cargada();
        popupTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table_tipos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Tipos de Usuario");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/type_of_user.png"))); // NOI18N

        label_title.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        label_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_title.setText("Tipos de Usuario");

        table_tipos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        table_tipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        table_tipos.setOpaque(false);
        jScrollPane1.setViewportView(table_tipos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(label_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_title;
    private javax.swing.JTable table_tipos;
    // End of variables declaration//GEN-END:variables

    private void cabecera() {
        model_table.addColumn("ID");
        model_table.addColumn("DESCRIPCIÓN");
        model_table.addColumn("FECHA");
    }

    private void cargar_datos() {
        add_tipo = new Tipos_user("AD", "ADMINISTRADOR", "12-12-12");
        list_tipou.add(add_tipo);
        add_tipo = new Tipos_user("US", "USUARIO", "11-11-11");
        list_tipou.add(add_tipo);
    }

    private void llenar_celdas() {
        String data[] = new String[3];
        for (int i = 0; i < list_tipou.size(); i++) {
            data[0] = list_tipou.get(i).getId_tipo();
            data[1] = list_tipou.get(i).getDescripcion();
            data[2] = list_tipou.get(i).getFecha_creacion();
            model_table.addRow(data);
        }
    }
    
    private void tabla_cargada(){
        cabecera();
        llenar_celdas();
        table_tipos.getColumnModel().getColumn(0).setCellRenderer(new GestionCeldas("texto"));
        table_tipos.getColumnModel().getColumn(1).setCellRenderer(new GestionCeldas("texto"));
        table_tipos.getColumnModel().getColumn(2).setCellRenderer(new GestionCeldas("numerico"));
        
        table_tipos.getTableHeader().setReorderingAllowed(false);
        table_tipos.setRowHeight(30);
        table_tipos.setGridColor(new java.awt.Color(0, 0, 0));
        
        table_tipos.getColumnModel().getColumn(0).setPreferredWidth(40);
        table_tipos.getColumnModel().getColumn(1).setPreferredWidth(170);
        table_tipos.getColumnModel().getColumn(2).setPreferredWidth(170);
        
        JTableHeader jTableHeader=table_tipos.getTableHeader();
        jTableHeader.setDefaultRenderer(new GestionEncabezadoTabla());
        table_tipos.setTableHeader(jTableHeader);
    }

    private void popupTable(){
        JPopupMenu popupMenu=new JPopupMenu();
        JMenuItem menuItem=new JMenuItem("Editar Datos",new ImageIcon(getClass().getResource("/recursos/edit.png")));
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Editar datos","mensaje",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        popupMenu.add(menuItem);
        table_tipos.setComponentPopupMenu(popupMenu);
    }
}
