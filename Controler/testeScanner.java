package Controler;

import java.util.Scanner;

public class testeScanner {

	public static void main(String[] args) {

		int valor;
		Scanner teclado;
		System.out.println("digite um numero");
		teclado = new Scanner(System.in);
		valor = teclado.nextInt();
		System.out.println("valor lido " + valor);
	}

}
