package exercicio.proposto.cap04_3;

public class Aplicacao {

	public static void main(String[] args) {
		
		double baseT = 10.0;
		double alturaT = 20.0;
		double ladoQ = 12.0;
		double raio = 10.0;
		double areaT;
		double areaQ;
		double areaC;
		double BT = 10;
		double bT = 5;
		double areaTrap;
		double alturaTrap = 5;
		
		// Instanciando um triangulo
		Triangulo tri01 = new Triangulo();
		tri01.b = baseT;
		tri01.h = alturaT;
		areaT = tri01.calcularArea();
		System.out.println(areaT);
		
		//Instanciando um quadrado
		Quadrado qua01 = new Quadrado();
		qua01.l = ladoQ;
		areaQ = qua01.calcularArea();
		System.out.println(areaQ);
		
		//Instanciando a circunferencia
		Circunferencia cir01 = new Circunferencia();
		cir01.r = raio;
		areaC = cir01.calcularArea();
		System.out.println(areaC);
		
		//Instanciando um trapezio
		Trapezio Tra01 = new Trapezio();
		Tra01.b = bT;
		Tra01.B = BT;
		Tra01.h = alturaTrap;
		areaTrap = Tra01.calcularArea();
		System.out.println(areaTrap);
		
		
		
		
		
		
		

	}

}
