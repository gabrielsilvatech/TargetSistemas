package br.com.targetsistemas.exercicio2;

import java.util.Scanner;

public class SequenciaFibonacci {
	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int c = 0;
		int contador = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		contador = scanner.nextInt();

		while (a <= contador) {
			if (contador == c) {
				System.out.println(c);
				System.out.println("O numero digitado faz parte da sequência Fibonacci");
				break;
			}
			System.out.println(c);
			c = b + a;
			b = a;
			a = c;

		}
	}

}
