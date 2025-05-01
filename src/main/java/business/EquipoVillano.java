package business;

public class EquipoVillano extends Equipo{

    private Villano []villanos;
    private String ubicacion;

    public EquipoVillano(String nombre, String base, Villano[] villanos, String ubicacion) {
        super(nombre, base);
        this.villanos = villanos;
        this.ubicacion = ubicacion;
    }

    public Villano[] getVillanos() {
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
