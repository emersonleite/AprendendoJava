package exercicio.proposto.cap03_4;

public class Aplicacao {
	/*Imprima os 15 primeiros n�meros da s�rie de Fibonacci. A s�rie de Fibonacci � tem os 
	seguintes elementos: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc. Para calcul�-la, o primeiro e segundo 
	elementos valem 1, e da� por diante, o n-�simo elemento vale o (n-1)-�simo elemento somado 
	ao (n-2)-�simo elemento (ex: 8 = 5 + 3). 
	Para mais informa��es, consulte: http://pt.wikipedia.org/wiki/N�mero_de_Fibonacci. 
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
	        System.out.println(" O termo " + n + " � " + fibo);
	        }
	        
	    }

