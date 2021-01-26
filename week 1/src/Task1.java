import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float height,weight,bmi;
        System.out.print("输入体重(kg):");
        weight = in.nextFloat();
        System.out.print("输入身高(m):");
        height = in.nextFloat();
        bmi=weight/(height*height);
        if(bmi<18.5)
        {
            System.out.println("过轻");
        }
        else if(bmi>=18.5&&bmi<=25)
        {
            System.out.println("正常");
        }
        else if(bmi>25&&bmi<28)
        {
            System.out.println("过重");
        }
        else if(bmi>=28&&bmi<=32)
        {
            System.out.println("肥胖");
        }
        else
            System.out.println("非常肥胖");
    }
}
