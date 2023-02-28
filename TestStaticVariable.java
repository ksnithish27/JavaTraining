// static keyword 
import java.util.Scanner;
 class Student1 
{
	int rollno;
	String name ;
	static String college = "INS";
	public Student1(int rollno,String name){
		this.rollno =rollno;
		this.name = name;
	}
	void display(){
		System.out.println("\n"+rollno+" " +name+" "+college);
	}
}
public class TestStaticVariable
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Student1 s1 = new Student1(sc.nextInt(),sc.next());
		Student1 s2 = new Student1(sc.nextInt(),sc.next());
		Student1.college = "Mtca";
		s1.display();
		s2.display();
	}
}

