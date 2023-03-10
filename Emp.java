public class Emp
{
	int id ;
	String name;
	Address address;
	public Emp(int id, String name, Address address){
		this.id = id;
		this.name = name;
		this.address = address;
	}//Emp constructor
	public void display(){
		System.out.println(id+" "+name);
		System.out.println(address.city +" "+address.state+" "+address.country);
	}//display()
	public static void main(String[] args) 
	{
		Address ad1 = new Address("Chennai", "Tamil Nadu","India");
		Address ad2 = new Address("Palamner","Andhra Pradesh","India");
		Address ad3 = new Address("Banglore","Karnataka","India");
		Emp e1 = new Emp(111,"Nithish",ad1);
		Emp e2 = new Emp(999,"Nithish KS",ad2);
		Emp e3 = new Emp(777,"Nithish RKS",ad3);
		e1.display();
		e2.display();
		e3.display();

	}//main()
}
