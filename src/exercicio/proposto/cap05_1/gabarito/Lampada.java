package exercicio.proposto.cap05_1.gabarito;

public class Lampada {

	// Armazena o estado atual da l�mpada. Este atributo � privado porque s� deve 
	// ser vis�vel dentro desta classe
	private boolean ligada;
	//boolean ligada;
	
	// Construtor. Recebe como par�metro o estado inicial da l�mpada
	public Lampada(boolean ligada) {
		// Utiliza o operador this para diferenciar o atributo do par�metro
		this.ligada = ligada;
	}
	
	// Liga a l�mpada
	public void ligar() {
		ligada = true;
	}
	
	// Desliga a l�mpada
	public void desligar() {
		ligada = false;
	}
	
	// Imprime o estado atual da l�mpada
	public void imprimir() {
		if (ligada) {
			System.out.println("L�mpada ligada");
		} else {
			System.out.println("L�mpada desligada");
		}
	}
}
