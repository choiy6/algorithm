package BasicTraining;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/181867
public class x사이의개수 {
    public int[] solution(String myString) {
        String[] arr = myString.split("x",-1);
        System.out.println(Arrays.toString(arr));
        int[] answer = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            answer[i] = arr[i].length();
        }
        return answer;
    }
}
