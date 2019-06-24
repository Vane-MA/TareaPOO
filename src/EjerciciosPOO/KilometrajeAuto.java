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
public class KilometrajeAuto {
    public static void main(String[] args) {
           Scanner entrada = new Scanner(System.in);
        int galon;
        int kilometros;
        
        KilometrajeAuto objeto = new KilometrajeAuto();
      
                
        System.out.println("Introduzca el numero de gasolina restante");
        galon = entrada.nextInt();
        
        while (-1!= galon) {

            System.out.println("Introduzca el numero de kilometros recorridos");
            kilometros = entrada.nextInt();
              
              
            System.out.println("Los kilometros por galon fueron:"+objeto.Datos(galon, galon));
            System.out.println("Introduzca el numero de gasolina restante");
            galon = entrada.nextInt();
        }

    }

    private double Datos(double km ,double gl) {
        double p= km*gl;
        return p;
    }

}
