package exercicio.proposto.cap03_3_2.gabarito;


public class Exercicio3_2 {

	public static void main(String[] args) {
		//valor para o qual o fatorial ser� calculado
		int valor = 10;
		
		//calcula o fatorial do valor
		int resposta = calcularFatorial(valor);

		System.out.println("O fatorial de " + valor + " � igual a " + resposta);
	}
	
	/*
	 * Uma das formas de implementar o c�lculo do fatorial � utilizar uma chamada recursiva, isto �,
	 * a fun��o chama ela mesma.
	 */
	static int calcularFatorial(int num) {
		if (num == 0) {
			//para num == 0, o fatorial � 1
			return 1;
		}
		
		//caso contr�rio, o fatorial � o n�mero multiplicado pelo fatorial do seu antecessor
		return num * calcularFatorial(num - 1);
	}
}
