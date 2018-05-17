package exercicios.cap03;

public class Ex07_0 {
	
	/*
	7 Exercício 
	Crie uma aplicação que possibilita a entrada via console de um conjunto de notas de um aluno. 
	Assim que -1 for informado como nota, calcule a média das notas informadas anteriormente e 
	mostre na tela. Caso a nota do aluno seja inválida, mostre uma mensagem na tela solicitando 
	uma nova nota. 
	A entrada via console deve ser feita utilizando a classe Console, fornecida junto com os 
	códigos-fonte deste exercício. Copie o arquivo Console.java para dentro do seu projeto e você 
	poderá utilizá-la. 
	Para ler uma nota do teclado, utilize o seguinte código: 
	double nota = Console.readDouble(); 
	Após a digitação da nota seguida de ENTER, o valor digitado será armazenado na variável nota. 
	*/

	//>>>>>>> EXEMPLO DE ENTRADA VIA CONSOLE -> LEGAL PARA PROGRAMAS COM NÚMERO DE ENTRADA INDEFINIDAS <<<<<<<<//

	
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


