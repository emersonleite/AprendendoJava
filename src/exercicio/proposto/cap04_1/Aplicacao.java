package exercicio.proposto.cap04_1;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		// Criação do relogio
		Relogio relogio01 = new Relogio();
		
		// Instanciando os ponteiros dentro da aplicação. Poderia ter sido feito dentro da 
		//classe Relogio dessa forma:
		//Ponteiro ponteiroHora = new Ponteiro();
		
		Ponteiro hora1 = new Ponteiro();
		Ponteiro minuto1 = new Ponteiro();
		Ponteiro segundo1 = new Ponteiro();
		
		relogio01.ponteiroHora = hora1;
		relogio01.ponteiroMinuto = minuto1;
		relogio01.ponteiroSegundo = segundo1;		
				
		//Acerto das horas
		relogio01.acertarRelogio(17, 55, 55);
		
		//Posição dos ponteiros do relógio:	 	
		System.out.println("Posição das horas: " + relogio01.ponteiroHora.posicao);
		System.out.println("Posição dos minutos: " + relogio01.ponteiroMinuto.posicao);
		System.out.println("Posição dos segundos: " + relogio01.ponteiroSegundo.posicao);
		
		//Mostra hora, minuto, segundo
		int hora = relogio01.lerHora();
		int minuto = relogio01.lerMinuto();
		int segundo = relogio01.lerSegundo();
		
		
		System.out.println(hora + ":" + minuto + ":" + segundo);
		//System.out.println("Horas: " + hora);
		//System.out.println("Minutos: " + minuto);
		//System.out.println("Segundos: " + segundo);
		
		
			
	}

}
