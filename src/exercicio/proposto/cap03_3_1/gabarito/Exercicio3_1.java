package exercicio.proposto.cap03_3_1.gabarito;


public class Exercicio3_1 {

	public static void main(String[] args) {
		//valor para o qual o fatorial ser� calculado
		int valor = 10;
		
		//esta vari�vel acumula o resultado
		long resposta = 1;
	
		//no bloco for, o valor j� calculado (vari�vel resposta) � multiplicado com o valor de i,
		//que � o n�mero corrente da itera��o.
		for (int i = 2; i <= valor; i++) {
			resposta *= i;
		}

		System.out.println("O fatorial de " + valor + " � igual a " + resposta);
	}
}
