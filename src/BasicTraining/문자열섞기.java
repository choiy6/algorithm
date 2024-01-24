package BasicTraining;
import java.util.*;
//문제 설명
//길이가 같은 두 문자열 str1과 str2가 주어집니다.
//
//두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.
//
//제한사항
//1 ≤ str1의 길이 = str2의 길이 ≤ 10
//str1과 str2는 알파벳 소문자로 이루어진 문자열입니다.
//입출력 예
//str1	str2	result
//"aaaaa"	"bbbbb"	"ababababab"
public class 문자열섞기 {
    public static void main(String[] args){
        문자열섞기 sl = new 문자열섞기();
        String str1 = "aaaaa";
        String str2 = "bbbbb";
        String result = sl.solution(str1, str2);
        System.out.print("result = " + result);
    }
    public String solution(String str1, String str2) {
        String answer = "";
        for (int i = 0; i < str1.length(); i++) {
            char a = str1.charAt(i);
            char b = str2.charAt(i);
            answer += a;
            answer += b;
        }

        return answer;
    }
}
