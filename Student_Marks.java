/*
Student Marks System (Safe Input)

Create a program that:

Stores 5 student marks in an array
Takes index input from user
Displays mark
Add Exception Handling:
Handle invalid index
Handle invalid input (if user enters text instead of number)
*/
package java_internship_day10;
import java.util.Scanner;
public class Student_mark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,i,ind;
		System.out.println("Enter the number of students :");
		n=sc.nextInt();
		int []marks= new int [n];
		System.out.println("Enter the marks:");
		for(i=0;i<n;i++) {
			marks[i]=sc.nextInt();
		}
		
		try {
			System.out.println("Enter the index");
			ind = sc.nextInt();
			
			 System.out.println("Mark = " + marks[ind]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index !!");
		}
		catch(Exception err) {
			System.out.println("Invalid Input");
		}
		sc.close();
	}

}
