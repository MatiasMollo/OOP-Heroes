package controller;

import business.Alienigena;
import business.Arma;
import business.Villano;

import java.util.ArrayList;
import java.util.List;

public class VillanoController {
    private List<Villano> villanos = new ArrayList<>();

    public void agregarVillano(Alienigena alienigena) {
        villanos.add(alienigena);
        System.out.println("Villano agregado: " + alienigena.getNombre());
    }

    public void mostrarVillanos() {
        if (villanos.isEmpty()) {
            System.out.println("No hay villanos registrados.");
            return;
        }
        for (Villano v : villanos) {
            if (v instanceof Alienigena) {
                Alienigena alienigena = (Alienigena) v;
                System.out.println("Alias: " + alienigena.getAlias() + " | Planeta: " + alienigena.getPlaneta() + " | Especie: " + alienigena.getEspecie());
            }
        }
    }

    public void actualizarVillano(String aliasBuscado, String nuevoObjetivo, String nuevoPoder) {
        for (Villano v : villanos) {
            if (v.getAlias().equalsIgnoreCase(aliasBuscado) && v instanceof Alienigena){
                    Alienigena alienigena = (Alienigena) v;
                    Alienigena actualizado = new Alienigena(alienigena.getNombre(), alienigena.getAlias(), nuevoObjetivo, nuevoPoder, alienigena.getArma(), alienigena.getPlaneta(), alienigena.getEspecie());
                    villanos.set(villanos.indexOf(v), actualizado);
                    System.out.println("Villano actualizado: " + aliasBuscado);
                    return;
            }
        }

        System.out.println("Villano no encontrado: " + aliasBuscado);
    }

    public List<Villano> getVillanos() {
        return villanos;
    }
}
