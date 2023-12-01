package org.example;

public class ThreadBusqueda extends Thread {

    almacenReultados datos;
    private final String nombre;
    private final int[] array;

    public ThreadBusqueda(String nombre, int[] array, almacenReultados datos) {
        this.nombre = nombre;
        this.array = array;
        this.datos = datos;
    }

    public void run() {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Soy " + nombre + " y el mayor número de mi subarray es " + max);

        datos.guardarNumero(max);
    }
}
