import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Findnum Str = new Findnum();
        Scanner in = new Scanner(System.in);
        String a =in.nextLine();
        Str.Find(a);
    }

    public static class Findnum {
        public void Find(String a) {
            int len = a.length();
            for(int i=0;i<len-1;i++)
            {
                if(a.charAt(i)>='0'&&a.charAt(i)<='9')
                {
                    System.out.print(a.charAt(i));
                    if(a.charAt(i+1)>='0'&&a.charAt(i+1)<='9')
                        continue;
                    else
                        System.out.print(" ");
                }
            }
            if(a.charAt(len-1)>='0'&&a.charAt(len-1)<='9')
                System.out.print(a.charAt(len-1));
        }
    }
}
