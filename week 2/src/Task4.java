import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Game S = new Game();
        S.Guess();
    }
    public static class Game {
        private int v=100;
        int a;
        Scanner in = new Scanner(System.in);
        public void Guess()
        {
            do{
                a=in.nextInt();
                if(a<v)
                    System.out.println("猜的有点小，再试一下吧!");
                else if(a>v)
                    System.out.println("猜大了噢，再试一下吧!");
            }while(a!=v);
            System.out.println("恭喜你，猜对了!");
        }
    }
}
