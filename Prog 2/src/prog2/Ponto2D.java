package prog2;

public class Ponto2D {
	private float x;
	private float y;
	
	public Ponto2D() {
		this.x = 0;
		this.y = 0;		
	}
	
	public Ponto2D(float x, float y) {
		this.x = x;
		this.y = y;		
	}
	
	public void print() {
		System.out.println("Ponto  X: "+this.x+" Y: "+this.y);
	}

}
