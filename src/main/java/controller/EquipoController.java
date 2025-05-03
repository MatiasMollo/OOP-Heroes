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
        if (equiposSuperHeroes.isEmpty() && equiposVillanos.isEmpty()) {
            System.out.println("No hay equipos registrados.");
            return;
        }

        for (EquipoSuperHeroe eq : equiposSuperHeroes) {
            System.out.println("Equipo: " + eq.getNombre() + " | Base: " + eq.getBase() + " | (Superhéroes) Misión: " + eq.getMision() + " | Miembros: " + eq.getHeroes().size());
        }

        for (EquipoVillano eq : equiposVillanos) {
            System.out.println("Equipo: " + eq.getNombre() + " | Base: " + eq.getBase() + " | (Villanos) Ubicación: " + eq.getUbicacion() + " | Miembros: " + eq.getVillanos().size());
        }
    }

    public EquipoSuperHeroe getEquipoSuperHeroe(int indice) {
        return equiposSuperHeroes.get(indice);
    }

    public EquipoVillano getEquipoVillano(int indice) {
        return equiposVillanos.get(indice);
    }

}
