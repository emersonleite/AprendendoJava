package exercicios.cap04_1;

public class Relogio {
	//Instanciando ponteiros
	Ponteiro ponteiroHora = new Ponteiro();
	Ponteiro ponteiroMinuto = new Ponteiro();
	Ponteiro ponteiroSegundo = new Ponteiro();
	
	
	void acertarRelogio (int hora, int minuto, int segundo){
		//Convertendo para o formato de 12h...
		hora = hora % 12;
		
		ponteiroHora.posicao = hora;
		ponteiroMinuto.posicao = minuto / 5;
		ponteiroSegundo.posicao = segundo / 5;	
		
	}
	
	int lerHora() {
		return ponteiroHora.posicao;
	}
	
	int lerMinuto() {
		return ponteiroMinuto.posicao * 5;
	}
	
	int lerSegundo() {
		return ponteiroSegundo.posicao * 5;
	}

}
