import java.util.Arrays;
import java.util.Collections;

public class descending_String {

    public static void main(String[] args) {
        Solution_d s = new Solution_d();
        System.out.print(s.solution("Zbcdefg"));

        for (int i = 0; i < args.length; i++) {

        }

    }

}
class Solution_d{
    public String solution(String s) {
        Character [] arr = new Character[s.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.charAt(i);
        }

        Arrays.sort(arr, Collections.reverseOrder());
        s = "";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }

        return s;
    }
}