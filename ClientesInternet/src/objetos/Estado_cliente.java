
package objetos;

public class Estado_cliente {
    private String id;
    private String descripcion;
    private String fecha_mod;

    public Estado_cliente(String id, String descripcion, String fecha_mod) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha_mod = fecha_mod;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha_mod() {
        return fecha_mod;
    }

    public void setFecha_mod(String fecha_mod) {
        this.fecha_mod = fecha_mod;
    }
    
}
