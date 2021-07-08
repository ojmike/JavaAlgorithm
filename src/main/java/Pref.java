import java.util.ArrayList;
import java.util.List;

public class Pref {

    public static boolean pref(String[] a, String[] b){
        List<String> str = new ArrayList();
        String initStr = "";
        for (String data: a) {
            initStr += data;
            str.add(initStr);
        }
        for (String ch: b) {
            if(!str.contains(ch)) return false;
        }
        return  true;
    }
}
