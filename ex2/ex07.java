package ex2;

//SalesTax.java
import java.util.Scanner;
public class ex07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter purchase amout: ");
		double purchaseAmount = input.nextDouble();
		
		double tax = purchaseAmount * 0.06;
		System.out.println("Sales tax is " + (int)(tax * 100) / 100.0);
	}

}
