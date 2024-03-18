package BasicTraining;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/181874
public class A강조하기 {
    public String solution(String myString) {
        String answer = "";
        for(int i = 0 ; i < myString.length() ; i++){
            if(myString.charAt(i) == 'a' || myString.charAt(i) == 'A'){
                answer += Character.toUpperCase(myString.charAt(i));
            }else{
                answer += Character.toLowerCase(myString.charAt(i));
            }
        }
        System.out.println(answer);
        return answer;
    }   
}
