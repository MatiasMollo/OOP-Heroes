package business;

public class EquipoSuperHeroe extends Equipo{
    private SuperHeroe []heroes;
    private String mision;

    public EquipoSuperHeroe(String nombre, String base, SuperHeroe[] heroe, String mision) {
        super(nombre, base);
        this.heroes = heroe;
        this.mision = mision;
    }

    public SuperHeroe[] getHeroes() {
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
