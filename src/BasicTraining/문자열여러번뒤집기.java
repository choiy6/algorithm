package BasicTraining;
import java.util.*;
//문제 설명
//문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다. queries의 원소는 [s, e] 형태로,
// my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다.
// my_string에 queries의 명령을 순서대로 처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.
//
//제한사항
//my_string은 영소문자로만 이루어져 있습니다.
//1 ≤ my_string의 길이 ≤ 1,000
//queries의 원소는 [s, e]의 형태로 0 ≤ s ≤ e < my_string의 길이를 만족합니다.
//1 ≤ queries의 길이 ≤ 1,000
//입출력 예
//my_string	queries	result
//"rermgorpsam"	[[2, 3], [0, 7], [5, 9], [6, 10]]	"programmers"
//입출력 예 설명
//예제 1번의 my_string은 "rermgorpsam"이고 주어진 queries를 순서대로 처리하면 다음과 같습니다.
//
//queries	my_string
//"rermgorpsam"
//[2, 3]	"remrgorpsam"
//[0, 7]	"progrmersam"
//[5, 9]	"prograsremm"
//[6, 10]	"programmers"
//따라서 "programmers"를 return 합니다.
public class 문자열여러번뒤집기 {
    public static void main(String[] args){
        문자열여러번뒤집기 sl = new 문자열여러번뒤집기();
        String my_string = "rermgorpsam";
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        String result = sl.solution(my_string, queries);
        System.out.println(result);
    }

    public String solution(String my_string, int[][] queries) {

        for(int[] query : queries) {
            int s = query[0];
            int e = query[1];
            String re = "";
            for(int i = e; i >= s; i--) {
                re += my_string.charAt(i);
            }
            String p = my_string.substring(0, s);
            String b = my_string.substring(e+1);

            my_string = p + re + b;
        }

        return my_string;
    }
}
