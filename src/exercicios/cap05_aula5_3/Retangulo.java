package exercicios.cap05_aula5_3;

public class Retangulo {

	private double largura;
	private double altura;
	
	//Sobrecarga de construtores 01 e 02...: 
	//Construtor 01 de Retangulo que não recebe parâmetros
	public Retangulo() {
		// Chamada do construtor 02 que recebe parâmetros
		// através do this().
		this(4, 3);   // O this deve ser a primeira instrução...
		//largura = 4;
		//altura = 3;
	}
	
	//Construtor 02 que recebe parâmetros
	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	public double calcularArea() {
		return largura * altura;
	}
}
