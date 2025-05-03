package controller;

import business.Alienigena;
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

    public List<Villano> getVillanos() {
        return villanos;
    }

}
