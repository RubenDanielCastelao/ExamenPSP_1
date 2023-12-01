package org.example;

public class almacenReultados {
    protected int[] numEncontradosPorHilos = new int[10];
    int posicion = 0;

    public synchronized void guardarNumero(int numeroEncontrado) {
        numEncontradosPorHilos[posicion] = numeroEncontrado;
        posicion++;
    }

    public int[] getNumEncontradosPorHilos() {
        return numEncontradosPorHilos;
    }
}
