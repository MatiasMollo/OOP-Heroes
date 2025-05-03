package controller;

import business.Alienigena;
import business.Arma;

import java.util.ArrayList;
import java.util.List;

public class VillanoController {
    private List<Alienigena> villanos = new ArrayList<>();

    public void agregarVillano(String nombre, String alias, String objetivo, String poder, Arma arma, String planeta, String especie) {
        Alienigena nuevoVillano = new Alienigena(nombre, alias, objetivo, poder, arma, planeta, especie);
        villanos.add(nuevoVillano);
        System.out.println("Villano agregado: " + alias);
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

    public void eliminarVillano(String alias) {
        villanos.removeIf(v -> v.getAlias().equalsIgnoreCase(alias));
        System.out.println("Villano eliminado si existía: " + alias);
    }
}
