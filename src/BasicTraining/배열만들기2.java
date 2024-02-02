package BasicTraining;
import java.util.*;
//문제 설명
//정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을
// return 하는 solution 함수를 완성해 주세요.
//만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
//제한사항
//1 ≤ l ≤ r ≤ 1,000,000
//입출력 예
//l	r	result
//5	555	[5, 50, 55, 500, 505, 550, 555]
//10	20	[-1]
//입출력 예 설명
//입출력 예 #1
//5 이상 555 이하의 0과 5로만 이루어진 정수는 작은 수부터 5, 50, 55, 500, 505, 550, 555가 있습니다.
// 따라서 [5, 50, 55, 500, 505, 550, 555]를 return 합니다.
//입출력 예 #2
//10 이상 20 이하이면서 0과 5로만 이루어진 정수는 없습니다. 따라서 [-1]을 return 합니다.
public class 배열만들기2 {
    public static void main(String[] args){
        배열만들기2 sl = new 배열만들기2();
        int l = 5;
        int r = 555;
        int[] result = sl.solution(l, r);
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int l, int r) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int count = 0;
        for (int i = l; i <= r; i++) {
            String si= String.valueOf(i);
            boolean bl = true;
            for (int j = 0; j < si.length(); j++) {
                if(si.charAt(j) != '0' && si.charAt(j) != '5'){
                    bl = false;
                    break;
                }
            }
            if(bl) {
                arrayList.add(i);
                count++;
            }
        }
        if(count == 0){
            arrayList.add(-1);
        }
        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}
