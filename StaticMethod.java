public class StaticMethod 
{
	static void myStaticMethod(){
		System.out.println("Static methods can also be called without creating the object");
	}
	public void myPublicMethod(){
		System.out.println("Non static methods cant be created with out objects");
	}
	public static void main(String[] args) 
	{
		myStaticMethod();
		StaticMethod sm = new StaticMethod();
		sm.myPublicMethod();
	}
}
