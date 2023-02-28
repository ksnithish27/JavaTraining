//before JDK1.6 the execution can happen without main()
class A3 
{
	static{
		System.out.println("Static block is invoked");
		System.exit(0);
	}
}
