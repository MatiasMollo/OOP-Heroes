package business;

import java.util.List;

public class EquipoVillano extends Equipo{

    private List<Villano> villanos;
    private String ubicacion;

    public EquipoVillano(String nombre, String base, List<Villano> villanos, String ubicacion) {
        super(nombre, base);
        this.villanos = villanos;
        this.ubicacion = ubicacion;
    }

    public List<Villano>  getVillanos() {
        return villanos;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void eliminarSuperHeroes(){
        // Código
    }

    public void dominarMundo(){
        // Código
    }
}
