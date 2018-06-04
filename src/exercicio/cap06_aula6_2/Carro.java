package exercicio.cap06_aula6_2;
public class Carro extends Veiculo {

	private boolean quatroPortas;

	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
	
	@Override                     // anotação. Importante para saber que o método está sendo sobrescrito
	public void imprimirDados() {
		super.imprimirDados();    // Chamando o método da superclasse para imprimir o que é padrão da classe, para evitar código em duplicidade... então super se refere à classe mãe.
		System.out.println("Quatro portas: " + quatroPortas);
	}
}
