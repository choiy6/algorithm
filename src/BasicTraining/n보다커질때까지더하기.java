package BasicTraining;
import java.util.*;//https://school.programmers.co.kr/learn/courses/30/lessons/181884
public class n보다커질때까지더하기 {
    public static void main(String[] args) {
        n보다커질때까지더하기 sl = new n보다커질때까지더하기();
        int[] numbers = {34, 5, 71, 29, 100, 34};
        int n = 123;
        int result = sl.solution(numbers, n);
        System.out.println(result);
    }

    public int solution(int[] numbers, int n) {
        int answer = 0;
        for(int i = 0 ; i< numbers.length ; i++){
            answer += numbers[i];
            if(n < answer) break;
        }
        return answer;
    }
}
