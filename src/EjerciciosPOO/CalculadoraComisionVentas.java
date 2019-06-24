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
public class CalculadoraComisionVentas {
    public static void main(String[] args) {
        
        CalculadoraComisionVentas objeto = new CalculadoraComisionVentas();
        objeto.Recibe();

    }

    public void Recibe() {
        int numeroEmpleado;
        int numero;
        int salarioEmpleado = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el numero del empleado que lo atendio:");
        numeroEmpleado = entrada.nextInt();

        while (-1 != numeroEmpleado) {

            System.out.println("Por favor introduzca que articulo ha vendido el empleado: "+ numeroEmpleado);
            numero = entrada.nextInt();

            while (numero== numero) {

                if (1 == numero) {
                    salarioEmpleado += 239.99;
                }
                if (2 == numero) {
                    salarioEmpleado += 129.75;
                }
                if (3 == numero) {
                    salarioEmpleado += 99.95;
                }
                if (4 == numero) {
                    salarioEmpleado += 350.89;
                } 

            System.out.println("El salario total del empleado es"+200+Retorna(salarioEmpleado));

            System.out.println("Introduzca el numero del empleado que lo atendio:" );
            numeroEmpleado = entrada.nextInt();
        } 
    } 
    }
    public double Retorna(double salario) {
        return salario * 9 / 100;
    }
}
