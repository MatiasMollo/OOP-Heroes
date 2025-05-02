package business;

public class Mutante extends SuperHeroe {
    private String mutacion;
    private String tipo;

    public Mutante(String nombre, String identidad, String poder, Traje traje, String mutacion, String tipo) {
        super(nombre, identidad, poder, traje);
        this.mutacion = mutacion;
        this.tipo = tipo;
    }

    public String getMutacion() {
        return mutacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void teletransportarse(){
        // Código...
    }

    public void autoRegenerarse(){
        // Código...
    }
}
