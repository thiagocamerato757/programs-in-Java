package EX04_2;

public class Vetor{
	private double x,y;
	
	public Vetor(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	private Vetor(){
		
	}
	
	public Vetor Clone(){
		return new Vetor(x,y);		
	}
	
	public String toString() {
	    return String.format("(%.2f,%.2f)\n", x, y);
	}
	
}	

