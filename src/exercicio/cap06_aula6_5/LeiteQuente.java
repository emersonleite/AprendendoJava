package exercicio.cap06_aula6_5;
public class LeiteQuente extends Bebida {

	public LeiteQuente() {
		super("Leite quente", true);
	}
	
	@Override
	public void preparar() {
		System.out.println("Pegando um copo");
		System.out.println("Colocando o leite no copo");
	}
}
