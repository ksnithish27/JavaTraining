class Animal1 
{
	void eat(){
		System.out.println("Eating....");
	}//eat()
}//Animal
class Dog extends Animal
{
	void bark(){
		System.out.println("Dog Barking.....");
	}//bark()
}//Dog
class Cat extends Animal
{
	void meow(){
		System.out.println("Cat Meowing.....");
	}//meow()
}//Animal
class TestInheritance3
{
	public static void main(String[] args) 
	{
		Cat c = new Cat();
		c.meow();
		c.eat();
		Dog d = new Dog();
		d.bark();
		d.eat();
	}//main()
}//TestInheritance3
