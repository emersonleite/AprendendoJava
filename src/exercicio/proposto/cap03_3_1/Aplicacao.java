package exercicio.proposto.cap03_3_1;

public class Aplicacao {
	
	    public static void main(String[] args){
	        int num0 = 10;
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
	


