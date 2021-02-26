import java.util.*;

public class Task7 {
    public static void main(String[] args) {
        String[] a = {"eat","tea","tan","ate","nat","bat"};
        Solution s = new Solution();
        System.out.println(s.group(a));
    }

    public static class Solution {
        public List<List<String>> group(String[] strs)
        {
            Map<String,List<String >> map = new HashMap<>();
            for (String str : strs) {
                char[] array = str.toCharArray();
                Arrays.sort(array);
                String key = new String(array);
                List<String> list = map.getOrDefault(key,new ArrayList<>());
                list.add(str);
                map.put(key,list);
            }
            return new ArrayList<>(map.values());
        }
    }
}
