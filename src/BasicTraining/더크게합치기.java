package BasicTraining;
import java.util.*;

//문제 설명
//연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
//
//12 ⊕ 3 = 123
//3 ⊕ 12 = 312
//양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
//
//단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
//
//제한사항
//1 ≤ a, b < 10,000
//입출력 예
//a	b	result
//9	91	991
//89	8	898
//입출력 예 설명
//입출력 예 #1
//
//a ⊕ b = 991 이고, b ⊕ a = 919 입니다. 둘 중 더 큰 값은 991 이므로 991을 return 합니다.
//입출력 예 #2
//
//a ⊕ b = 898 이고, b ⊕ a = 889 입니다. 둘 중 더 큰 값은 898 이므로 898을 return 합니다.
public class 더크게합치기 {
    public static void main(String[] args){
        더크게합치기 sl = new 더크게합치기();
        int a = 89;
        int b = 8;
        int result;
        result = sl.solution(a, b);
        System.out.println(result);
    }
    public int solution(int a, int b) {
        int answer = 0;
        String as = String.valueOf(a);
        String bs = String.valueOf(b);
        int sum1 = Integer.parseInt(as+bs);
        int sum2 = Integer.parseInt(bs+as);
//        or
//        int sum1 = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
//        int sum2 = Integer.parseInt(String.valueOf(b)+String.valueOf(a));

        if(sum1 >= sum2){
            answer = sum1;
        }else {
            answer = sum2;
        }

        return answer;
    }
}
