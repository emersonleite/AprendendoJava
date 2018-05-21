package exercicios.cap04_4;

public class Aplicacao {

	public static void main(String[] args) {
		
		double mediaDaTurma;

		// Criando objeto turma01  a partir da classe Turma 
		Turma turma01 = new Turma();
		
		// Criando alunos Jose, Joaquim e Rebeca a partir da classe Aluno
		Aluno Jose = new Aluno();
		Aluno Joaquim = new Aluno();
		Aluno Rebeca = new Aluno();
		
		// AS PROVAS FORAM INSTANCIADAS DENTRO DA CLASSE ALUNO...
		//Prova prova1 = new Prova();
		//Prova prova2 = new Prova();
		
		// Associando alunos da turma a alunos criados 
		turma01.aluno1 = Jose;
		turma01.aluno2 = Joaquim;
		turma01.aluno3 = Rebeca;
		
		//Utilizando o nome para chamada, associando notas ao aluno Jose.
		Jose.prova1.notaParte1 = 4.0;
		Jose.prova1.notaParte2 = 2.5;
		Jose.prova2.notaParte1 = 1.0;
		Jose.prova2.notaParte2 = 7.0;
		
		// Utilizando a referência de turma para a chamada. MESMO EFEITO DO APRESENTADO ACIMA 
		turma01.aluno2.prova1.notaParte1 = 6.5;
		turma01.aluno2.prova1.notaParte2 = 3.5;
		turma01.aluno2.prova2.notaParte1 = 0.0;
		turma01.aluno2.prova2.notaParte2 = 3.0;
		
		//Utilizando o nome para chamada, associando notas ao aluno Rebeca.
		Rebeca.prova1.notaParte1 = 5.0;
		Rebeca.prova1.notaParte2 = 4.0;
		Rebeca.prova2.notaParte1 = 6.0;
		Rebeca.prova2.notaParte2 = 1.5;
		
		// Calculo da média da turma01... 
		mediaDaTurma = turma01.calcularMedia();
		
		System.out.println("A média da turma é " + mediaDaTurma);
		
		
		
		
		

	}

}
