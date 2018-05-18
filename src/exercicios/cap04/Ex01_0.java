package exercicios.cap04;

public class Ex01_0 {
	
	public static void main(String[] args) {
		
		Relogio relogio01 = new Relogio();
		
		relogio01.acertarRelogio(10, 10, 5);
		
		relogio01.acertarRelogio(10, 55, 5);
		
		int min = relogio01.lerMinuto();
		
		System.out.println(min);
		
			
	}

}
