package formas_geometricas;

public class Main {

	public static void main(String[] args) {
		Retangulo r1 = new Retangulo(5,3);
		r1.calcularArea();
		
		System.out.println("A(Retangulo) = " + r1.area);
		
		
		Quadrado q1 = new Quadrado(5);
		q1.calcularArea();
		
		System.out.println("A(Quadrado) = " + q1.area);
		
		
		Circulo c1 = new Circulo(6);
		c1.calcularArea();
		
		System.out.println("A(Circulo) = " + c1.area);
	}

}
