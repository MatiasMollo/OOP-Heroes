package controller;

import business.*;

import java.util.ArrayList;
import java.util.List;

public class EquipoController {
    private List<EquipoSuperHeroe> equiposSuperHeroes = new ArrayList<>();
    private List<EquipoVillano> equiposVillanos = new ArrayList<>();

    public void agregarEquipoSuperHeroe(EquipoSuperHeroe equipoSuperHeroe) {
        equiposSuperHeroes.add(equipoSuperHeroe);
        System.out.println("Equipo de superhéroes agregado: " + equipoSuperHeroe.getNombre());
    }

    public void agregarEquipoVillano(EquipoVillano equipoVillano) {
        equiposVillanos.add(equipoVillano);
        System.out.println("Equipo de villanos agregado: " + equipoVillano.getNombre());
    }

    public void listarEquipos() {
        if (equipos.isEmpty()) {
            System.out.println("No hay equipos registrados.");
            return;
        }

        for (Equipo eq : equipos) {
            System.out.println("Equipo: " + eq.getNombre() + " | Base: " + eq.getBase());

            if (eq instanceof EquipoSuperHeroe sh) {
                System.out.println("  (Superhéroes) Misión: " + sh.getMision() + " | Miembros: " + sh.getHeroes().length);
            } else if (eq instanceof EquipoVillano v) {
                System.out.println("  (Villanos) Ubicación: " + v.getUbicacion() + " | Miembros: " + v.getVillanos().length);
            }
        }
    }

    public EquipoSuperHeroe getEquipoSuperHeroe(int indice) {
        return equiposSuperHeroes.get(indice);
    }

    public EquipoVillano getEquipoVillano(int indice) {
        return equiposVillanos.get(indice);
    }

}
