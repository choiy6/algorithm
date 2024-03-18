package BasicTraining;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/181873
public class 특정한문자를대문자로바꾸기 {
    public String solution(String my_string, String alp) {
        String answer = "";
        for(int i = 0 ; i < my_string.length() ; i++){
            if(my_string.charAt(i) == alp.charAt(0)){
                answer += Character.toUpperCase(my_string.charAt(i));
            }else{
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
