package BasicTraining;
import java.util.*;
//문제 설명
//1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
//
//네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
//세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
//주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
//어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
//네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
//네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
//
//제한사항
//a, b, c, d는 1 이상 6 이하의 정수입니다.
//입출력 예
//a	b	c	d	result
//2	2	2	2	2222
//4	1	4	4	1681
//6	3	3	6	27
//2	5	2	6	30
//6	4	2	5	2
//입출력 예 설명
//입출력 예 #1
//
//예제 1번에서 네 주사위 숫자가 모두 2로 같으므로 1111 × 2 = 2222점을 얻습니다. 따라서 2222를 return 합니다.
//입출력 예 #2
//예제 2번에서 세 주사위에서 나온 숫자가 4로 같고 나머지 다른 주사위에서 나온 숫자가 1이므로 (10 × 4 + 1)2 = 412 = 1681점을 얻습니다.
// 따라서 1681을 return 합니다.
//입출력 예 #3
//예제 3번에서 a, d는 6으로, b, c는 3으로 각각 같으므로 (6 + 3) × |6 - 3| = 9 × 3 = 27점을 얻습니다. 따라서 27을 return 합니다.
//|p - q|: p에서 q를 뺀 결과에 대한 절댓값을 취합니다. 절댓값은 어떤 값이 음수이든 양수이든 해당 값의 절댓값을 반환합니다.
//입출력 예 #4
//예제 4번에서 두 주사위에서 2가 나오고 나머지 다른 두 주사위에서 각각 5, 6이 나왔으므로 5 × 6 = 30점을 얻습니다. 따라서 30을 return 합니다.
//입출력 예 #5
//예제 5번에서 네 주사위 숫자가 모두 다르고 나온 숫자 중 가장 작은 숫자가 2이므로 2점을 얻습니다. 따라서 2를 return 합니다.
public class 주사위게임3 {
    public static void main(String args[]){
        주사위게임3 sl = new 주사위게임3();
        int a = 2;
        int b = 2;
        int c = 2;
        int d = 2;
        int result = sl.solution(a, b, c, d);
        System.out.println(result);
    }

    public int solution(int a, int b, int c, int d) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();
        // mapAdd() 는 하단에 함수로 만들어 두었음.
        mapAdd(map, a);
        mapAdd(map, b);
        mapAdd(map, c);
        mapAdd(map, d);



        int[] pq = new int[2];
        int count = 0;
        if(map.keySet().size() == 1) { // a, b, c, d 가 모두 같은 경우
            //네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
            answer = 1111 * a;
        } else if(map.keySet().size() == 4) { // a, b, c, d 가 모두 다른 경우
            //네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
            int min = 6;
            for(Integer key : map.keySet()) {
                min = (min > key) ? key : min;
            }
            answer = min;
        } else if(map.keySet().size() == 2) { // a, b, c, d 중 두 개씩 같은 경우 OR 세 개가 같고 하나만 다른 경우
            boolean t = true;
            for(Integer key : map.keySet()) {
                if(map.get(key) == 3) {
                    pq[0] = key;
                    continue;
                }
                if(map.get(key) == 1) {
                    pq[1] = key;
                    continue;
                }
                if(map.get(key) == 2) {
                    t = false;
                    pq[count] = key;
                    count++;
                }
            }

            int p = pq[0];
            int q = pq[1];

            if(t) {
                //세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
                answer = (10 * p + q) * (10 * p + q);
            } else {
                //주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
                int pqp = p + q;
                int pqm = p - q;
                answer = pqp;
                if(pqm > 0) {
                    answer *= pqm;
                } else {
                    answer *= -1 * pqm;
                }
            }
        } else if(map.keySet().size() == 3) { // a, b, c, d 중 두 개는 같고 나머지가 다른 경우
            for(Integer key : map.keySet()) {
                if(map.get(key) == 1) {
                    pq[count] = key;
                    count++;
                }
            }
            //어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
            answer = pq[0] * pq[1];
        }

        return answer;
    }

    // map에 숫자 추가, 같은 수인 경우 value++
    public void mapAdd(Map<Integer, Integer> map, int v) {
        if(map.containsKey(v)) {
            map.put(v, map.get(v)+1);
        } else {
            map.put(v, 1);
        }
    }
}
