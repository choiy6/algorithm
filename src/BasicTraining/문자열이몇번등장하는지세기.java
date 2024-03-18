package BasicTraining;
//https://school.programmers.co.kr/learn/courses/30/lessons/181871
import java.util.*;
public class 문자열이몇번등장하는지세기 {
    public int solution(String myString, String pat) {
        int answer = 0;

        for(int i = 0 ; i <= myString.length()-pat.length() ; i++){
            if(myString.substring(i, i+pat.length()).equals(pat)){
                answer++;
            }
            System.out.println(myString.substring(i, i+pat.length()));

        }
        return answer;
    }
}
