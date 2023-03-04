import java.util.*;
public class TriangleDemo {
	Point1 P;
	Point1 Q;
	Point1 R;
	public Point1 getP(){
		return this.P;
	}//getP()
	public Point1 getQ(){
		return this.Q;
	}//getQ()
	public Point1 getR(){
		return this.R;
	}//getR()
	public TriangleDemo(Point1 A, Point1 B, Point1 C){
		this.P = new Point1(A.x,A.y);
		this.Q = new Point1(B.x,B.y);
		this.R = new Point1(C.x,C.y);
	}//TriangleDemo Constructor
	public TriangleDemo(double x1, double y1, double x2, double y2,double x3,double y3){
		this.P = new Point1(x1,y1);
		this.Q = new Point1(x2,y2);
		rhis.R = new Point1(x3,y3);
	}//TriangleDemo Constructor
	public double Perimeter(){
		double perimeter;
		perimeter = this.P;
}//TriangleDemo
}