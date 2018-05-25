package exercicio.proposto.cap05_2;

public class Data{
	
	private int dia;
	private int mes;
	private int ano;
	private int hora;
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
	
	public void imprimir(int formato) {
		if (formato == FORMATO_12H && hora > 12) {
			System.out.println(dia + "/" + mes + "/" + ano + " " 
		+ (hora - formato) + ":" + minuto + ":" + segundo );	
		}else {
			System.out.println(dia + "/" + mes + "/" + ano + " " + hora + ":" + minuto + ":" + segundo );
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
