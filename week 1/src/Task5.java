import java.util.Scanner;

public class Task5 {
    static class Circle {
        int radius;
        double area;
        double perimeter;
        public Circle(int radius)
        {
            this.radius=radius;
            this.area=Math.PI*this.radius*this.radius;
            this.perimeter=Math.PI*2*this.radius;
        }
        void show()
        {
            System.out.printf("the area is %.2f\n",area);
            System.out.printf("the perimeter is %.2f",perimeter);
        }
    }

    public static void main(String[] args) {
        Scanner yuan = new Scanner(System.in);
        Circle a;
        a = new Circle(yuan.nextInt());
        a.show();
    }
}
