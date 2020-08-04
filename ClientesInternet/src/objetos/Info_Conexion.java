package objetos;

public class Info_Conexion {

    private String id;
    private String apellidos;
    private String nombres;
    private String ip_cliente;
    private String ip_dispositivos;
    private String cant_dispositivos;
    private String fecha_contrato;

    public Info_Conexion(String id, String apellidos, String nombres, String ip_cliente, String ip_dispositivos, String cant_dispositivos, String fecha_contrato) {
        this.id = id;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.ip_cliente = ip_cliente;
        this.ip_dispositivos = ip_dispositivos;
        this.cant_dispositivos = cant_dispositivos;
        this.fecha_contrato = fecha_contrato;
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

    public String getIp_cliente() {
        return ip_cliente;
    }

    public void setIp_cliente(String ip_cliente) {
        this.ip_cliente = ip_cliente;
    }

    public String getIp_dispositivos() {
        return ip_dispositivos;
    }

    public void setIp_dispositivos(String ip_dispositivos) {
        this.ip_dispositivos = ip_dispositivos;
    }

    public String getCant_dispositivos() {
        return cant_dispositivos;
    }

    public void setCant_dispositivos(String cant_dispositivos) {
        this.cant_dispositivos = cant_dispositivos;
    }

    public String getFecha_contrato() {
        return fecha_contrato;
    }

    public void setFecha_contrato(String fecha_contrato) {
        this.fecha_contrato = fecha_contrato;
    }

}
