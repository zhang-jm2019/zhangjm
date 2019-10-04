package ex1;

//逻辑错误
//ShowLogicErrors.java
public class ex06 {
	public static void main(String[] args) {
		System.out.print("Celsius 35 is Fahrenheit degree ");
		System.out.println((9 / 5) * 35 + 32);
	}
}
//正确结果应为95.0，
//java中整数相除是返回除法的整数部分，应用9.0/5

