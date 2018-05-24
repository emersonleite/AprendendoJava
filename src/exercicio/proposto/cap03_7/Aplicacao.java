package exercicio.proposto.cap03_7;

public class Aplicacao {
	
	/*
	7 Exerc�cio 
	Crie uma aplica��o que possibilita a entrada via console de um conjunto de notas de um aluno. 
	Assim que -1 for informado como nota, calcule a m�dia das notas informadas anteriormente e 
	mostre na tela. Caso a nota do aluno seja inv�lida, mostre uma mensagem na tela solicitando 
	uma nova nota. 
	A entrada via console deve ser feita utilizando a classe Console, fornecida junto com os 
	c�digos-fonte deste exerc�cio. Copie o arquivo Console.java para dentro do seu projeto e voc� 
	poder� utiliz�-la. 
	Para ler uma nota do teclado, utilize o seguinte c�digo: 
	double nota = Console.readDouble(); 
	Ap�s a digita��o da nota seguida de ENTER, o valor digitado ser� armazenado na vari�vel nota. 
	*/

	//>>>>>>> EXEMPLO DE ENTRADA VIA CONSOLE -> LEGAL PARA PROGRAMAS COM N�MERO DE ENTRADA INDEFINIDAS <<<<<<<<//

	
	    public static void main(String[] args){
	        
	        double soma = 0;	        
	        double media = 0;	        
	        int i = 0;
	        
	        System.out.println("Digite as notas para calcular as medias:");
	        
	        while (true){	            
	            double nota = Console.readDouble();	            
	            if(nota == -1){	                
	                media = soma / i; 	                
	                System.out.println( "A media das " + i + " notas é " + media);	                
	                break;
	                
	            } else{	            
	            soma = nota + soma;	            
	            // System.out.println(soma);	            
	            i++;           
	                
	            }
	        }
	    }
	    
	}


