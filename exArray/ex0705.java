package exArray;

import java.util.Scanner;
public class ex0705 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		int [] num1 = new int[10];
		int [] num2 = new int[10];
		int i,j,k=1;
		for(i = 0;i < 10;i++) {
			num1[i] = input.nextInt();
		}
		//System.out.print(num1[0]);//打引号变为输出num1[0]
		num2[0] = num1[0];
		//System.out.print(num2[0]);
		for(i = 1;i < 10;i++) {
			for(j = 0;j < 10;j++) {
				if(num1[i] == num2[j]) {
					break;
				}
			}
			if(j == 10) {
				num2[k++] = num1[i];
			}
		}
		System.out.println("The number of distinct number is "+ k);
		System.out.print("The distinct numbers are: ");
		for(j = 0;j < k ;j++) {
			System.out.print(num2[j] + " ");
		}
	}
}
