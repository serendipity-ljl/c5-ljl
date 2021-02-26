import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入字符串:");
        String a = in.nextLine();
        int temp= 0;
        for(int i=0;i<a.length()/2;i++)
        {
            if(a.charAt(i)=='('&&a.charAt(a.length()-i-1)==')')
            {
                temp++;
            }
            if(a.charAt(i)=='['&&a.charAt(a.length()-i-1)==']')
            {
                temp++;
            }
            if(a.charAt(i)=='{'&&a.charAt(a.length()-i-1)=='}')
            {
                temp++;
            }
        }
        if(temp == a.length()/2)
        {
            System.out.println("true");
        }
        else
            System.out.println("false");
    }
}
