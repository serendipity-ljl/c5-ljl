import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入数组长度:");
        int len = in.nextInt();
        int[] str = new int[len];
        System.out.print("请输入数组:");
        for(int i =0;i<len;i++)
        {
            str[i] = in.nextInt();
        }
        System.out.print("请输入k:");
        int k = in.nextInt();
        Arrays.sort(str);
        System.out.println(str[k]);
    }
}
