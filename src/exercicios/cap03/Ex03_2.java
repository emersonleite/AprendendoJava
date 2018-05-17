package exercicios.cap03;

public class Ex03_2 {
	
	/*
	O cálculo do fatorial de um número (!) segue a seguinte regra: 
	0!  1
	1!  0!  1
	2!  1!  2
	... 
	!    	 1
	 !  
	Escreva uma aplicação que efetua o cálculo do fatorial utilizando a forma iterativa (usando 
	estruturas de repetição) e outra que efetua o mesmo cálculo, mas de forma recursiva (o 
	método de cálculo do fatorial chama ele mesmo). 
	Para maiores informações sobre o fatorial, consulte: http://pt.wikipedia.org/wiki/Factorial. 
	4 Ex


	class exercicio3_1{
	    public static void main(String[] args){
	        int num0 = 7;
	        int num = 0;
	        int fat = 1;
	        int i = 1;
	        
	        if(num0 == 0){
	            System.out.println("O fatorial de " + num0 + " eh " + fat);
	        } else if (num0 ==1){
	            fat = fat * 1;
	            System.out.println("O fatorial de " + num0 + " eh " + fat);
	        } else{
	            i = num0 - 1;
	            num = num0;
	            while(i >= 1){
	                fat = i * num0;
	                i--;
	                num0 = fat;
	            }
	            System.out.println("O fatorial de " + num + " eh " + fat);
	        }
	    }
	}

	*/

}
