package business;

import java.util.List;

public class EquipoSuperHeroe extends Equipo{
    private List<SuperHeroe> heroes;
    private String mision;

    public EquipoSuperHeroe(String nombre, String base, List<SuperHeroe> heroe, String mision) {
        super(nombre, base);
        this.heroes = heroe;
        this.mision = mision;
    }

    public List<SuperHeroe> getHeroes() {
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
