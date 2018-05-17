package exercicios.cap03;

public class Ex02_2 {
	
	/*
	Neste exercício, você deve completar 4 tarefas: 
	1. Imprima todos os números inteiros de 10 a 25 utilizando uma estrutura de repetição. 
	2. Imprima a soma dos números de 1 a 100, pulando de dois em dois (1, 3, 5, 7, etc.). 
	3. Começando em 0, imprima os números seguintes, enquanto a soma dos números já 
	impressos for menor que 100. 
	4. Imprima a tabuada do 9 (até o décimo valor). 
	*/

	
	    public static void main(String[] args){
	        //int num1 = 10;
	        int num2 = 1;
	        int num3 = 1;
	        int soma = 0;

	   
	        System.out.println("Exercicio parte 2");
	        while (num2 <=100){
	            if (num2 % 2 !=0){
	            soma = soma + num2;
	            System.out.println(soma + "-" + num3);
	            num3++; // indice do numero
	            }
	            num2++;
	        
	        
	    }
	}

}
