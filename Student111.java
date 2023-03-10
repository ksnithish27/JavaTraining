import java.util.*;
class Student111 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of students");
		int n = sc.nextInt();
		int rollno []=new int[n];
		int s1 [] = new int[n];
		int s2 [] = new int[n];
		int s3 [] = new int[n];
		double [] total = new double[n];
		double [] avg = new double[n];
		for(int i = 0;i<n;i++){
			System.out.println("enter the student "+(i+1)+"details");
			System.out.println("rollno");
			rollno[i] = sc.nextInt();
			System.out.println("Subject 1 marks");
			s1[i]=sc.nextInt();
			System.out.println("Subject 2 marks");
			s2[i]=sc.nextInt();
			System.out.println("subject 3 marks");
			s3[i]=sc.nextInt();
			total[i]=(s1[i]+s2[i]+s3[i]);
			avg[i]=(total[i]/3.0);
		}//for
		System.out.println("Rollnum\t total \t avg");
		for(int i = 0;i<n;i++){
			System.out.println(rollno[i]+"\t"+total[i]+"\t"+avg[i]);
		}//for
	}//main
}//student
