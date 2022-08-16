package Familia55;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int num;
		double raiz,pot;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com um valor: ");
		num = leia.nextInt();
		
		
		if(num % 2 == 0 )
		{
			System.out.println("\nEste valor é par: "+num);
			raiz = Math.sqrt(num);
			System.out.println("\nEsta é a sua raiz quadrada: "+raiz);
			System.out.printf("\nRaiz quadrada com duas casas decimais: %2.2f",raiz);
			

			
		}
		else
		{
			System.out.println("\nEste valor é ímpar: "+num);
			pot = Math.pow(num, 2);
			System.out.println("\nEste é o número elevado ao quadrado: "+pot);
		}
		
		
		

	}

}
