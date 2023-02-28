class Patterns1 
{
	static void printPatternOnerow(char ch,int nc){
		for(int i =0;i<=nc;i++){
			System.out.print(ch);
		}
		System.out.println();
	}
	static void printPattern(int nr, char ch){
		for(int i = 0;i<=nr;i++){
			printPatternOnerow(ch,i);
		}
	}
	public static void main(String[] args) 
	{
		printPattern(4,'$');
	}
}
