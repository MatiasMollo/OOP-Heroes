package business;

public abstract class SuperHeroe {

    protected String nombre;
    protected String identidad;
    protected String poder;
    protected Traje traje;

    public SuperHeroe(String nombre, String identidad, String poder, Traje traje) {
        this.nombre = nombre;
        this.identidad = identidad;
        this.poder = poder;
        this.traje = traje;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentidad() {
        return identidad;
    }

    public String getPoder() {
        return poder;
    }

    public Traje getTraje() {
        return traje;
    }

    public void volar(){
        // Código...
    }

    public void luchar(){
        // Código...
    }

    public void usarPoderEspecial(){
        // Código...
    }

}
