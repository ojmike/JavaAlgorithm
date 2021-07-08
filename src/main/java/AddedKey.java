import java.util.HashMap;
import java.util.Map;

public class AddedKey {

    public static void addedKey(String s, String t) {
        String value = null;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }
        for (int i = 0; i < t.length(); i++) {
            if (!(map.containsKey(t.charAt(i)))) {
                value = t.charAt(i) + "";
            }
        }

    }
}
