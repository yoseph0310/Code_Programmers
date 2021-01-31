public class pyCount {
    public static void main(String[]args){
        Solution_py sp = new Solution_py();

        System.out.println(sp.solution("pppYYYp"));
    }

}

//
class Solution_py{
    boolean solution(String s) {
        s = s.toUpperCase();

        /**
         * chars() : CharSequence 인터페이스로부터 파생한 String 클래스의 새로운 메소드
         * filter
         * lambda
         */
        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }
}
// 내 코드
class Solution_py2 {
    boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;
        char ch = ' ';

        for (int i =0; i<s.length(); i++){
            ch = s.charAt(i);
            if (ch == 'p' || ch == 'P')
                cnt++;
            else if ( ch == 'y' || ch == 'Y')
                cnt--;
        }

        if ( cnt != 0)
            return false;
        return true;
    }
}
