package exArray;

import java.util.Scanner;
public class ex0731 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list1: ");
		int i=0,j=0,k=0;
		int num1 = input.nextInt();
		int[] list1 = new int[num1]; 
		for(i = 0;i < num1;i++) {
			list1[i] = input.nextInt();
		}
		System.out.print("Enter list2: ");
		int num2 = input.nextInt();
		int[] list2 = new int[num2]; 
		for(i = 0;i < num2;i++) {
			list2[i] = input.nextInt();
		}
		
		int[] list3 = new int[num1+num2];
		i = 0;
		while(i < num1 && j < num2) {
			if(list1[i] <= list2[j]) {
				list3[k] = list1[i];
				++i;
			}else {
				list3[k] = list2[j];
				++j;
			}
			++k;
		}
		while(i < num1) {
				list3[k] = list1[i];
				i++;
				++k;
		}
		while(j < num2) {
				list3[k] = list2[j];
				j++;
				++k;
		}
		System.out.print("The merged list is ");
		for(k = 0;k < (num1+num2);k++) {
			System.out.print(list3[k] + " ");
		}
	}
}
