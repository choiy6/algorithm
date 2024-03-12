package BasicTraining;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/181882
public class 조건에맞게수열변환하기1 {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] >= 50 && arr[i] % 2 == 0){
                answer[i] = arr[i] / 2;
            }else if(arr[i] <50 && arr[i] % 2 != 0){
                answer[i] = arr[i] * 2;
            }else {
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}
