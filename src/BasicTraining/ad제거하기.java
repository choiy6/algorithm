package BasicTraining;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/181870
public class ad제거하기 {
    public String[] solution(String[] strArr) {

        ArrayList<String> arr = new ArrayList<>();

        for(int i = 0 ; i < strArr.length ; i++){
            if(!strArr[i].contains("ad")){
                arr.add(strArr[i]);
            }
        }

        String[] answer = new String[arr.size()];
        for(int i = 0 ; i < arr.size() ; i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}
