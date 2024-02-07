package BasicTraining;
import java.util.*;
//문제 설명
//알파벳 대소문자로만 이루어진 문자열 my_string이 주어질 때, my_string에서 'A'의 개수, my_string에서 'B'의 개수,..., my_string에서 'Z'의 개수, my_string에서 'a'의 개수, my_string에서 'b'의 개수,..., my_string에서 'z'의 개수를 순서대로 담은 길이 52의 정수 배열을 return 하는 solution 함수를 작성해 주세요.
//
//제한사항
//1 ≤ my_string의 길이 ≤ 1,000
//입출력 예
//my_string	result
//"Programmers"	[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0]
//입출력 예 설명
//입출력 예 #1
//
//예제 1번의 my_string에서 'P'가 1개, 'a'가 1개, 'e'가 1개, 'g'가 1개, 'm'이 2개, 'o'가 1개, 'r'가 3개, 's'가 1개 있으므로 [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0]를 return 합니다.
public class 문자개수세기 {
    public static void main(String[] args) {
        문자개수세기 sl = new 문자개수세기();
        String my_string = "Programmers";
        int[] result = sl.solution(my_string);
        System.out.println(Arrays.toString(result));
    }
    public int[] solution(String my_string) {
            int[] answer = new int[52];

            for(int i = 0; i < my_string.length(); i++) {
                if(my_string.charAt(i) > 64 && my_string.charAt(i) < 91) {
                    answer[my_string.charAt(i)-65]++;
                } else if(my_string.charAt(i) > 96 && my_string.charAt(i) < 123) {
                    answer[my_string.charAt(i)-71]++;
                }

            }

            return answer;
    }
}
