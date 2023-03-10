public class Book 
{
	String name ;
	int price ;
	Author author;
	public Book(String name , int price, Author author){
		this.name = name;
		this.price = price;
		this.author = author;
	}//Book Constructor
	public static void main(String[] args) 
	{
		Author a1 = new Author("John",42,"India");
		Author a2 = new Author("Kingsley",23,"India");
		Book b1 = new Book("Java for beginers",800,a1);
		Book b2 = new Book("Java",900,a2);
		System.out.println("\nBook Name "+b1.name);
		System.out.println("Book Name "+b1.price);
		System.out.println("-----------------Author Details------------------");
		System.out.println("Author Name"+b1.author.authorName);
		System.out.println("Author age "+b1.author.age);
		System.out.println("Author Place "+b1.author.place);
		System.out.println();

		System.out.println("Book Name "+b2.name);
		System.out.println("Book Price "+b2.price);
		
		System.out.println("-----------------Author Details------------------");
		System.out.println("Author Name "+b2.author.authorName);
		System.out.println("Author age "+b2.author.age);
		System.out.println("Author Place "+b2.author.place);


	}//main()
}//Book
