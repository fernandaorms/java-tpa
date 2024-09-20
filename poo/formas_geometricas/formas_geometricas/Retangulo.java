package formas_geometricas;

public class Retangulo extends Forma {
	float x;
	float y;
	
	public Retangulo(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public void calcularArea() {
		area = x * y;
	}
}
