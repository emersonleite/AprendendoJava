package exercicio.proposto.cap04_2.gabarito;
public class Aplicacao {

	public static void main(String[] args) {

		//Cria a fra��o 5/2
		Fracao f1 = new Fracao();
		f1.definirValores(5, 2);
		
		//Cria a fra��o 1/7
		Fracao f2 = new Fracao();
		f2.definirValores(1, 7);
		
		//Multiplica as fra��es
		Fracao f3 = f1.multiplicar(f2);
		
		//Mostra a fra��o
		System.out.println(f3.obterFracao());
		
		//Mostra o valor da fra��o
		System.out.println(f3.calcularValor());
	}
}
