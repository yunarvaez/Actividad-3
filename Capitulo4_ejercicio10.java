package Actividad_3;

import java.util.Scanner;

public class Capitulo4_ejercicio10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el número de inscripción del estudiante: ");
        int numero_inscripcion = entrada.nextInt();

        entrada.nextLine(); //consumo de línea

        System.out.println("Ingrese el nombre del estudiante: ");
        String nombres = entrada.nextLine();

        System.out.println("Ingrese el patrimonio: ");
        double patrimonio = entrada.nextDouble();

        System.out.println("Ingrese el estrato: ");
        int estrato = entrada.nextInt();

        entrada.close();

        Estudiante estudiante = new Estudiante(numero_inscripcion, nombres,patrimonio,estrato);
        System.out.printf("El estudiante con número de inscripción %d y nombre %s debe pagar $%.2f.",
                estudiante.getNumero_inscripcion(), estudiante.getNombres(), estudiante.calcularPagoMatricula());
    }
}

class Estudiante{
    private final int numero_inscripcion;
    private final String nombres;
    private final double patrimonio;
    private final int estrato;
    private static final double base_pago_matricula = 50000;

    public Estudiante(int numero_inscripcion, String nombres, double patrimonio, int estrato){
        this.numero_inscripcion = numero_inscripcion;
        this.nombres = nombres;
        this.patrimonio = patrimonio;
        this.estrato = estrato;
    }

    public int getNumero_inscripcion() {
        return numero_inscripcion;
    }

    public String getNombres() {
        return nombres;
    }

    public double calcularPagoMatricula() {
        double pagoPorMatricula = base_pago_matricula;
        if (patrimonio > 2000000 && estrato > 3) {
            pagoPorMatricula += patrimonio*0.03;
        }
        return pagoPorMatricula;
    }
}
