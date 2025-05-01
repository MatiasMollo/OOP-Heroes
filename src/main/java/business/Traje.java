package business;

public class Traje {
    private String nombre;
    private String descripcion;
    private String color;
    private String debilidad;

    public Traje(String nombre, String descripcion, String color, String debilidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.color = color;
        this.debilidad = debilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getColor() {
        return color;
    }

    public String getDebilidad() {
        return debilidad;
    }

}
