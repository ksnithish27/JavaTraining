public class Employee 
{
	int id;
	String name;
	Address1 address;
	public Employee(int id, String name, Address1 address){
		this.id =id;
		this.name = name;
		this.address = address;
	}//Constructor
	void disp(){
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}//disp()
}//Employee
