import java.util.*;
class TestIsNumber 
{
	static boolean isNumber(String str){
		for(int i = 0;i<str.length();i++){
			if(Character.isDigit(str.charAt(i))==false){
				return false;
			}//if
		}
		return true;
	}//isNumber()
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if(isNumber(str)){
			System.out.println("Integer");
		}//if
		else {
			System.out.println("String");
		}//else()
	}//main()
}//Test