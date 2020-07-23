package estilos;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Cristhian
 */
public class GestionCeldas extends DefaultTableCellRenderer {

    private String tipo = "texto";

    //se definen por defecto los tipos de datos a usar
    private Font normal = new Font("Verdana", Font.PLAIN, 12);
    private Font bold = new Font("Verdana", Font.BOLD, 12);

    public GestionCeldas() {
    }

    public GestionCeldas(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
        //definimos colores por defecto
        Color colorFondo = null;
        Color colorFondoPorDefecto = new Color(192, 192, 192);
        Color colorFondoSeleccion = new Color(140, 140, 140);

        if (selected) {
            this.setBackground(colorFondoPorDefecto);
        } else {
            this.setBackground(Color.WHITE);
        }

        if (tipo.equals("texto")) {
            if (focused) {
                colorFondo = colorFondoSeleccion;
            } else {
                colorFondo = colorFondoPorDefecto;
            }
            this.setHorizontalAlignment(JLabel.LEFT);
            this.setText((String) value);
            this.setBackground((selected) ? colorFondo : Color.WHITE);
            //this.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(145, 152, 156)));
            this.setFont(normal);
            return this;
        }

        if (tipo.equals("numerico")) {
            if (focused) {
                colorFondo = colorFondoSeleccion;
            } else {
                colorFondo = colorFondoPorDefecto;
            }
            this.setHorizontalAlignment(JLabel.CENTER);
            this.setText((String) value);
            this.setBackground((selected) ? colorFondo : Color.WHITE);
            this.setForeground((selected) ? new Color(255, 255, 255) : new Color(32, 117, 32));
            //this.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(145, 152, 156)));
            this.setFont(bold);
            return this;
        }

        if (tipo.equals("chk_box")) {
            //if (focused) {
              //  colorFondo = colorFondoSeleccion;
            //} else {
              //  colorFondo = colorFondoPorDefecto;
            //}
            //this.setHorizontalAlignment(JLabel.LEFT);
            //this.setBackground((selected) ? colorFondo : Color.WHITE);
            this.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(145, 152, 156)));
            return this;
        }

        return this;
    }
}
