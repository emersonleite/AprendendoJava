package exercicio.proposto.cap04_3.gabarito;

public class Trapezio {

	// Altura
	double altura;
	
	// Base maior
	double baseMaior;
	
	// Base menor
	double baseMenor;

	double calcularArea() {
		double area = ((baseMaior + baseMenor) / 2) * altura;
		return area;
	}
}
