package business;

public abstract class Equipo {
    protected String nombre;
    protected String base;

    public Equipo(String nombre, String base) {
        this.nombre = nombre;
        this.base = base;
    }

    public String getNombre() {
        return nombre;
    }

    public String getBase() {
        return base;
    }

    public void entrenar(){
     // Código entrenar...
    }

}
