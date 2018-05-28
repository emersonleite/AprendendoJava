package exercicio.proposto.cap05_2.obsoleto;

public class Aplicacao {

	public static void main(String[] args) {
		
		//int d = Data.constantes.FORMATO_12H;
		
		//System.out.println(d);
		
		Data d1 = new Data(10,03,2000,10,30,10);
		Data d2 = new Data(15,06,2000,23,15,20);
		Data d3 = new Data(5,10,2005);
				
		d1.imprimir(Data.FORMATO_12H);
		d1.imprimir(Data.FORMATO_24H);
		
		d2.imprimir(Data.FORMATO_12H);
		d2.imprimir(Data.FORMATO_24H);
		
		d3.imprimir(Data.FORMATO_12H);
		d3.imprimir(Data.FORMATO_24H);
		
		
	}

}
