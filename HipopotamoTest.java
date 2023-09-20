
public class HipopotamoTest {

	public static void main(String[] args) {
		
		Animal hipopotamo = new Hipopotamo();
		hipopotamo.setCor("cinza");
		hipopotamo.setPeso(500);
		
		
		hipopotamo.comer();
		hipopotamo.andar();
		hipopotamo.dormir();
		
		
		System.out.println(
				"Meu Hipopotamo pesa " + hipopotamo.getPeso() +
					" e é da cor " + hipopotamo.getCor()); 
	}

}
