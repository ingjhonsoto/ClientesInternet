/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

//pauetes
import estilos.GestionCeldas;
import estilos.GestionEncabezadoTabla;
import estilos.ModeloTablaLU;
import static interfaces.Menu.escritorio;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;
import metodos.Placeholder;
import objetos.Datos_user;

/**
 *
 * @author jsoto
 */
public class ListarUsuarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListarUsuarios
     */
    ModeloTablaLU dtm_lu;
    ArrayList<Datos_user> listau;
    Datos_user additem;
    Placeholder placeholder;
    TableRowSorter trs;
    int rowNumber=0;

    public ListarUsuarios() {
        initComponents();
        dtm_lu = new ModeloTablaLU();
        listau = new ArrayList<>();
        cargar_datos();
        tbl_usuarios.setModel(dtm_lu);
        placeholder = new Placeholder("Ingrese datos para iniciar el filtrado", txt_buscar);
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        label_title = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_usuarios = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btn_nuevo = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Listar Usuarios");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/user_info.png"))); // NOI18N

        label_title.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        label_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_title.setText("Lista de Usuarios");

        txt_buscar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_buscarKeyTyped(evt);
            }
        });

        btn_buscar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/search.png"))); // NOI18N

        tbl_usuarios.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbl_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        tbl_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_usuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_usuarios);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addComponent(label_title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(319, Short.MAX_VALUE)
                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(303, 303, 303))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Opciones");

        btn_nuevo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/register.png"))); // NOI18N
        btn_nuevo.setText("Nuevo Usuario");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_cerrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/close.png"))); // NOI18N
        btn_cerrar.setText("Cerrar");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(btn_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(btn_nuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1130, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        administrar_usuario();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void txt_buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyTyped
        txt_buscar.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + txt_buscar.getText(), 1));
            }
        });
        trs = new TableRowSorter(dtm_lu);
        tbl_usuarios.setRowSorter(trs);
    }//GEN-LAST:event_txt_buscarKeyTyped

    private void tbl_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_usuariosMouseClicked
        if (SwingUtilities.isRightMouseButton(evt)) {
            Point p = evt.getPoint();
            rowNumber = tbl_usuarios.rowAtPoint(p);
            popupTable();
        }
    }//GEN-LAST:event_tbl_usuariosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_title;
    private javax.swing.JTable tbl_usuarios;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables

    private void cabecera() {
        dtm_lu.addColumn("ID");
        dtm_lu.addColumn("APELLIDOS");
        dtm_lu.addColumn("NOMBRES");
        dtm_lu.addColumn("CELULAR");
        dtm_lu.addColumn("NOM_USER");
        dtm_lu.addColumn("PASSWORD");
        dtm_lu.addColumn("ESTADO");
        dtm_lu.addColumn("TIPO");
    }

    private void cargar_datos() {
        additem = new Datos_user("001", "Soto Navarro", "Cristhian Arturo", "976452348", "Csoto", "soto1999", "Activo", "Administrador");
        listau.add(additem);
        additem = new Datos_user("002", "Navarro Castro", "Maria Carolina", "966612995", "Admin", "Admin", "Activo", "Usuario");
        listau.add(additem);
        additem = new Datos_user("003", "Soto Navarro", "Jhon Alex", "976452348", "Jsoto", "soto01", "Activo", "Administrador");
        listau.add(additem);
    }

    private void llenar_celdas() {
        //copiar datos de la lista a la tabla
        String data[] = new String[12];
        for (int i = 0; i < listau.size(); i++) {
            data[0] = listau.get(i).getId();
            data[1] = listau.get(i).getApellidos();
            data[2] = listau.get(i).getNombres();
            data[3] = listau.get(i).getCelular();
            data[4] = listau.get(i).getNom_user();
            data[5] = listau.get(i).getPassword();
            data[6] = listau.get(i).getEstado();
            data[7] = listau.get(i).getTipo();
            dtm_lu.addRow(data);
        }
    }

    private void tabla_cargada() {
        //cargar cabecera
        cabecera();
        //llenado celdas
        llenar_celdas();
        //estilo de celdas
        tbl_usuarios.getColumnModel().getColumn(0).setCellRenderer(new GestionCeldas("numerico"));
        tbl_usuarios.getColumnModel().getColumn(1).setCellRenderer(new GestionCeldas("texto"));
        tbl_usuarios.getColumnModel().getColumn(2).setCellRenderer(new GestionCeldas("texto"));
        tbl_usuarios.getColumnModel().getColumn(3).setCellRenderer(new GestionCeldas("numerico"));
        tbl_usuarios.getColumnModel().getColumn(4).setCellRenderer(new GestionCeldas("texto"));
        tbl_usuarios.getColumnModel().getColumn(5).setCellRenderer(new GestionCeldas("texto"));
        tbl_usuarios.getColumnModel().getColumn(6).setCellRenderer(new GestionCeldas("texto"));
        tbl_usuarios.getColumnModel().getColumn(7).setCellRenderer(new GestionCeldas("texto"));
        //reordenar la tabla
        tbl_usuarios.getTableHeader().setReorderingAllowed(false);
        //alto de las celdas
        tbl_usuarios.setRowHeight(30);
        //Ancho de las celdas
        tbl_usuarios.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbl_usuarios.getColumnModel().getColumn(1).setPreferredWidth(200);
        tbl_usuarios.getColumnModel().getColumn(2).setPreferredWidth(200);
        tbl_usuarios.getColumnModel().getColumn(3).setPreferredWidth(120);
        tbl_usuarios.getColumnModel().getColumn(4).setPreferredWidth(120);
        tbl_usuarios.getColumnModel().getColumn(5).setPreferredWidth(120);
        tbl_usuarios.getColumnModel().getColumn(6).setPreferredWidth(100);
        tbl_usuarios.getColumnModel().getColumn(7).setPreferredWidth(120);
        //estilos de cabecera
        JTableHeader jTableHeader = tbl_usuarios.getTableHeader();
        jTableHeader.setDefaultRenderer(new GestionEncabezadoTabla());
        tbl_usuarios.setTableHeader(jTableHeader);
    }

    private void popupTable() {
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem menuItem = new JMenuItem("Editar Datos", new ImageIcon(getClass().getResource("/recursos/edit.png")));

        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                administrar_usuario();
                AdministrarUsuario.cb_estado.setVisible(true);
                enviar_datos();
            }
        });
        popupMenu.add(menuItem);
        tbl_usuarios.setComponentPopupMenu(popupMenu);
    }

    private void administrar_usuario() {
        AdministrarUsuario au = new AdministrarUsuario();
        escritorio.add(au);
        Dimension escritorio_size = escritorio.getSize();
        Dimension au_size = au.getSize();
        au.setLocation((escritorio_size.width - au_size.width) / 2, (escritorio_size.height - au_size.height) / 2);
        au.show();
        dispose();
    }
    
    private void enviar_datos(){
        String []apallido=listau.get(rowNumber).getApellidos().split(" ");
        AdministrarUsuario.txt_nombre.setText(listau.get(rowNumber).getNombres());
        AdministrarUsuario.txt_apaterno.setText(apallido[0]);
        AdministrarUsuario.txt_amaterno.setText(apallido[1]);
        AdministrarUsuario.txt_celular.setText(listau.get(rowNumber).getCelular());
        AdministrarUsuario.txt_user.setText(listau.get(rowNumber).getNom_user());
        AdministrarUsuario.txt_password.setText(listau.get(rowNumber).getPassword());
        AdministrarUsuario.cb_tipo.setSelectedItem(listau.get(rowNumber).getTipo());
        AdministrarUsuario.cb_estado.setSelectedItem(listau.get(rowNumber).getEstado());
    }
}
