import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("输入整数数组元素个数:");
        int a = in.nextInt();
        int[] shuZu = new int[a];
        System.out.print("输入数组:");
        for(int i=0;i<a;i++)
        {
            shuZu[i] = in.nextInt();
        }
        for(int i=0;i<shuZu.length;i++)
        {
            int temp = 0;
            for(int j =0;j<shuZu.length;j++)
            {
                if(shuZu[i] == shuZu[j])
                {
                    temp++;
                }
            }
            if(temp>shuZu.length/2)
            {
                System.out.println(shuZu[i]);
                break;
            }
        }
    }
}
