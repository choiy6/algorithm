package BasicTraining;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/181878
public class 원하는문자열찾기 {
    public int solution(String myString, String pat) {
        int answer = 0;
        answer = (myString.toUpperCase().contains(pat.toUpperCase())) ? 1 : 0;
        return answer;
    }
}
