// static keyword 
import java.util.Scanner;
 class Student2 
{
	int rollno;
	String name ;
	static String college = "INS";
	public Student2(int rollno,String name){
		this.rollno =rollno;
		this.name = name;
	}
	static void change(){
		college = "Mtca";
	}
	void display(){
		System.out.println("\n"+rollno+" " +name+" "+college);
	}
}
public class TestStaticVariable2
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Student2.change();
		
		Student2 s1 = new Student2(sc.nextInt(),sc.next());
		Student2 s2 = new Student2(sc.nextInt(),sc.next());
		Student2 s3 = new Student2(sc.nextInt(),sc.next());
		
		s1.display();
		s2.display();
		s3.display();
	}
}

