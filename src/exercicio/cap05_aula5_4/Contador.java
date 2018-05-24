package exercicio.cap05_aula5_4;

public class Contador {

	public static int valor; // valor é compartilhado para todas as instancias da classe
	
	static {
		valor = 1;
	}

	public static void incrementar() {
		valor++;
	}

	public static int getValor() {
		return valor;
	}

}
