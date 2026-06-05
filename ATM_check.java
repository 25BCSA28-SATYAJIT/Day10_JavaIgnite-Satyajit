/*
ATM Multi-Level Exception System

Create a program that simulates ATM withdrawal.

Requirements:
Take balance and withdrawal amount
If withdrawal > balance → handle exception
If withdrawal amount is negative → handle exception
If input is invalid (text instead of number) → handle exception
Expected Output:
Transaction Successful / Insufficient Balance / Invalid Input
*/
package java_internship_day10;
import java.util.Scanner;
public class ATM_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int balance,withdrawl,remain;
		try {
			System.out.println("Enter the balance :");
			balance=sc.nextInt();
			System.out.println("Enter the withdrawl amount :");
			withdrawl=sc.nextInt();
			if(withdrawl > balance )
				System.out.println("In valid input");
			if(withdrawl < 0 )
				System.out.println("Withdrawl amount cant be negative");
			remain = balance-withdrawl;
			System.out.println("Withdraw Sucessfully \n Remaining Balance : "+ remain);
		}
		catch(Exception e) {
			System.out.println("INVALID INPUT...PLZ ENTER A VALID NUMBER");
		}
		sc.close();
	}

}
