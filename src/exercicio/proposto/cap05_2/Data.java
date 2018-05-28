// Exercício corrigido baseado em gabarito oficial. Não copiado :)
// Exercício anterior está na pasta obsoleto

package exercicio.proposto.cap05_2;

public class Data{
	
	private int dia;
	private int mes;
	private int ano;
	private int hora = -1;
	private int minuto;
	private int segundo;
	
	public static final int FORMATO_12H = 12;
	public static final int FORMATO_24H = 24;
	
	
	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;		
	}
	
		public Data(int dia, int mes, int ano, int hora, int minuto, int segundo){
		this(dia, mes, ano);
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
		}
	
public void imprimir (int formato) {
	String data = dia + "/" + mes + "/" + ano;
	//Com hora = -1, significa que o construtor 02 não foi chamado, pois -1 é o valor de inicialização de hora...
	//Nesse primeiro if se considera o construtor que com parametros de data somente!
	if (hora == -1) {
		if(formato == FORMATO_12H || formato == FORMATO_24H) {
			System.out.println(data);
		}		
	// No else abaixo se considera o construtor com parâmetros de entrada de data e hora, inclusive.
	}else {
		String dataehoras;
		String horas = ":" + minuto + ":" + segundo + " ";
		if (formato == FORMATO_12H) {
			if (hora > 12){
				dataehoras = data + " " + (hora - FORMATO_12H) + horas + "PM";
			}else {
				dataehoras = data +  " " + hora + horas + "AM";
			}
		}else {
			dataehoras = data +  " " + hora + horas;
		}
		System.out.println(dataehoras);
	}	
}
	
	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}	
}
