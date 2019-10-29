package exArray;

import java.util.Scanner;
public class ex0734 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a string: ");
		String s = input.next();
		sort(s);
	}
	
	public static String sort(String s) {
		char[] str = new char[100];
			str = s.toCharArray(); // change string to char array
			int i,j,k;
			for(i = 0;i < str.length;i++) {
				for(j = 0;j < str.length - i - 1;j++) {
					if(s.charAt(j) > s.charAt(j+1)) {//charAt方法返回指定索引处的字符
						char temp= str[j];
						str[j] = str[j + 1];
						str[j + 1] = temp;
					}
				}
			}
			System.out.print("After sort: ");
			for(k = 0;k < str.length;k++) {
					System.out.print(str[k]);
			}
				s = String.valueOf(str);// 将 boolean 变量 b 转换成字符串 
				return s;
			}

}
