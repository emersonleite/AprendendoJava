package exercicio.proposto.cap03_3_2;

public class Aplicacao {
	
	/*
	O c�lculo do fatorial de um n�mero (!) segue a seguinte regra: 
	0!  1
	1!  0!  1
	2!  1!  2
	... 
	!    	 1
	 !  
	Escreva uma aplica��o que efetua o c�lculo do fatorial utilizando a forma iterativa (usando 
	estruturas de repeti��o) e outra que efetua o mesmo c�lculo, mas de forma recursiva (o 
	m�todo de c�lculo do fatorial chama ele mesmo). 
	Para maiores informa��es sobre o fatorial, consulte: http://pt.wikipedia.org/wiki/Factorial. 
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
