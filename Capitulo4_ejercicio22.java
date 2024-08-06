package Actividad_3;

import java.util.Scanner;

public class Capitulo4_ejercicio22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado: ");
        String nombre_empleado = entrada.nextLine();

        System.out.println("ingrese el salario básico por hora: ");
        double salario_por_hora = entrada.nextDouble();

        System.out.println("Ingrese el número de horas trabajadas: ");
        double numero_horas_trabajada = entrada.nextDouble();

        entrada.close();

        Trabajador trabajador = new Trabajador(nombre_empleado,salario_por_hora,numero_horas_trabajada);

        trabajador.mostrar_salario();
    }
}
class Trabajador{
    private final String nombre_empleado;
    private final double salario_por_hora;
    private final double numero_horas_trabajada;

    public Trabajador(String nombre_empleado, double salario_por_hora, double numero_horas_trabajada){
        this.nombre_empleado = nombre_empleado;
        this.salario_por_hora = salario_por_hora;
        this.numero_horas_trabajada = numero_horas_trabajada;
    }

    public double calcular_salario() {
        return salario_por_hora*numero_horas_trabajada;
    }

    public void mostrar_salario(){
        double salario_total = calcular_salario();
        System.out.printf("Nombre del empleado: %s\n", nombre_empleado);
        if (salario_total > 450000) {
            System.out.printf("Salario total: %.2f", salario_total);
        }
    }
}

