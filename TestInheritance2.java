class Inheritance3 
{
	void eat(){
		System.out.println("Eating..");
	}//eat()
}//Inheritance3
	class Dog extends Inheritance3
	{
		void bark(){
			System.out.println("Barking");
		}//bark()
	}//Dog
	class BabyDog extends Dog
	{
		void weep(){
			System.out.println("Weeping..");
		}//weep()
	}//BabyDog
	public class TestInheritance2
	{

	public static void main(String[] args) 
	{
		BabyDog d = new BabyDog();
		d.weep();
		d.bark();
		d.eat();
	}//main()
}//TestInheritance2
