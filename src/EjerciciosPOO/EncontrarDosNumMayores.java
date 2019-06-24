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
public class EncontrarDosNumMayores {
       
        public static void main(String[] args) {
   
        int contador=0, numero=0, numeroGrande=0;
 
		Scanner entrada = new Scanner(System.in);
 
		while(contador < 10){
			System.out.println("Dame un entero");
			numero = entrada.nextInt();
 
			if(numero > numeroGrande)
				numeroGrande = numero;
 
 
			contador++;  
		} 
 
	         
 
	} 

	}

         
            

