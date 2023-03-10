public class CompareString4
{
	public static void main(String[] args) 
	{
		String s1 = "Sachein";
		String s2 = "Sachein";
		String s3 = new String("Sachein"); 
		String s4 = "Samar";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
	}
}
