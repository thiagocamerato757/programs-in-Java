import java.lang.Math;
public class Vetor {
    private double x;
    private double y;

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }

    public double modulo(Vetor this){
        return Math.sqrt((Math.pow(this.getX(),2) + Math.pow(this.getY(),2)));
    }

}
