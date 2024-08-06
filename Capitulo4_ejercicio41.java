package Actividad_3;

import java.util.Scanner;

public class Capitulo4_ejercicio41 {
    public static void main(String[] args) {
        ProcesarNumeros procesarNumeros = new ProcesarNumeros();

        int[] numeros = procesarNumeros.obtenerNumeros();

        int mayor = procesarNumeros.encontrarMayor(numeros);

        System.out.printf("El mayor valor es: %d: ",mayor);
    }
}

class ProcesarNumeros{
    private Scanner entrada;

    public ProcesarNumeros(){
        entrada = new Scanner(System.in);
    }

    public int[] obtenerNumeros(){
        System.out.println("Ingrese la lista de números separada por espacio: ");
        String linea = entrada.nextLine();

        String[] elementos = linea.split(" ");


        int[] numeros = new int[elementos.length];
        for (int i = 0; i < elementos.length; i++){
            numeros[i] = Integer.parseInt(elementos[i]);
        }
        return numeros;
    }

    public int encontrarMayor(int[] numeros){
        int mayor = numeros[0];
        for (int numero : numeros){
            if (numero > mayor){
                mayor = numero;
            }
        }
        return mayor;
    }
}
