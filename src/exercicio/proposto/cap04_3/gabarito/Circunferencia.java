package exercicio.proposto.cap04_3.gabarito;

public class Circunferencia {

	// Raio da circunfer�ncia
	double raio;
	
	double calcularArea() {
		//Math.PI � a constante que representa o PI (3,14159265...)
		double area = Math.PI * raio * raio;
		return area;
	}
}
