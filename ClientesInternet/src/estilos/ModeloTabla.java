package estilos;

import javax.swing.table.DefaultTableModel;

public class ModeloTabla extends DefaultTableModel {

    @Override
    public boolean isCellEditable(int row, int column) {
        return !(column != 7 && column != 10 && column !=11);
    }
}
