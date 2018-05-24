package exercicio.proposto.cap04_1.gabarito;

public class Aplicacao {

	public static void main(String[] args) {
		
		//cria o rel�gio r1
		Relogio r1 = new Relogio();
		
		//acerta o rel�gio com o hor�rio 3:30:50
		r1.acertarRelogio(3, 30, 50);
		
		//mostra as posi��es dos ponteiros do rel�gio
		System.out.println("Posi��o da hora: " + r1.ponteiroHora.posicao);
		System.out.println("Posi��o do minuto: " + r1.ponteiroMinuto.posicao);
		System.out.println("Posi��o do segundo: " + r1.ponteiroSegundo.posicao);
		
		//mostra a hora, minuto e segundo do rel�gio, que devem ser 3, 30 e 50.
		int hora = r1.lerHora();
		int minuto = r1.lerMinuto();
		int segundo = r1.lerSegundo();
		
		System.out.println("Hora: " + hora);
		System.out.println("Minuto: " + minuto);
		System.out.println("Segundo: " + segundo);
		
		//cria o rel�gio r2
		Relogio r2 = new Relogio();
		
		//acerta o rel�gio com o hor�rio 22:00:00. O c�digo transformar� automaticamente para 10h
		r2.acertarRelogio(22, 0, 0);
		
		//l� a hora do rel�gio, que deve ser 10.
		System.out.println("Hora do segundo rel�gio: " + r2.lerHora());
	}
}
