import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        int temp=0,j;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='.')
            {
                temp=i;
            }
        }
        j=a.length()-temp-1;  //得出几位小数
        double f = Double.parseDouble(a);
        int fenZi = (int)(f*Math.pow(10,j));
        int fenMu = (int)(Math.pow(10,j));
        for(int i=2;i<Math.min(fenZi,fenMu);i++)
        {
            if(fenZi%i==0&&fenMu%i==0)
            {
                fenZi = fenZi/i;
                fenMu = fenMu/i;
            }
        }
        System.out.println(fenZi+"/"+fenMu);
    }
}
