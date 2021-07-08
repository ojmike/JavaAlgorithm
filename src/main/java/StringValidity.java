import java.util.HashMap;
import java.util.Map;

public class StringValidity {

    public static void main(String[] args) {


        System.out.println(unique("abcdef"));
    }

    public static boolean isValid(String word) {
        boolean flag = true;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length() - 1; j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    flag = false;
                }
            }
        }
        return flag;
    }

    public static boolean unique(String word) {
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (Character ch : word.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
                count++;
            } else {
                map.put(ch, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("Key " + entry.getKey() + " Value " + entry.getValue());

        }
        return count <= 1;
    }
}
