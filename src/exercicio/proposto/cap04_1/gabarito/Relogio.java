package exercicio.proposto.cap04_1.gabarito;
public class Relogio {

	//ponteiro das horas
	Ponteiro ponteiroHora = new Ponteiro();
	
	//ponteiro dos minutos
	Ponteiro ponteiroMinuto = new Ponteiro();
	
	//ponteiro dos segundos
	Ponteiro ponteiroSegundo = new Ponteiro();
	
	//acerta o rel�gio a partir de uma hora, minuto e segundo
	void acertarRelogio(int hora, int minuto, int segundo) {
		//a linha abaixo calcula o m�dulo da hora. Assim, se for fornecido 13, por exemplo, � considerado
		//hora 1.
		hora = hora % 12;
		
		//acerta a posi��o de cada um dos ponteiros
		//a divis�o por 5 dos minutos e segundos � necess�ria para converter o hor�rio em posi��o.
		//exemplo: 45 minutos representa a posi��o 9 do ponteiro dos minutos 
		ponteiroHora.posicao = hora;
		ponteiroMinuto.posicao = minuto / 5;
		ponteiroSegundo.posicao = segundo / 5;
	}
	
	//l� a hora do rel�gio
	int lerHora() {
		return ponteiroHora.posicao;
	}
	
	//l� o minuto do rel�gio
	int lerMinuto() {
		return ponteiroMinuto.posicao * 5;
	}
	
	//l� o segundo do rel�gio
	int lerSegundo() {
		return ponteiroSegundo.posicao * 5;
	}
}
