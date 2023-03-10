import java.util.*;
class EmpTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the city state and countrey of the employee");
		Address1 a1 = new Address1(sc.nextLine(),sc.nextLine(),sc.nextLine());
		System.out.println("Enter the id name and address whchich has to be linke to the emp");
		Employee e1 = new Employee(sc.nextInt(),sc.next(),a1);

		e1.disp();
		
	}
}
