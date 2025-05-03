package controller;

import business.*;

import java.util.ArrayList;
import java.util.List;

public class EquipoController {
    private List<Equipo> equipos = new ArrayList<>();

    public void agregarEquipoSuperHeroe(String nombre, String base, SuperHeroe[] heroes, String mision) {
        EquipoSuperHeroe equipo = new EquipoSuperHeroe(nombre, base, heroes, mision);
        equipos.add(equipo);
        System.out.println("Equipo de superhéroes agregado: " + nombre);
    }

    public void agregarEquipoVillano(String nombre, String base, Villano[] villanos, String ubicacion) {
        EquipoVillano equipo = new EquipoVillano(nombre, base, villanos, ubicacion);
        equipos.add(equipo);
        System.out.println("Equipo de villanos agregado: " + nombre);
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

    public void eliminarEquipo(String nombre) {
        boolean eliminado = equipos.removeIf(eq -> eq.getNombre().equalsIgnoreCase(nombre));
        if (eliminado) {
            System.out.println("Equipo eliminado: " + nombre);
        } else {
            System.out.println("No se encontró el equipo: " + nombre);
        }
    }
}
