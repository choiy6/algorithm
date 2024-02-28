package BasicTraining;
//https://school.programmers.co.kr/learn/courses/30/lessons/181883
import java.util.*;

public class 수열과구간쿼리1 {
    public int[] solution(int[] arr, int[][] queries) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++){
            al.add(arr[i]);
        }

        for(int i = 0 ; i < queries.length ; i++){
            int a = queries[i][0];
            int b = queries[i][1];
            for(int j = a ; j <=b ; j++){
                al.set(j, (al.get(j)+1));
            }
        }
        int[] answer = new int[al.size()];
        for(int i = 0 ; i < al.size() ; i++){
            answer[i] = al.get(i);
        }
        return answer;
    }
}
