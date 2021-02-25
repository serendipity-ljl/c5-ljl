import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        for(int i=0;i<string.length();i++)
        {
            int temp =0;
            for(int j=i+1;j<string.length();j++)
            {
                if(string.charAt(i)==string.charAt(j))
                {
                    break;
                }
                else
                {
                    temp++;
                }
            }
            if(temp==string.length()-i-1)
            {
                System.out.println("第一个不重复字符索引为:"+i);
                return;
            }
        }
    }
}
