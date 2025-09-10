package exercicios;

import java.util.Scanner;

public class ExFumante {

		public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);

	        System.out.print("Quantos cigarros você fuma por dia? ");
	        int cigarrosPorDia = in.nextInt();

	        System.out.print("Há quantos anos você fuma? ");
	        int anosFumando = in.nextInt();

	        int totalCigarros = cigarrosPorDia * anosFumando * 365;
	        int minutosPerdidos = totalCigarros * 10;
	        int diasPerdidos = minutosPerdidos / 1440;

	        System.out.print("Você perdeu aproximadamente " + diasPerdidos + " dias de vida.");
	    }

	}

