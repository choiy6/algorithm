package BasicTraining;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/181880
public class 숫자1로만들기 {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i = 0 ; i < num_list.length ; i++){
            int a = num_list[i];
            while(a != 1){
                if(a % 2 == 0){
                    a /= 2;
                }else{
                    a = (a-1)/2;
                }
                answer++;
            }
        }
        return answer;
    }
}
