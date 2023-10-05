package Controler;

public class atividade3 {

	public static void main(String[] args) {
		double j = 1500;
		double f = 2300;
		double m = 1700;
		double soma = (j + f + m);
		System.out.println("O gasto total foi: " + soma);
		if (soma >= 50000) {
			System.out.println("dentro do Orçamento");

		} else {
			System.out.println("Pegou em Bomba!!!!");
		}

	}

}
