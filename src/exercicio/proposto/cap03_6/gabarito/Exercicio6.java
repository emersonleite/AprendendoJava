package exercicio.proposto.cap03_6.gabarito;


public class Exercicio6 {

	public static void main(String[] args) {

		//vari�veis para armazenar dia, m�s e ano
		int dia = 31;
		int mes = 5;
		int ano = 1982;

		//datas consideradas inv�lidas s�o datas cujo ano seja menor que 1900 ou maior que 2999
		//ou que o m�s seja menor que 1 ou maior que 12, ou dia menos que 1 ou maior que 31
		if (ano < 1900 || ano > 2999 || mes < 1 || mes > 12 || dia < 1 || dia > 31) {
			System.out.println("Data inv�lida");

		} else if ((dia <= 31) && (mes <= 12)) {
			//se o m�s for 2 e o dia maior que 28, a data � inv�lida. Ou ent�o se o dia for 31
			//e o m�s for um dos meses que tem 30 dias, a data tamb�m � inv�lida
			if (((dia > 28) && (mes == 2))
					|| ((dia == 31) && ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)))) {
				System.out.println("Data inv�lida");
			} else {
				//caso contr�rio ela � v�lida
				System.out.println("Data v�lida");
			}
		
		} else {
			System.out.println("Data inv�lida");
		}

	}
}
