package objetos;

public class Datos_Clientes {

    private String id;
    private String dni;
    private String apellidos;
    private String nombres;
    private String direccion;
    private String celular;
    private String estado;
    private String ip;
    private String dispositivos;
    private String fecha_contrato;

    public Datos_Clientes(String id, String dni, String apellidos, String nombres, String direccion, String celular, String estado, String ip, String dispositivos, String fecha_contrato) {
        this.id = id;
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.direccion = direccion;
        this.celular = celular;
        this.estado = estado;
        this.ip = ip;
        this.dispositivos = dispositivos;
        this.fecha_contrato = fecha_contrato;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDispositivos() {
        return dispositivos;
    }

    public void setDispositivos(String dispositivos) {
        this.dispositivos = dispositivos;
    }

    public String getFecha_contrato() {
        return fecha_contrato;
    }

    public void setFecha_contrato(String fecha_contrato) {
        this.fecha_contrato = fecha_contrato;
    }
}
