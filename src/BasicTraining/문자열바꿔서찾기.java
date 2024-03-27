package BasicTraining;
//https://school.programmers.co.kr/learn/courses/30/lessons/181864
import java.util.*;
public class 문자열바꿔서찾기 {
    public int solution(String myString, String pat) {
        String a = "";
        for(int i = 0 ; i < myString.length() ; i++){
            if(myString.charAt(i) == 'A'){
                a += "B";
            }else{
                a += "A";
            }
        }
        System.out.println(a);
        int answer = a.contains(pat) ? 1 : 0;
        return answer;
    }
}
