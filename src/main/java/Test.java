import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Counter c;
        Counter d = new Counter();
        c = new Counter();
        d = c;
        int a =4;
        int b = 5;
        a = b;
        Integer  e = 19;
        System.out.println(a);
        arrayList();
    }


    public static int arrayList(){
        List<Integer>  testList = new ArrayList<>();
        testList.add(0,5);
        testList.add(1,10);
        testList.add(0,20);
        testList.add(1,15);
        String name = "Shade";


        System.out.println(testList);

        List<String> givenList = Arrays.asList("a", "bb", "ccc", "dd");
        List<String> result = givenList.stream()
                .collect(Collectors.toList());

        return 2;
    }
}