package BasicTraining;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/181868
public class 공백으로구분하기2 {
    public String[] solution(String my_string) {
        String[] words = my_string.split(" ");
        ArrayList<String> result = new ArrayList<>();
        for ( int i = 0 ; i < words.length ; i++){
            if (!words[i].equals("")) {
                result.add(words[i]);
            }
        }
        String[] answer = new String[result.size()];
        for ( int i = 0 ; i < result.size() ; i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}
