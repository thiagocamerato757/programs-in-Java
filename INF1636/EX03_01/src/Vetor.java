public class Vetor {
    private double x;
    private double y;

    public Vetor(double x,double y){
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void soma(Vetor A){
        this.setX(this.getX()+A.getX());
        this.setY(this.getY()+A.getY());
    }

    public static Vetor soma(Vetor A, Vetor B){
        Vetor v3 = new Vetor(0.0,0.0);
        v3.setX(A.getX()+B.getX());
        v3.setY(A.getY()+B.getY());
        return v3;
    }

    public void exibe(){
        System.out.printf("x=%5.2f y=%5.2f \n", x, y);
    }
}
