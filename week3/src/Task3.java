import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a;
        a = in.nextLine();
        Set<Character> str = new HashSet<>();
        for(int i=0;i<a.length();i++)
        {
            str.add(a.charAt(i));
        }
        System.out.println(str);
    }
}
