/*
Banking System (Real-world Simulation)

Create a program that:

Takes account balance
Takes withdrawal amount
Rules:
If withdrawal > balance → throw and handle exception
If invalid input → handle exception
Output:
Withdrawal successful OR Insufficient balance
*/
package java_internship_day10;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Banking_system {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int balance,withdrawl;
		try {
			System.out.println("Enter the balance :");
			balance=sc.nextInt();
			System.out.println("Enter the withdrawl amount :");
			withdrawl=sc.nextInt();
			
			if(withdrawl > balance ) {
				throw new Exception("In sufficent balance");
			}
			System.out.println("Withdrawl sucess !");
			System.out.println("Remaining balance :"+ (balance-withdrawl));
		}
		catch(InputMismatchException e) {
			System.out.println("In valid input");
		}
		catch(Exception e) {
			System.out.println("In sufficent balance");
		}
		sc.close();
	}

}
