package exercicio.proposto.cap05_2;

public class Aplicacao {

	public static void main(String[] args) {
		
		//int d = Data.constantes.FORMATO_12H;
		
		//System.out.println(d);
		
		Data d1 = new Data(01,01,13,12,00,01);
		Data d3 = new Data(10,07,18);
		
		d1.imprimir(Data.FORMATO_12H);
		d3.imprimir(Data.FORMATO_12H);
		
		
	}

}
