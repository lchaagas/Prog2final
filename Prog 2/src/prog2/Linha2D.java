package prog2;

public class Linha2D {
	private Ponto2D a;
	private Ponto2D b;

	
	public Linha2D() {
		this.a = new Ponto2D();
		this.b = new Ponto2D();
	}
	
	public Linha2D(Ponto2D a) {
		this.a = a;
		this.b = new Ponto2D();
		
	}
	
	public Linha2D(Ponto2D a, Ponto2D b) {
		this.a = a;
		this.b = b;		
	}
	
	public Linha2D(float a1, float a2, float b1, float b2) {
		this.a = new Ponto2D(a1, a2);
		this.b = new Ponto2D(b1, b2);
	}
	
	public void print() {
		System.out.println("Linha:");
		a.print();
		b.print();
	}
	
}
