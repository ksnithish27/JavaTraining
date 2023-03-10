class Employee
{
	float salary = 40000;
}//Employee
public class Programmer extends Employee
{
	int bonus = 10000;
	public static void main(String[] args){
		Programmer p = new Programmer();
		System.out.println("Programmer's salary is "+p.salary);
		System.out.println("Programmer's bonus is "+p.bonus);
	}//main
}//Programmer