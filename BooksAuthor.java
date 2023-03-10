import java.util.*;
public class BooksAuthor 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter author name, age and place");
		AuthorDetails a1 = new AuthorDetails(sc.nextLine(),sc.nextInt(),sc.nextLine());
		System.out.println("Enter book  name, price and author object");
		Books b = new Books(sc.nextLine(),sc.nextInt(),a1);
		System.out.println(Books.name+" "+Books.price);
		System.out.println("--------------------------Author-----------------------");
		System.out.println();
		
	}
}
