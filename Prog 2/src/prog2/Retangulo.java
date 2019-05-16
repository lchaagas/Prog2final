package prog2;

public class Retangulo {
	private Ponto2D a;
	private Ponto2D b;

	
	public Retangulo() {
		this.a = new Ponto2D();
		this.b = new Ponto2D();
	}
	
	public Retangulo(Ponto2D a) {
		this.a = a;
		this.b = new Ponto2D();
		
	}
	
	public Retangulo(Ponto2D a, Ponto2D b) {
		this.a = a;
		this.b = b;		
	}
	
	public Retangulo(float a1, float a2, float b1, float b2) {
		this.a = new Ponto2D(a1, b1);
		this.b = new Ponto2D(a2, b2);
	}
	

	public void print() {
		System.out.println("Retangulo, pontos opostos:");
		a.print();
		b.print();
	}

}
