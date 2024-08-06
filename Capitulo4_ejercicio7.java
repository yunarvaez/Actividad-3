package Actividad_3;

import java.util.Scanner;

public class Capitulo4_ejercicio7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor de A: ");
        double A = entrada.nextDouble();

        System.out.println("Ingrese el valor de B: ");
        double B = entrada.nextDouble();

        entrada.close();

        // instancia de la clase empleada
        Comparador comparador = new Comparador(A,B);

        // funcion que va a  comparar los valores
        comparador.CompararValores();
    }
}

class Comparador {
    private final double A;
    private final double B;

    public Comparador(double A, double B) {
        this.A = A;
        this.B = B;
    }
    public String CompararValores(){
        if (A > B){
            return "A es mayor que B";
        } else if (A < B) {
            return "B es mayor que A";
        } else {
            return "A es igual que B";
        }
    }
}
