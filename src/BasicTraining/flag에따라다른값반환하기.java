package BasicTraining;
import java.util.*;
//문제 설명
//두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때, flag가 true면 a + b를 false면
// a - b를 return 하는 solution 함수를 작성해 주세요.
//
//제한사항
//-1,000 ≤ a, b ≤ 1,000
//입출력 예
//a	b	flag	result
//-4	7	true	3
//-4	7	false	-11
//입출력 예
//입출력 예 #1
//
//예제 1번에서 flag가 true이므로 a + b = (-4) + 7 = 3을 return 합니다.
//입출력 예 #2
//
//예제 2번에서 flag가 false이므로 a - b = (-4) - 7 = -11을 return 합니다.
public class flag에따라다른값반환하기 {
    public static void main(String[] args){
        flag에따라다른값반환하기 sl = new flag에따라다른값반환하기();
        int a = -4;
        int b = 7;
        boolean flag = false;
        int result = sl.solution(a, b, flag);
        System.out.println(result);
    }
    public int solution(int a, int b, boolean flag) {
        return flag ? a+b : a-b;
    }
}
