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
public class NumMayorIngresado {
     public static void main(String[] args) {
         
         int n;
         int n1;
         int nMayor = 0;
         int contador = 0;

         Scanner entrada = new Scanner(System.in);

         while (contador < 10) {
             System.out.println("Ingrese un numero");
             n = entrada.nextInt();

             if (n > nMayor) {
                 nMayor = n;
             }
             contador++;
         }
         System.out.println("el entero mas grande es:" + nMayor);
     }
}


