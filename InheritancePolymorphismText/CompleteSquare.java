import java.util.Scanner;
//import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;


public class CompleteSquare
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer m: ");
        int m = input.nextInt();
        int n = findN(m);
        System.out.println("The smallest number n for m * n to be a perfect sqare is " + n);
        System.out.println("m * n is " + (m * n));
    }

    public static int findN(int m)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int temp = m;

        while (temp != 1)
        {
            for (int i = 2; i <= temp; i++)
            {
                if (temp % i == 0)//找到所有的因子
                {
                    temp /= i;
                    list.add(i);
                    break;
                }
            }
        }

        //找到最大值创建数组，统计因子出现次数
        int max = Collections.max(list);
        int[] count = new int[max + 1];
        for (int number : list)
        {
            count[number]++;
        }

        //System.out.println(Arrays.toString(count));

        int n = 1;
        for (int i = 0; i < max + 1; i++)
        {
            if (count[i] % 2 == 1)
            {
                n *= i;
                //System.out.println(i);
            }
        }
        //System.out.println(n);

        return n;
    }
}
