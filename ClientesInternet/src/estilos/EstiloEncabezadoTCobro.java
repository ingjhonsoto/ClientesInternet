/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estilos;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Cristhian
 */
public class EstiloEncabezadoTCobro implements TableCellRenderer{

   @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JComponent jComponent = null;
        if (value instanceof String) {
            jComponent = new JLabel((String) value);
            ((JLabel) jComponent).setHorizontalAlignment(SwingConstants.CENTER);
            ((JLabel) jComponent).setSize(40, jComponent.getWidth());
            ((JLabel) jComponent).setPreferredSize(new Dimension(6, jComponent.getWidth()));
        }
        jComponent.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(255, 255, 255)));
        jComponent.setOpaque(true);
        jComponent.setBackground(new Color(31, 138, 203 ));
        jComponent.setToolTipText("Tabla de Cobros");
        jComponent.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jComponent.setForeground(Color.WHITE);
        
        return jComponent;
    }
    
}
