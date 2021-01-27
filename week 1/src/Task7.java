import java.util.Scanner;

public class Task7 {
    static class fushu {
        int a,b,c,d;
        public void Add()
        {
            System.out.println("两复数相加的结果为:"+(a+c)+"+"+(b+d)+"i");
        }
        public void Reduce()
        {
            if((b-d)!=1)
            System.out.println("两复数相减的结果为:"+(a-c)+"+"+(b-d)+"i");
            else
                System.out.println("两复数相减的结果为:"+(a-c)+"+"+"i");
        }
        public void multiply()
        {
            System.out.println("两复数相乘的结果为:"+(a*c-b*d)+"+"+(a*d+b*c)+"i");
        }
    }

    public static void main(String[] args) {
        fushu check = new fushu();
        Scanner a = new Scanner(System.in);
        check.a=a.nextInt();
        Scanner b = new Scanner(System.in);
        check.b=b.nextInt();
        Scanner c = new Scanner(System.in);
        check.c=c.nextInt();
        Scanner d = new Scanner(System.in);
        check.d=d.nextInt();
        check.Add();
        check.Reduce();
        check.multiply();
    }
}
