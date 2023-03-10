class TestString2 
{
	public static void main(String[] args) 
	{
		//String s = "Sachien"+" Tendulkar";
		String s = (new StringBuilder()).append("Sachien").append(" Tendulkar").toString();
		System.out.println(s);
	}
}
