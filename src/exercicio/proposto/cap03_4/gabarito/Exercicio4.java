package exercicio.proposto.cap03_4.gabarito;

public class Exercicio4 {

	public static void main(String[] args) {
		int j = 1;
		
		//este algoritmo � uma das maneiras de calcular a s�rie de Fibonacci. As vari�veis i e j
		//s�o utilizadas para percorrerem a sequ�ncia num�rica e acumularem o resultado.
		
		//A vari�vel i � respons�vel por encontrar o pr�ximo n�mero da sequ�ncia (somando ela mesma com j).
		//A vari�vel j sempre aponta para o n�mero anterior da sequ�ncia (o n�mero que antes era i).
		//E a vari�vel cont conta quantas vezes o for executou, para que possa ocorrer a parada no 15o elemento
		//A forma mais f�cil de entender a solu��o deste exerc�cio � fazendo um teste de mesa: anote em um papel
		//o valor das vari�veis e simule uma execu��o passo a passo.
		
		for (int i = 0, cont = 0; cont < 15; cont++) {
			System.out.print(i + " ");
			i = i + j;
			j = i - j;
		}
	}
}
