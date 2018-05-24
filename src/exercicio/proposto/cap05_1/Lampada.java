/*
 * Crie uma classe Lampada que possui um atributo ligada, o qual indica se a lâmpada está ligada 
ou desligada. 
Ao construir uma lâmpada, o estado dela (ligada ou desligada) deve ser fornecido. Para ligar e 
desligar a lâmpada, os métodos ligar() e desligar() devem ser chamados, 
respectivamente. Aliás, esta é a única forma de alterar o estado da lâmpada, já que o atributo 
ligada não deve ser visível fora da classe. 
A lâmpada também deve possuir um método imprimir(). Quando chamado, ele mostra as 
mensagens “Lâmpada ligada” ou “Lâmpada desligada”, dependendo do estado atual. 
Construa uma aplicação que cria uma lâmpada ligada, muda o estado dela e também imprime 
o estado atual após cada chamada aos métodos ligar() e desligar(). 
*/

package exercicio.proposto.cap05_1;

public class Lampada {
	private boolean ligada;	
	
	//Construtor da lampada passando valor de ligada (true) ou desligada (false) na criação
	public Lampada (boolean ligada) {
		setLigada(ligada);		
	}
	
	//Definindo um construtor que não recebe parâmetros
	public Lampada() {
		
	}
	
	//Método Getter
	public boolean isLigada() {
		return ligada;
	}
	
	//Método Setter
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	//Método para ligar a lampada. Utilização do métodos setter.
	public void ligar() {
		setLigada(true);
	}
	
	//Método para desligar a lampada. Utilização do métodos setter.
	public void desligar() {
		setLigada(false);		
	}
	
	public void imprimir() {
		isLigada(); //chamada ao método getter dentro do método imprimir, que retorna o estado da lampada
		if (ligada == true) {
			System.out.println("A lampada está ligada");
		}else {
			System.out.println("A lampada está desligada");
		}
		
	}	
}
