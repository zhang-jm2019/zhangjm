package exArray;

import java.util.Scanner;
//读取整数计算每个数出现的次数
public class ex0703 {
	public static void main(String[] args) {
		
		System.out.print("Enter the integers between 1 and 100: ");
		Scanner input = new Scanner(System.in);
		//int range = input.nextInt();
	    int [] number = new int[100];
		
		int i,j,k=0;
		
		for(i = 0;i < number.length;i++) {
			number[i] = input.nextInt();
			if(number[i] == 0) {
				break;
			}
		}
//		for(i = 0;i < number.length;i++) {
//			System.out.print(number[i]);
//		}
		for(i = 0;i < number.length;i++) {
			k = number[i];
		//	System.out.print(number[0]);
			int sum = 1;
			if(number[i] >= 1&&number[i] <= 100) {
				for(j = i+1;j < number.length;j++) {
					if(number[i] == number[j]) {
						sum++;
						number[j] = -1;//做标记
					}
				}
				System.out.println(k + " occors " + sum + " times ");
			}
		}
	
	}
}
