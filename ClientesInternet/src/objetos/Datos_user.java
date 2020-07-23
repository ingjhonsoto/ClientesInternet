
package objetos;

public class Datos_user {
    private String id;
    private String apellidos;
    private String nombres;
    private String celular;
    private String nom_user;
    private String password;
    private String estado;
    private String tipo;

    public Datos_user(String id, String apellidos, String nombres, String celular, String nom_user, String password, String estado, String tipo) {
        this.id = id;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.celular = celular;
        this.nom_user = nom_user;
        this.password = password;
        this.estado = estado;
        this.tipo = tipo;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNom_user() {
        return nom_user;
    }

    public void setNom_user(String nom_user) {
        this.nom_user = nom_user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
