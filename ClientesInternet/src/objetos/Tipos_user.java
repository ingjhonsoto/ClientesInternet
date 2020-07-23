
package objetos;

/**
 *
 * @author Cristhian
 */
public class Tipos_user {
    private String id_tipo;
    private String descripcion;
    private String fecha_creacion;

    public Tipos_user(String id_tipo, String descripcion, String fecha_creacion) {
        this.id_tipo = id_tipo;
        this.descripcion = descripcion;
        this.fecha_creacion = fecha_creacion;
    }
    
    public String getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(String id_tipo) {
        this.id_tipo = id_tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
    
}
