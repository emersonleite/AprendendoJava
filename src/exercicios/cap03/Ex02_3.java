package exercicios.cap03;

public class Ex02_3 {
	
	/*
	Neste exercício, você deve completar 4 tarefas: 
	1. Imprima todos os números inteiros de 10 a 25 utilizando uma estrutura de repetição. 
	2. Imprima a soma dos números de 1 a 100, pulando de dois em dois (1, 3, 5, 7, etc.). 
	3. Começando em 0, imprima os números seguintes, enquanto a soma dos números já 
	impressos for menor que 100. 
	4. Imprima a tabuada do 9 (até o décimo valor). 
	*/

	
	    public static void main(String[] args){
	        double razao = 0;
	        int num4 = 0;
	        int soma2 = 0;
	        while (soma2 < 100){
	            System.out.println("Numero " + num4 + "->" + "Soma - " + soma2 + " - Razão - " + razao);
	            soma2 = soma2 + num4;
	            num4++;
	            razao = soma2 / num4; 
	         
	        
	    }
	}

}
