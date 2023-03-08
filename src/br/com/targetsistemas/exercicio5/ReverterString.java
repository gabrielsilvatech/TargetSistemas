package br.com.targetsistemas.exercicio5;

import java.util.Scanner;

public class ReverterString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite uma string:");
		String entrada = scanner.nextLine();

		String reversedString = "";

		for (int i = entrada.length() - 1; i >= 0; i--) {
			reversedString += entrada.charAt(i);
		}

		System.out.println("A string revertida é: " + reversedString);
	}

}
