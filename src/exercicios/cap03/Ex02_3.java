package exercicios.cap03;

public class Ex02_3 {
	
	/*
	Neste exerc�cio, voc� deve completar 4 tarefas: 
	1. Imprima todos os n�meros inteiros de 10 a 25 utilizando uma estrutura de repeti��o. 
	2. Imprima a soma dos n�meros de 1 a 100, pulando de dois em dois (1, 3, 5, 7, etc.). 
	3. Come�ando em 0, imprima os n�meros seguintes, enquanto a soma dos n�meros j� 
	impressos for menor que 100. 
	4. Imprima a tabuada do 9 (at� o d�cimo valor). 
	*/

	
	    public static void main(String[] args){
	        double razao = 0;
	        int num4 = 0;
	        int soma2 = 0;
	        while (soma2 < 100){
	            System.out.println("Numero " + num4 + "->" + "Soma - " + soma2 + " - Raz�o - " + razao);
	            soma2 = soma2 + num4;
	            num4++;
	            razao = soma2 / num4; 
	         
	        
	    }
	}

}
