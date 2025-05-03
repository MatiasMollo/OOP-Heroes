package controller;

import business.Arma;

import java.util.ArrayList;
import java.util.List;

public class ArmaController {
    private List<Arma> armas = new ArrayList<>();

    public void agregarArma(Arma arma) {
        armas.add(arma);
        System.out.println("Arma agregada: " + arma.getNombre());
    }

    public void listarArmas() {
        if (armas.isEmpty()) {
            System.out.println("No hay armas registradas.");
            return;
        }

        for (Arma a : armas) {
            System.out.println("Código: " + a.getCodigo() +
                    " | Nombre: " + a.getNombre() +
                    " | Estado: " + a.getEstado() +
                    " | Descripción: " + a.getDescripcion());
        }
    }

    public Arma getArmaByName(String nombre) {
        for (Arma a : armas) {
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                return a;  // Devuelve el primer arma que coincida con el nombre
            }
        }
        System.out.println("No se encontró un arma con nombre: " + nombre);
        return null;  // Si no se encuentra el arma, devuelve null
    }

}
