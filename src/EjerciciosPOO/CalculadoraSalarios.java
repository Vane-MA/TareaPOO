/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPOO;

import java.util.Scanner;

/**
 *
 * @author zinvi
 */
public class CalculadoraSalarios {
      public static void main(String[] args) {
        CalculadoraSalarios objeto = new CalculadoraSalarios();
        objeto.Recibe();
      }
    public void Recibe() {
        int numeroEmpleado = 0;
        int horas, hExtras = 0;
        double salario;
        double total;
         Scanner entrada = new Scanner(System.in);

        while (3>=numeroEmpleado++) {
            
            System.out.println("Por favor introduzca el numero de horas que trabajo el empleado" + numeroEmpleado);
            horas = entrada.nextInt();
            System.out.println("Por favor introduzca el numero de horas extras que trabajo el empleado" + numeroEmpleado);
            horas = entrada.nextInt();
            System.out.println("Introduzca por favor el salario por hora del empleado " + numeroEmpleado);
            salario = entrada.nextDouble();

            if (40 >= horas) {
                total = (horas*salario)+hExtras;
            } else {
                total = 40 * salario + (horas - 40) * (salario + salario / 2);
            }

            System.out.println("El salario del empleado "+ numeroEmpleado+"es:" +total);
        }

    }
}

