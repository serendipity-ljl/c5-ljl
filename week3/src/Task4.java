import java.util.HashMap;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : a.toCharArray()) {
            if (map.containsKey(c)) {
                Integer value = map.get(c);
                value++;
                map.put(c, value);
            } else {
                map.put(c, 1);
            }
        }
        for (Character key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + ":" + value);
        }
    }
}
