package business;

public class Arma {
    private int codigo;
    private String nombre;
    private String descripcion;
    private String estado;

    public Arma(int codigo, String nombre, String descripcion, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void carga(){
        // Código carga...
    }
}
