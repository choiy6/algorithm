package BasicTraining;
import java.util.*;
//문제 설명
//정수가 담긴 리스트 num_list가 주어집니다.
// num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
//
//제한사항
//2 ≤ num_list의 길이 ≤ 10
//1 ≤ num_list의 원소 ≤ 9
//num_list에는 적어도 한 개씩의 짝수와 홀수가 있습니다.
//입출력 예
//num_list	result
//[3, 4, 5, 2, 1]	393
//[5, 7, 8, 3]	581
//입출력 예 설명
//입출력 예 #1
//
//홀수만 이어 붙인 수는 351이고 짝수만 이어 붙인 수는 42입니다. 두 수의 합은 393입니다.
//입출력 예 #2
//
//홀수만 이어 붙인 수는 573이고 짝수만 이어 붙인 수는 8입니다. 두 수의 합은 581입니다.
public class 이어붙인수 {

    public static void main(String[] args){
        이어붙인수 sl = new 이어붙인수();
        int[] num_list = {3, 4, 5, 2, 1};
        int result = sl.solution(num_list);
        System.out.println(result);
    }

    public int solution(int[] num_list) {
        int answer = 0;
        int odd1= 0;
        int even1= 0;
        for(int i : num_list){
            if(i%2 != 0){
                odd1 = Integer.parseInt(String.valueOf(odd1)+String.valueOf(i));
            }else{
                even1 = Integer.parseInt(String.valueOf(even1)+String.valueOf(i));
            }
        }
        answer = odd1+even1;
        return answer;
    }

}
