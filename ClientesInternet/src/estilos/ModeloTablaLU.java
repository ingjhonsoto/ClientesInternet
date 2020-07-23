package estilos;

import javax.swing.table.DefaultTableModel;

public class ModeloTablaLU extends DefaultTableModel {

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
}
