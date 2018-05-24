package exercicio.proposto.cap03_2_4.gabarito;

public class Exercicio2_4 {

	public static void main(String[] args) {
		
		//vari�vel para controlar quantos n�meros j� foram impressos
		int cont = 0;
		
		//inicia o for com o i valendo 1
		for(int i = 1; cont < 10; i++) {
			
			//o c�digo if verifica se o resto da divis�o entre i e 9 � 0.
			//caso seja, o n�mero � m�ltiplo de 9 e deve ser impresso
			if(i % 9 == 0) {
				System.out.println(i);
				
				//incrementa a quantidade de n�meros impressos
				cont++;
			}
		}
	}
}
