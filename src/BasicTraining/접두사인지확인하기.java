package BasicTraining;
import java.util.*;
//문제 설명
//어떤 문자열에 대해서 접두사는 특정 인덱스까지의 문자열을 의미합니다. 예를 들어, "banana"의 모든 접두사는 "b", "ba", "ban", "bana", "banan", "banana"입니다.
//문자열 my_string과 is_prefix가 주어질 때, is_prefix가 my_string의 접두사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.
//
//제한사항
//1 ≤ my_string의 길이 ≤ 100
//1 ≤ is_prefix의 길이 ≤ 100
//my_string과 is_prefix는 영소문자로만 이루어져 있습니다.
//입출력 예
//my_string	is_prefix	result
//"banana"	"ban"	1
//"banana"	"nan"	0
//"banana"	"abcd"	0
//"banana"	"bananan"	0
//입출력 예 설명
//입출력 예 #1
//
//예제 1번에서 is_prefix가 my_string의 접두사이기 때문에 1을 return 합니다.
//입출력 예 #2
//
//예제 2번에서 is_prefix가 my_string의 접두사가 아니기 때문에 0을 return 합니다.
//입출력 예 #3
//
//예제 3번에서 is_prefix가 my_string의 접두사가 아니기 때문에 0을 return 합니다.
//입출력 예 #4
//
//예제 4번에서 is_prefix가 my_string의 접두사가 아니기 때문에 0을 return 합니다.
public class 접두사인지확인하기 {
    public static void main(String[] args) {
        접두사인지확인하기 sl = new 접두사인지확인하기();
        String my_string = "banana";
        String is_prefix = "ban";
        int result = sl.solution(my_string, is_prefix);
        System.out.println(result);
    }
    public int solution(String my_string, String is_prefix) {
        int answer = 0;

        for (int i = 0; i < is_prefix.length(); i++) {
            if (i >= my_string.length() || my_string.charAt(i) != is_prefix.charAt(i)) {
                // 만약 is_prefix가 my_string의 접두사가 아니라면 0을 할당하고 반복문을 종료합니다.
                break;
            }

            // 모든 문자가 일치하고 마지막 인덱스까지 도달했을 때, 1을 할당합니다.
            if (i == is_prefix.length() - 1) {
                answer = 1;
            }
        }

        return answer;
    }
}
