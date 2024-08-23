package formas_geometricas;

public class Circulo extends Forma {
	float raio;
	
	public Circulo(float raio) {
		this.raio = raio;
	}
	
	public void calcularArea() {
		area = (float) (Math.PI * Math.pow(raio, 2));
	}
}
