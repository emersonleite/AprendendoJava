package exercicio.proposto.cap04_2.gabarito;

/*
 * Representa uma fra��o
 */
public class Fracao {

	//Numerador da fra��o
	double numerador;
	
	//Denominador da fra��o
	double denominador;
	
	//Calcula o valor do fra��o
	double calcularValor() {
		/*
		 * Para calcular o valor, basta dividir o numerador da fra��o pelo denominador. Se o denominador 
		 * for 0, o resultado � assumido como 0, j� que n�o � poss�vel fazer uma divis�o por 0.
		 */
		if(denominador == 0) {
			return 0;
		}
		return numerador / denominador;
	}
	
	/*
	 * Multiplica a fra��o atual (do pr�prio objeto) por outra (passada como par�metro), dando uma terceira fra��o como resultado.
	 */
	Fracao multiplicar(Fracao f) {
		//Cria um novo resultado
		Fracao result = new Fracao();
		
		//Multiplica os numeradores e denominadores das fra��es
		result.numerador = this.numerador * f.numerador;
		result.denominador = this.denominador * f.denominador;
		
		//Retorna a nova fra��o
		return result;
	}
	
	/*
	 * Define os valores do numerador e denominador da fra��o
	 */
	void definirValores(double numerador, double denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	/*
	 * Retorna a representa��o da fra��o em forma de string
	 */
	String obterFracao() {
		return numerador + "/" + denominador;
	}
}
