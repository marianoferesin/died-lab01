package died.lab01.problema01;

public class Recta {
	private Punto p1;
	private Punto p2;
	
	public Recta() {
		this.p1 = new Punto((float)0,(float)0);
		this.p2 = new Punto((float)1,(float)1);
	}

	public Recta(Punto p1, Punto p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public float pendiente() {
		return (this.p2.getY()-this.p1.getY())/(this.p2.getX()-this.p1.getX());
	}
	
	public boolean equals(Recta r) {
		if(this.p1.equals(r.p1) && this.p2.equals(r.p2)) return true;
		if(this.p1.equals(r.p2) && this.p2.equals(r.p1)) return true;
		
		Punto p3 = this.p1, p4;
		
		if(this.p1.equals(r.p1)) p4 = r.p2;
		else p4 = r.p1;
		
		Recta r2 = new Recta(p3,p4);
		
		return this.pendiente() == r2.pendiente();
	}
}
