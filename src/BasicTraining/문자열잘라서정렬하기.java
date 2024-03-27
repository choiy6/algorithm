package BasicTraining;
//https://school.programmers.co.kr/learn/courses/30/lessons/181866
import java.util.*;
public class 문자열잘라서정렬하기 {
    public String[] solution(String myString) {
        String[] ms = myString.split("x");

        Arrays.sort(ms);

        ArrayList<String> arr = new ArrayList<>();

        for(String s : ms){
            if(!s.equals("")){
                arr.add(s);
            }
        }

        String[] answer = new String[arr.size()];

        for(int i = 0 ; i < arr.size() ; i++){
            answer[i] = arr.get(i);
        }

        return answer;
    }
}
