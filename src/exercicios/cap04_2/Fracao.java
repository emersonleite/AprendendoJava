package exercicios.cap04_2;

public class Fracao {
	int numerador;
	int denominador;
	
	Fracao fracao = new Fracao();
	Fracao fracao2 = new Fracao();

	void mult (int a, int b, int c, int d) {
		fracao.numerador = a;
		fracao.denominador = b;
		fracao2.numerador = c;
		fracao2.denominador = d;
		
		int mult_num = a * c;
		int mult_den = b * d;
		
		System.out.println("O resultado da multiplicação " + a + "/" + b + "por" + c + "/" + d + "é:" + mult_num + "/" + mult_den);
		
		
	}
}
