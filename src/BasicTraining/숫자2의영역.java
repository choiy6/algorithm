package BasicTraining;
import java.util.*;
//문제 설명
//정수 배열 arr가 주어집니다. 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요.
//
//단, arr에 2가 없는 경우 [-1]을 return 합니다.
//
//제한사항
//1 ≤ arr의 길이 ≤ 100,000
//1 ≤ arr의 원소 ≤ 10
//입출력 예
//arr	result
//[1, 2, 1, 4, 5, 2, 9]	[2, 1, 4, 5, 2]
//[1, 2, 1]	[2]
//[1, 1, 1]	[-1]
//[1, 2, 1, 2, 1, 10, 2, 1]	[2, 1, 2, 1, 10, 2]
//입출력 예 설명
//입출력 예 #1
//
//2가 있는 인덱스는 1번, 5번 인덱스뿐이므로 1번부터 5번 인덱스까지의 부분 배열인 [2, 1, 4, 5, 2]를 return 합니다.
//입출력 예 #2
//
//2가 한 개뿐이므로 [2]를 return 합니다.
//입출력 예 #3
//
//2가 배열에 없으므로 [-1]을 return 합니다.
//입출력 예 #4
//
//2가 있는 인덱스는 1번, 3번, 6번 인덱스이므로 1번부터 6번 인덱스까지의 부분 배열인 [2, 1, 2, 1, 10, 2]를 return 합니다.
public class 숫자2의영역 {
    public static void main(String[] args){
        숫자2의영역 sl = new 숫자2의영역();
        int[] arr = {1, 2, 1, 4, 5, 2, 9};
        int[] result = sl.solution(arr);
        System.out.println(Arrays.toString(result));
    }
    public int[] solution(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        boolean bl = false;
        int cnt = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == 2){
                bl = true;
                cnt++;
            }
            if(bl){
                al.add(arr[i]);
            }
        }
        int cnt2 = 0;
        for (int i = 0; i < al.size(); i++) {
            if(cnt == cnt2){
                break;
            }
            al2.add(al.get(i));
            if(al.get(i) == 2) {
                cnt2++;
            }
        }
        int[] answer;
        if(cnt == 0){
            answer = new int[1];
            answer[0] = -1;
        }else{
            if(cnt == 1){
                answer = new int[1];
                answer[0] = 2;
            }else{
                answer = new int[al2.size()];
                for(int i = 0 ; i < al2.size(); i++){
                    answer[i] = al2.get(i);
                }
            }
        }
        return answer;
    }
}
