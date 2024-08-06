package Actividad_3;

import java.util.Scanner;

public class Capitulo4_ejercicio40 {
    public static void main(String[] args) {
        CalcularNumeros procesarNumeros = new CalcularNumeros();

        int[] numeros = procesarNumeros.obtenerNumeros();
        double[] raices = procesarNumeros.calcularRaizCuadrada(numeros);
        int[] potencias2 = procesarNumeros.calcularPotencia2(numeros);
        int[] potencias3 = procesarNumeros.calcularPotencia3(numeros);

        procesarNumeros.imprimirResultados(numeros, raices, potencias2, potencias3);
    }
}

class CalcularNumeros {
    private Scanner entrada;

    public CalcularNumeros() {
        entrada = new Scanner(System.in);
    }

    public int[] obtenerNumeros() {
        System.out.println("Ingrese la lista de números separados por espacio: ");
        String linea = entrada.nextLine();

        String[] elementos = linea.split(" ");
        int[] numeros = new int[elementos.length];
        for (int i = 0; i < elementos.length; i++) {
            numeros[i] = Integer.parseInt(elementos[i]);
        }
        return numeros;
    }

    public double[] calcularRaizCuadrada(int[] numeros) {
        double[] raices = new double[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            raices[i] = Math.sqrt(numeros[i]);
        }
        return raices;
    }

    public int[] calcularPotencia2(int[] numeros) {
        int[] potencias2 = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            potencias2[i] = (int) Math.pow(numeros[i], 2);
        }
        return potencias2;
    }

    public int[] calcularPotencia3(int[] numeros) {
        int[] potencias3 = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            potencias3[i] = (int) Math.pow(numeros[i], 3);
        }
        return potencias3;
    }

    public void imprimirResultados(int[] numeros, double[] raices, int[] potencias2, int[] potencias3) {
        System.out.println("Número \t Raíz Cuadrada \t Potencia 2 \t Potencia 3");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%d \t %.2f \t\t %d \t\t %d%n", numeros[i], raices[i], potencias2[i], potencias3[i]);
        }
    }
}
