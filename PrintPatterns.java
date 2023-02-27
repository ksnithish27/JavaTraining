public class PrintPatterns
{
	public static void printPattern(char ch, int n){
		for(int i = 1;i<=n;i++){
			System.out.print(ch);
		}
		
	}
	public static void main(String[] args){
		printPattern('#',1);
		printPattern('#',2);
		printPattern('#',3);
		printPattern('#',4);
		printPattern('#',5);
		
	}
}