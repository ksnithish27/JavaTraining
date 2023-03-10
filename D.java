class C 
{
	public void dispC(){
		System.out.println("This method is of class C");
	}//disp()
}//C
class A extends C
{
	void dispA(){
		System.out.println("This is method of class A");
	}//disp()
}//A
class B extends C
{
	public void dispB(){
		System.out.println("This is the method of class B");
	}//disp()
}//B
public class D extends A
{
	public void dispD(){
		System.out.println("this is method of class D");
	}//disp()
	public static void main(String[] args) 
	{
		D obj = new D();
		obj.dispD();
		obj.dispA();
		obj.dispC();
		B b = new B();
		b.dispB();
		b.dispC();

	}
}
