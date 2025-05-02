package controller;

import business.Arma;

import java.util.ArrayList;
import java.util.List;

public class ArmaController {
    private List<Arma> armas = new ArrayList<>();

    public void agregarArma(int codigo, String nombre, String descripcion, String estado) {
        Arma nuevaArma = new Arma(codigo, nombre, descripcion, estado);
        armas.add(nuevaArma);
        System.out.println("Arma agregada: " + nombre);
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

    public void actualizarArma(int codigoBuscado, String nuevoNombre, String nuevaDescripcion, String nuevoEstado) {
        for (Arma a : armas) {
            if (a.getCodigo() == codigoBuscado) {
                Arma actualizada = new Arma(codigoBuscado, nuevoNombre, nuevaDescripcion, nuevoEstado);
                armas.set(armas.indexOf(a), actualizada);
                System.out.println("Arma actualizada: " + nuevoNombre);
                return;
            }
        }
        System.out.println("No se encontró un arma con código: " + codigoBuscado);
    }

    public void eliminarArma(int codigo) {
        boolean eliminada = armas.removeIf(a -> a.getCodigo() == codigo);
        if (eliminada) {
            System.out.println("Arma eliminada.");
        } else {
            System.out.println("No se encontró un arma con ese código.");
        }
    }
}
