package BasicTraining;
import java.util.*;
//문제 설명
//정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [i, j] 꼴입니다.
//각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다.
//위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
//
//제한사항
//1 ≤ arr의 길이 ≤ 1,000
//0 ≤ arr의 원소 ≤ 1,000,000
//1 ≤ queries의 길이 ≤ 1,000
//0 ≤ i < j < arr의 길이
//입출력 예
//arr   /	queries	    /   result
//[0, 1, 2, 3, 4] /	[[0, 3],[1, 2],[1, 4]] /	[3, 4, 1, 0, 2]
//입출력 예 설명
//입출력 예 #1
//
//각 쿼리에 따라 arr가 다음과 같이 변합니다.
//arr
//[0, 1, 2, 3, 4]
//[3, 1, 2, 0, 4]
//[3, 2, 1, 0, 4]
//[3, 4, 1, 0, 2]
//따라서 [3, 4, 1, 0, 2]를 return 합니다.
public class 수열과구간쿼리3 {
    public static void main(String[] args){
        수열과구간쿼리3 sl = new 수열과구간쿼리3();
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3},{1, 2},{1, 4}};
        int[] result = sl.solution(arr, queries);
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int temp = arr[a];

            arr[a] = arr[b];
            arr[b] = temp;

        }
        return arr;
    }
}
