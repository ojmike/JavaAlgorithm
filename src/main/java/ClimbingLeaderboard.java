import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClimbingLeaderboard {
    public static void main(String[] args) {
        List<Integer> ranked = new ArrayList<>();
        ranked.add(5);
        ranked.add(8);
        ranked.add(3);
        List<Integer> player = new ArrayList<>();
        player.add(5);
        player.add(8);
        player.add(3);
        climbingLeaderboard(ranked, player);
    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {

        int rankedlength = ranked.size();
        //Collections.sort(ranked);
        System.out.println(ranked);
        int[] rank = new int[rankedlength];
        List<Integer> rankedList = new ArrayList<>();
        rankedList.add(0);
        for (int i = 1; i < rankedlength; i++) {
            if (ranked.get(i) == ranked.get(i - 1)) {
                rank[i] = rank[i - 1];
            } else {
                rank[i] = rank[i - 1] + 1;
            }
        }
        System.out.println(Arrays.toString(rank));


        return rankedList;


    }
}
