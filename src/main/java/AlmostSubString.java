public class AlmostSubString {

    public static int almostSubstring(String t, String s){
        int count =0;
        for(int i =0; i < t.length()-4; i++){
            String construct = String.valueOf(t.charAt(i)+"" + t.charAt(i+2)+""+t.charAt(i+4));
            if(construct.equals(s)){
                count++;
            }
        }
        return  count;
    }
}
