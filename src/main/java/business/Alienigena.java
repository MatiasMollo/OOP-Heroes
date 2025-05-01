package business;

public class Alienigena extends Villano{
    private String planeta;
    private String especie;

    public Alienigena(String nombre, String alias, String objetivo, String poder, Arma arma, String planeta, String especie) {
        super(nombre, alias, objetivo, poder, arma);
        this.planeta = planeta;
        this.especie = especie;
    }

    public String getPlaneta() {
        return planeta;
    }

    public String getEspecie() {
        return especie;
    }

    public void cambiarForma(){
        // Código
    }
}
