package exArray;

import java.util.Scanner;
public class ex0717 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input the number of the students: ");
		int num =input.nextInt();
		String[] name = new String[num];
		int[] grade =new int[num];
		int[] a = new int[num];
		int i,j;
		int temp,ret;
		
		System.out.print("Input the name and grade of students: ");	
		for(i = 0;i < num;i++) {
			a[i] = i;
			name[i] = input.next();
			grade[i] = input.nextInt();
		}
		for(i = 0;i < num -1;i++) {
			for(j = 0;j < num - 1 - i;j++) {
				if(grade[j] < grade[j+1]) {
					temp = grade[j];
					grade[j] = grade[j+1];
					grade[j+1] = temp;
					
					ret = a[j];
					a[j] = a[j+1];
					a[j+1] = ret;
				}
			}
		}
		System.out.print("Ranking by achievement from high to low: ");
		for(i = 0; i < num;i++) {
			System.out.print(name[a[i]] + " ");
		}
	}
}
