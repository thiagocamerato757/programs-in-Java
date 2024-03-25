package Ex03_1;

public class Vetor{
	private double x;
	private double y;
	
	public Vetor(double a){
		x = 0.0;
		y = 0.0;
	}
	public Vetor(double b, double c){
		x = b;
		y = c;
	}
	
	public void exibe() {
	    System.out.println("x = " + x + ", y = " + y);
	}
	
	public static Vetor soma(Vetor v1, Vetor v2) {
		double somaX;
		double somaY;
		Vetor vv;
		vv = new Vetor(0.0);
		somaX = v1.x + v2.x;
		somaY = v1.y + v2.y;
		vv.x = somaX;
		vv.y = somaY;
		return vv;
	}
}