package controller;

import business.Traje;

import java.util.ArrayList;
import java.util.List;

public class TrajeController {
    private List<Traje> trajes = new ArrayList<>();

    public void agregarTraje(Traje traje) {
        trajes.add(traje);
        System.out.println("Traje agregado: " + traje.getNombre());
    }

    public void listarTrajes() {
        if (trajes.isEmpty()) {
            System.out.println("No hay trajes registrados.");
            return;
        }

        for (Traje t : trajes) {
            System.out.println("Nombre: " + t.getNombre() +
                    " | Color: " + t.getColor() +
                    " | Debilidad: " + t.getDebilidad());
        }
    }

    public void actualizarDescripcion(String nombre, String nuevaDescripcion) {
        for (Traje t : trajes) {
            if (t.getNombre().equalsIgnoreCase(nombre)) {
                Traje actualizado = new Traje(t.getNombre(), nuevaDescripcion, t.getColor(), t.getDebilidad());
                trajes.set(trajes.indexOf(t), actualizado);
                System.out.println("Descripción actualizada para el traje: " + nombre);
                return;
            }
        }
        System.out.println("No se encontró el traje: " + nombre);
    }

    public Traje getTrajeByName(String nombre) {
        for (Traje t : trajes) {
            if (t.getNombre().equalsIgnoreCase(nombre)) {
                return t;
            }
        }
        System.out.println("No se encontró un traje con el nombre: " + nombre);
        return null;
    }

}
