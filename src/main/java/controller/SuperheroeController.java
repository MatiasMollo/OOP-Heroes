package controller;

import business.Humano;
import business.Mutante;
import business.SuperHeroe;
import business.Traje;

import java.util.ArrayList;
import java.util.List;

public class SuperheroeController {
    private List<SuperHeroe> heroes = new ArrayList<>();

    public void agregarHumano(String nombre, String identidad, String poder, Traje traje, int edad, String sexo, String nacionalidad) {
        Humano h = new Humano(nombre, identidad, poder, traje, edad, sexo, nacionalidad);
        heroes.add(h);
        System.out.println("Humano agregado: " + nombre);
    }

    public void agregarMutante(String nombre, String identidad, String poder, Traje traje, String mutacion, String tipo) {
        Mutante m = new Mutante(nombre, identidad, poder, traje, mutacion, tipo);
        heroes.add(m);
        System.out.println("Mutante agregado: " + nombre);
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

    public void actualizarPoder(String identidad, String nuevoPoder) {
        for (SuperHeroe sh : heroes) {
            if (sh.getIdentidad().equalsIgnoreCase(identidad)) {
                if (sh instanceof Humano h) {
                    Humano actualizado = new Humano(h.getNombre(), h.getIdentidad(), nuevoPoder, h.getTraje(), h.getEdad(), h.getSexo(), h.getNacionalidad());
                    heroes.set(heroes.indexOf(h), actualizado);
                    System.out.println("Humano actualizado: " + identidad);
                } else if (sh instanceof Mutante m) {
                    Mutante actualizado = new Mutante(m.getNombre(), m.getIdentidad(), nuevoPoder, m.getTraje(), m.getMutacion(), m.getTipo());
                    heroes.set(heroes.indexOf(m), actualizado);
                    System.out.println("Mutante actualizado: " + identidad);
                }
                return;
            }
        }
        System.out.println("No se encontró un superhéroe con esa identidad.");
    }

    public void eliminarSuperheroe(String identidad) {
        boolean eliminado = heroes.removeIf(sh -> sh.getIdentidad().equalsIgnoreCase(identidad));
        if (eliminado) {
            System.out.println("Superhéroe eliminado.");
        } else {
            System.out.println("No se encontró un superhéroe con esa identidad.");
        }
    }
}
