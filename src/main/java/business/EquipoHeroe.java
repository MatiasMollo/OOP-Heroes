package business;

public class EquipoHeroe extends Equipo{
    private Heroe []heroes;
    private String mision;

    public EquipoHeroe(String nombre, String base, Heroe[] heroe, String mision) {
        super(nombre, base);
        this.heroes = heroe;
        this.mision = mision;
    }

    public Heroe[] getHeroes() {
        return heroes;
    }

    public String getMision() {
        return mision;
    }

    public void combatirCrimen(){
        // Código combatir crimen...
    }

    public void salvarMundo(){
        // Código salvar mundo...
    }


}
