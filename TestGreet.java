// Greeting
public class TestGreet
{
	public static void greet2(){
		System.out.println("Hello");
	}
	public static void main(String[] args){
		Greet g = new Greet();
		g.greet();
		greet2();
	}
}
class Greet
{
	public void greet(){
		System.out.println("Hi");
	}
}