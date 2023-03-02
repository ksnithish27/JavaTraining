class staticOut 
{
	static int x;
	static int y;
	void add(int a, int b){
		x = a+b;
		y= x+b;
	}
}
class staticOutUse
{
	public static void main(String[] args) 
	{
		staticOut s1 = new staticOut();
		staticOut s2 = new staticOut();
		int a = 2;
		s1.add(a,a+1);
		s2.add(5,a);
		System.out.println(s1.x+ " "+s2.y);
	}
}
