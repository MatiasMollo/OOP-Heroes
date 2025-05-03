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
        for (Alienigena v : villanos) {
            System.out.println("Alias: " + v.getAlias() + " | Planeta: " + v.getPlaneta() + " | Especie: " + v.getEspecie());
        }
    }

    public void actualizarVillano(String aliasBuscado, String nuevoObjetivo, String nuevoPoder) {
        for (Alienigena v : villanos) {
            if (v.getAlias().equalsIgnoreCase(aliasBuscado)) {
                Alienigena actualizado = new Alienigena(v.getNombre(), v.getAlias(), nuevoObjetivo, nuevoPoder, v.getArma(), v.getPlaneta(), v.getEspecie());
                villanos.set(villanos.indexOf(v), actualizado);
                System.out.println("Villano actualizado: " + aliasBuscado);
                return;
            }
        }

        System.out.println("Villano no encontrado: " + aliasBuscado);
    }

    }
}
