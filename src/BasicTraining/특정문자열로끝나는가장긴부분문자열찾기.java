package BasicTraining;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/181872
public class 특정문자열로끝나는가장긴부분문자열찾기 {
    public String solution(String myString, String pat) {
        String answer = "";
        int findIdx = myString.lastIndexOf(pat);
        answer = myString.substring(0, findIdx+pat.length());
        return answer;
    }
}
