package exercicios.cap03;

public class Ex04_0 {
	/*Imprima os 15 primeiros números da série de Fibonacci. A série de Fibonacci é tem os 
	seguintes elementos: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc. Para calculá-la, o primeiro e segundo 
	elementos valem 1, e daí por diante, o n-ésimo elemento vale o (n-1)-ésimo elemento somado 
	ao (n-2)-ésimo elemento (ex: 8 = 5 + 3). 
	Para mais informações, consulte: http://pt.wikipedia.org/wiki/Número_de_Fibonacci. 
	*/

	
	    public static void main(String[] args){
	        long fibo = 0;
	        long f0 = 0;
	        long f1 = 1;
	        long n = 7;
	        long i = 0;
	        
	        while (i <= n-3){
	            
	            fibo = f0 + f1;
	            
	            f0 = f1;
	            
	            f1 = fibo;
	            
	            i++;
	        }
	        System.out.println(" O termo " + n + " é " + fibo);
	        }
	        
	    }

