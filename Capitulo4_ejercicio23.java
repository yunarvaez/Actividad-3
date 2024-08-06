package Actividad_3;

import java.util.Scanner;

public class Capitulo4_ejercicio23 {
    public static void main(String[] args) {
        // Hallar la solucion cuadratica


        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de A: ");
        double A = entrada.nextDouble();

        System.out.println("Ingrese el valor de B: ");
        double B = entrada.nextDouble();

        System.out.println("Ingrese el valor de C: ");
        double C = entrada.nextDouble();

        entrada.close();

        Cuadratica ecuacion = new Cuadratica(A,B,C);
        ecuacion.calcular_soluciones();
    }
}

class Cuadratica {
    private final double A;
    private final double B;
    private final double C;

    public Cuadratica(double A, double B, double C){
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public double[] calcular_soluciones(){
        double discriminante = Math.pow(B, 2) - 4 * A * C;
        
        if (discriminante < 0) {
            return new double[]{}; // Retorna un arreglo vacío si no hay soluciones reales
        } else {
        double solucion1 = (-B + Math.sqrt(discriminante)) / (2 * A);
        double solucion2 = (-B - Math.sqrt(discriminante)) / (2 * A);
        return new double[]{solucion1, solucion2};    
        }
    }
}