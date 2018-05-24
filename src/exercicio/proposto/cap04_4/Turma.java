package exercicio.proposto.cap04_4;

public class Turma {
	Aluno aluno1;
	Aluno aluno2;
	Aluno aluno3;
	
	double calcularMedia() {
		return (aluno1.calcularMedia() + aluno2.calcularMedia() + aluno3.calcularMedia()) / 3;
	}

}
