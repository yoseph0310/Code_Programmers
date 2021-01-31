
public class stringCheck {
    public static void main (String[]args){
        Solution s = new Solution();
        System.out.println(s.solution("1234"));
        System.out.println(s.solution("a123"));
        System.out.println(s.solution("a1234"));
        System.out.println(s.solution("a12356"));
        System.out.println(s.solution("12345!"));
    }
}
// 정규식 사용
class Solution {
    public boolean solution(String s){
        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
        return false;
    }
}
// 아스키코드 비교 사용
class Solution2 {
    public boolean solution(String s) {
        if(!(s.length() == 4 || s.length() == 6)) return false;
        for(int i=0; i<s.length(); i++) {
            if (!((int) s.charAt(i) >= 48 && (int) s.charAt(i) <= 57)) return false;
        }
        return true;
    }
}
// try catch사용 오류는 false 리턴
class Solution3 {
    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6){
            try{
                int x = Integer.parseInt(s);
                return true;
            } catch(NumberFormatException e){
                return false;
            }
        }
        else return false;
    }
}
