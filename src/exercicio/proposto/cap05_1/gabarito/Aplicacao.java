package exercicio.proposto.cap05_1.gabarito;

public class Aplicacao {

	public static void main(String[] args) {
	
		// Instancia uma l�mpada acesa
		Lampada l = new Lampada(true);
		
		// Imprime o estado atual
		l.imprimir();
		
		// Desliga a l�mpada e imprime o novo estado
		l.desligar();
		l.imprimir();
		
		// Liga a l�mpada e imprime o novo estado
		l.ligar();
		l.imprimir();
	}
}
