package exercicios.cap03;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Um aluno tirou notas 8.5, 7.5 e 6.0 em provas que tinham peso 3, 2 e 5, respectivamente. 
	    //Escreva um programa que imprima a média do aluno. 

	    double nota1 = 8.5;
	    double nota2 = 7.5;
	    double nota3 = 6.0;
	    
	    int peso1 = 3;
	    int peso2 = 2;
	    int peso3 = 5;
	    
	    double mediaDoAluno;
	    
	    mediaDoAluno = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
	    
	    System.out.println("A media das notas � " + mediaDoAluno);

	}

}
