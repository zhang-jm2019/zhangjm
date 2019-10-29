package exArray;

//ц╟ещеепР
import java.util.Scanner;
public class ex0718 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		int [] num = new int[10];
	
		int i,j,temp;
		
		for( i = 0;i < 10;i++) {
			num[i] = input.nextInt();
		}
		for(i = 0;i < 10-1;i++) {
			for(j = 0;j < 10-1-i;j++) {
				if(num[j] > num[j+1]) {
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		for(i = 0;i < 10;i++) {
			System.out.print(num[i] + " ");
		}
	}
}
