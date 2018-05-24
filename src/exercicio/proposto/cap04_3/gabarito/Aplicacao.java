package exercicio.proposto.cap04_3.gabarito;

public class Aplicacao {

	public static void main(String[] args) {

		//Cria um tri�ngulo, d� valor aos atributos e calcula a �rea
		Triangulo tr = new Triangulo();
		tr.base = 2.5;
		tr.altura = 4;
		double area = tr.calcularArea();
		System.out.println("�rea tri�ngulo: " + area);
		
		//Cria um quadrado, d� valor aos atributos e calcula a �rea
		Quadrado q = new Quadrado();
		q.lado = 3.2;
		area = q.calcularArea();
		System.out.println("�rea quadrado: " + area);
		
		//Cria uma circunfer�ncia, d� valor aos atributos e calcula a �rea
		Circunferencia c = new Circunferencia();
		c.raio = 5;
		area = c.calcularArea();
		System.out.println("�rea circunfer�ncia: " + area);
		
		//Cria um trap�zio, d� valor aos atributos e calcula a �rea
		Trapezio tp = new Trapezio();
		tp.baseMaior = 7.1;
		tp.baseMenor = 3.6;
		tp.altura = 2;
		area = tp.calcularArea();
		System.out.println("�rea trap�zio: " + area);
	}
}
