package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] array = new int[100];
        int[][] subArrays = new int[10][10];
        almacenReultados datos = new almacenReultados();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(501);
        }

        for (int num : array) {
            System.out.println(num);
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                subArrays[i][j] = array[i * 10 + j];
            }
        }

        ThreadBusqueda thread = new ThreadBusqueda("Hilo 1", subArrays[0],datos);
        thread.start();
        ThreadBusqueda thread2 = new ThreadBusqueda("Hilo 2", subArrays[1],datos);
        thread2.start();
        ThreadBusqueda thread3 = new ThreadBusqueda("Hilo 3", subArrays[2],datos);
        thread3.start();
        ThreadBusqueda thread4 = new ThreadBusqueda("Hilo 4", subArrays[3],datos);
        thread4.start();
        ThreadBusqueda thread5 = new ThreadBusqueda("Hilo 5", subArrays[4],datos);
        thread5.start();
        ThreadBusqueda thread6 = new ThreadBusqueda("Hilo 6", subArrays[5],datos);
        thread6.start();
        ThreadBusqueda thread7 = new ThreadBusqueda("Hilo 7", subArrays[6],datos);
        thread7.start();
        ThreadBusqueda thread8 = new ThreadBusqueda("Hilo 8", subArrays[7],datos);
        thread8.start();
        ThreadBusqueda thread9 = new ThreadBusqueda("Hilo 9", subArrays[8],datos);
        thread9.start();
        ThreadBusqueda thread10 = new ThreadBusqueda("Hilo 10", subArrays[9],datos);
        thread10.start();

        try {
            thread.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
            thread6.join();
            thread7.join();
            thread8.join();
            thread9.join();
            thread10.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



        int[] solucion = datos.getNumEncontradosPorHilos();
        int max = solucion[0];
        for (int num : solucion) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("El mayor número encontrado es " + max);
    }


}
