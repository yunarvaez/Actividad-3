package Actividad_3;

import java.util.Scanner;

public class Capitulo3_ejercicio18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el código del empleado: ");
        int codigo = entrada.nextInt();

        entrada.nextLine(); // consumo de línea

        System.out.println("Ingrese los nombres del empleado: ");
        String nombres = entrada.nextLine();

        System.out.println("Ingrese el número de horas trabajadas al mes: ");
        double numeroHorasTrabajadasMes = entrada.nextDouble();

        System.out.println("Ingrese el valor por hora trabajada: ");
        double valorHoraTrabajada = entrada.nextDouble();

        System.out.println("Ingrese el porcentaje de retención en la fuente: ");
        double porcentajeRetencion = entrada.nextDouble();

        // instancia de la clase empleado
        Empleado empleado = new Empleado(codigo, nombres, numeroHorasTrabajadasMes, valorHoraTrabajada, porcentajeRetencion);

        entrada.close();

        System.out.printf("Código: %s\nNombres: %s\nSalario bruto: %.2f\nSalario neto: %.2f",
                empleado.getCodigo(), empleado.getNombres(), empleado.calcularSalarioBruto(), empleado.calcularSalarioNeto());
    }
}

class Empleado {
    private final int codigo;
    private final String nombres;
    private final double numeroHorasTrabajadasMes;
    private final double valorHoraTrabajada;
    private final double porcentajeRetencion;

    public Empleado(int codigo, String nombres, double numeroHorasTrabajadasMes, double valorHoraTrabajada, double porcentajeRetencion) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.numeroHorasTrabajadasMes = numeroHorasTrabajadasMes;
        this.valorHoraTrabajada = valorHoraTrabajada;
        this.porcentajeRetencion = porcentajeRetencion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public double calcularSalarioBruto() {
        return valorHoraTrabajada * numeroHorasTrabajadasMes;
    }

    public double calcularSalarioNeto() {
        double salarioBruto = calcularSalarioBruto();
        return salarioBruto - (salarioBruto * (porcentajeRetencion / 100));
    }
}
