import java.util.ArrayList;
//ArrayList is a dynamic array whose capacity can grow dynamically
import java.util.Scanner;

public class AdditiveTest
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        //Generate random number
        int number1 = (int)(Math.random() * 9 + 1);
        int number2 = (int)(Math.random() * 9 + 1);

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        //create ArrayList:ArrayList<String> arr_list = new ArrayList<String>();
        ArrayList<Integer> answerList = new ArrayList<>();
        while (answer != (number1 + number2))
        {
            if (answerList.contains(answer))
            	//判断其中是否包含之前输入的
            {
                System.out.println("You already enter " + answer);
            }
            else
            	//使用add()方法来向创建的arraylist中添加元素，添加元素会自动添加到列表的末尾
                answerList.add(answer);

            System.out.print("Wrong answer. Try again. What is " +
                number1 + " + " + number2 + "? "); 
            answer = input.nextInt();
        }

        System.out.println("You got it.");
    }
}

