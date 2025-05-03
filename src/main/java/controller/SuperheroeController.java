package controller;

import business.Humano;
import business.Mutante;
import business.SuperHeroe;

import java.util.ArrayList;
import java.util.List;

public class SuperheroeController {
    private List<SuperHeroe> heroes = new ArrayList<>();

    public void agregarHumano(Humano humano) {
        heroes.add(humano);
        System.out.println("Humano agregado: " + humano.getNombre());
    }

    public void agregarMutante(Mutante mutante) {
        heroes.add(mutante);
        System.out.println("Mutante agregado: " + mutante.getNombre());
    }

    public void listarSuperheroes() {
        if (heroes.isEmpty()) {
            System.out.println("No hay superhéroes registrados.");
            return;
        }

        for (SuperHeroe sh : heroes) {
            System.out.println("Nombre: " + sh.getNombre() + " | Poder: " + sh.getPoder());
            if (sh instanceof Humano h) {
                System.out.println("  (Humano) Edad: " + h.getEdad() + ", Nacionalidad: " + h.getNacionalidad());
            } else if (sh instanceof Mutante m) {
                System.out.println("  (Mutante) Mutación: " + m.getMutacion() + ", Tipo: " + m.getTipo());
            }
        }
    }

    public List<SuperHeroe> getHeroes() {
        return heroes;
    }
}
