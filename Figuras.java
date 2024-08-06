package PruebaFiguras;

import java.util.Scanner;

public class Figuras {
    public static void main(String[] args) {
        int radio, lado, baseR, alturaR, baseT, alturaT;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el radio del círculo: ");
        radio = entrada.nextInt();

        System.out.println("Ingrese el lado del cuadrado: ");
        lado = entrada.nextInt();

        System.out.println("Ingrese la base del rectángulo: ");
        baseR = entrada.nextInt();

        System.out.println("Ingrese la altura del rectángulo: ");
        alturaR = entrada.nextInt();

        System.out.println("Ingrese la base del triángulo: ");
        baseT = entrada.nextInt();

        System.out.println("Ingrese la altura del triángulo: ");
        alturaT = entrada.nextInt();

        Circulo figura1 = new Circulo(radio);
        Rectangulo figura2 = new Rectangulo(baseR,alturaR);
        Cuadrado figura3 = new Cuadrado(lado);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(baseT, alturaT);

        System.out.printf("El área del círculo es: %s\n" , figura1.calcularArea());
        System.out.printf("El perímetro del círculo es: %s\n", figura1.calcularPerimetro());

        System.out.printf("El área del rectángulo es: %s\n", figura2.calcularArea());
        System.out.printf("El perímetro del rectángulo es: %s\n", figura2.calcularPerimetro());

        System.out.printf("El área del cuadrado es: %s\n", figura3.calcularArea());
        System.out.printf("El perímetro del cuadrado es: %s\n", figura3.calcularPerimetro());

        System.out.printf("El área del triángulo es: %s\n", figura4.calcularArea());
        System.out.printf("El perímetro del triángulo es: %s\n", figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();
        
        Interfaz ventana = new Interfaz();
        ventana.show(true);
    }
}
