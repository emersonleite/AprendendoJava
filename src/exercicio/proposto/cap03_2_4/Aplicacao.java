package exercicio.proposto.cap03_2_4;

public class Aplicacao {
	/*
	Neste exerc�cio, voc� deve completar 4 tarefas: 
	1. Imprima todos os n�meros inteiros de 10 a 25 utilizando uma estrutura de repeti��o. 
	2. Imprima a soma dos n�meros de 1 a 100, pulando de dois em dois (1, 3, 5, 7, etc.). 
	3. Come�ando em 0, imprima os n�meros seguintes, enquanto a soma dos n�meros j� 
	impressos for menor que 100. 
	4. Imprima a tabuada do 9 (at� o d�cimo valor). 
	*/

	
	    public static void main(String[] args){
	        int num1 = 9;
	        int result = 0;
	        
	        System.out.println("Tabuada do " + num1);
	        
	        for(int num = 1; num <=10; num++){
	            result = num1 * num;
	            
	            System.out.println (num1 + " X " + num + " = " + result);
	        
	        
	        
	    }
	}

}
