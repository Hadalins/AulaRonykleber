
public class Animal {

	
private double peso;
private double altura;
private String cor;

public void comer() {
	
	System.out.println("Sou onivoro, como tudo!");
}

public void dormir() {System.out.println("Deitei e dormi"); }

public void andar() {System.out.println("Estou andando por ai"); }

public void fazerBarulho() {System.out.println("Huf, Huf, Huf"); }

public double getAltura() {
	return altura;
}

public void setAltura(double altura) {
	this.altura = altura;
}

public String getCor() {
	return cor;
}

public void setCor(String cor) {
	this.cor = cor;
}

public double getPeso() {
	return peso;
}

public void setPeso(double peso) {
	this.peso = peso;
}
}
