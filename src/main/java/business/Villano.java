package business;

public abstract class Villano {

    protected String nombre;
    protected String alias;
    protected String objetivo;
    protected String poder;
    protected Arma arma;


    public Villano(String nombre, String alias, String objetivo, String poder, Arma arma) {
        this.nombre = nombre;
        this.alias = alias;
        this.objetivo = objetivo;
        this.poder = poder;
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAlias() {
        return alias;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public String getPoder() {
        return poder;
    }

    public Arma getArma() {
        return arma;
    }

    public void atacar(){
        // Código
    }

    public void conquistar(){
        // Código
    }

    public void matar(){
        // Código
    }
}
