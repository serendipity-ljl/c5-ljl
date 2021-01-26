import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        System.out.print("输入:");
        s=in.nextLine();
        int i;
        System.out.print("输出:");
        for(i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(s.length()-1-i));
        }
    }
}
