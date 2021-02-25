import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("输入原字符串:");
        String string = in.nextLine();
        System.out.print("输入子串:");
        String pattern = in.nextLine();
        int i = 0,tem =0,temp = 0;
        for(i=0;i<string.length();i++)
        {
            if(string.charAt(i)==pattern.charAt(0))
            {
                temp = i;
            }
        }
        for(int q = 0;q<pattern.length();q++)
        {
            if(string.charAt(q+temp)==pattern.charAt(q))
            {
                tem++;
            }
        }
        if(tem==pattern.length())
        {
            System.out.println("首次出现位置:"+temp);
        }
        else
            System.out.println(-1);
    }
}
