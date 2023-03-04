// a java program to create a point

public class Point1{
	private double x;
	private double y;
	public double getX(){
		return this.x;
	}//getY
	public double getY(){
		return this.y;
	}//getY 
	public Point1(){
		x=y=0;

	}//Point1Constructordefault
	public Point1(double x, double y){
		this.x = x;
		this.y=y;
	}//Point1Constructor parameterized
	public double distanceFromOrigin(){
		double distance = Math.sqrt((x*x)+(y*y));
		return distance;
	}//distanceFromOrigin()
	public double distanceFromPoint(Point1 Q){
		double diffX = x-Q.x;
		double diffY = y-Q.y;
		return Math.sqrt((diffX*diffX)+(diffY*diffY));
	}//distanceFromPoint
	public void translate(double xTrans, double yTrans){
		x=x+xTrans;
		y=y+yTrans;
	}//translate()
}//Point1
