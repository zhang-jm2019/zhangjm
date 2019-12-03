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
            	//�ж������Ƿ����֮ǰ�����
            {
                System.out.println("You already enter " + answer);
            }
            else
            	//ʹ��add()�������򴴽���arraylist�����Ԫ�أ����Ԫ�ػ��Զ���ӵ��б��ĩβ
                answerList.add(answer);

            System.out.print("Wrong answer. Try again. What is " +
                number1 + " + " + number2 + "? "); 
            answer = input.nextInt();
        }

        System.out.println("You got it.");
    }
}

