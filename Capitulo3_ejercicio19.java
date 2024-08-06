package Actividad_3;

import java.util.Scanner;

public class Capitulo3_ejercicio19 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor del lado del triángulo equilátero: ");
        double lado = entrada.nextDouble();

        // instancia de la clase triangulo
        Triangulo triangulo = new Triangulo(lado);

        entrada.close();

        System.out.printf("Perímetro del triángulo: %.2f\nAltura del triángulo: %.2f\nÁrea del triángulo: %.2f",
                triangulo.getPerimetro(), triangulo.getAltura(), triangulo.getArea());

    }
}

class Triangulo {
    private final double lado;

    public Triangulo(double lado) {
        this.lado = lado;

    }
    public double getPerimetro() {
        return lado * 3;
    }

    public double getAltura() {
        return Math.sqrt((Math.pow(lado,2))-Math.pow(lado/2,2));
    }

    public double getArea() {
        return (lado*getAltura())/2;
    }
}
