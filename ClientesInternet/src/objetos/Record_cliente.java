package objetos;

public class Record_cliente {

    private String id;
    private String apellidos;
    private String nombres;
    private String estado;
    private String deuda;
    private String record;

    public Record_cliente(String id, String apellidos, String nombres, String estado, String deuda, String record) {
        this.id = id;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.estado = estado;
        this.deuda = deuda;
        this.record = record;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDeuda() {
        return deuda;
    }

    public void setDeuda(String deuda) {
        this.deuda = deuda;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }
}
