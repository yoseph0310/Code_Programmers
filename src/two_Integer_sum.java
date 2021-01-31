import java.util.Scanner;

public class two_Integer_sum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Sol s = new Sol();

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(s.solution(a,b));
    }
}

class Sol {
    public long solution(int a, int b) {
        long answer = 0;

        if ( a == b) answer = a;

        if ( a<b ){
            while ( true ){
                answer += a;
                if ( a==b ) break;
                a++;
            }
        }

        if ( a>b ){
            while ( true ){
                answer += b;
                if ( a==b ) break;
                b++;
            }
        }

        return answer;
    }
}
