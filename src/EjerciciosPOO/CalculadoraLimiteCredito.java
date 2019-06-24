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
public class CalculadoraLimiteCredito {

    public static void main(String[] args) {
        CalculadoraLimiteCredito objeto = new CalculadoraLimiteCredito();
        objeto.Recibir();
    }

    public void Recibir() {

        int NumCuenta;
        int saldo;
        int cargos;
        int depositos;
        int limite;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese numero de cuenta");
        NumCuenta = entrada.nextInt();

        while (-1 != NumCuenta) {

            System.out.println("Ingrese saldo inicial");
            saldo = entrada.nextInt();
            System.out.println("Ingrese el numero de depositos realizados por el cliente");
            depositos = entrada.nextInt();
            System.out.println("Ingrese el numero de cargos hechos al cliente");
            cargos = entrada.nextInt();
            System.out.println("Ingrese el limite del credito");
            limite = entrada.nextInt();
            double x = Retorna(saldo, depositos, cargos);
            if (x - limite >= 0) {
                System.out.println("Usted a excedido el limite");
            }
        }

    }

    private double Retorna(double saldo, double depositos, double cargos) {
        return saldo + depositos - cargos;

}


}
