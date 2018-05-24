package exercicio.proposto.cap04_4.gabarito;

public class Aplicacao {

	public static void main(String[] args) {

		// Cria��o da turma
		Turma turma = new Turma();
		
		// Cria��o dos alunos
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		
		// Associa��o entre os alunos e a turma
		turma.aluno1 = aluno1;
		turma.aluno2 = aluno2;
		turma.aluno3 = aluno3;
		
		// Cria as provas para cada aluno e define as notas
		
		Prova aluno1Prova1 = new Prova();
		aluno1Prova1.notaParte1 = 4.0;
		aluno1Prova1.notaParte2 = 2.5;
		aluno1.prova1 = aluno1Prova1;
		
		Prova aluno1Prova2 = new Prova();
		aluno1Prova2.notaParte1 = 1.0;
		aluno1Prova2.notaParte2 = 7.0;
		aluno1.prova2 = aluno1Prova2;
		
		Prova aluno2Prova1 = new Prova();
		aluno2Prova1.notaParte1 = 6.5;
		aluno2Prova1.notaParte2 = 3.5;
		aluno2.prova1 = aluno2Prova1;
		
		Prova aluno2Prova2 = new Prova();
		aluno2Prova2.notaParte1 = 0.0;
		aluno2Prova2.notaParte2 = 3.0;
		aluno2.prova2 = aluno2Prova2;
		
		Prova aluno3Prova1 = new Prova();
		aluno3Prova1.notaParte1 = 5.0;
		aluno3Prova1.notaParte2 = 4.0;
		aluno3.prova1 = aluno3Prova1;
		
		Prova aluno3Prova2 = new Prova();
		aluno3Prova2.notaParte1 = 6.0;
		aluno3Prova2.notaParte2 = 1.5;
		aluno3.prova2 = aluno3Prova2;
		
		// Imprime a m�dia de cada aluno
		System.out.println("M�dia Aluno 1: " + turma.aluno1.calcularMedia());
		System.out.println("M�dia Aluno 2: " + turma.aluno2.calcularMedia());
		System.out.println("M�dia Aluno 3: " + turma.aluno3.calcularMedia());
		
		// Imprime a m�dia da turma
		System.out.println("M�dia Turma: " + turma.calcularMedia());
		
		
		// Aten��o:
		// Esta n�o � a �nica forma de resolver este exerc�cio. Voc� tamb�m pode instanciar os objetos
		// diretamente dentro de cada classe, nos atributos. Por exemplo:
		//
		// public class Aluno {
		//     Prova prova1 = new Prova();
		//     ...
		// }
	}
}
