package BasicTraining;
//https://school.programmers.co.kr/learn/courses/30/lessons/181881
import java.util.*;
public class 조건에맞게수열변환하기2 {
    public int solution(int[] arr) {
        int answer = 0;
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }

        while (!al.equals(al2)) { // al과 al2가 다를 때까지 루프 실행
            al2.clear(); // al2를 비워줍니다.
            al2.addAll(al); // al의 내용을 al2에 복사합니다.
            for (int i = 0; i < al.size(); i++) {
                if (al.get(i) >= 50 && al.get(i) % 2 == 0) {
                    al.set(i, al.get(i) / 2);
                } else if (al.get(i) < 50 && al.get(i) % 2 != 0) {
                    al.set(i, ((al.get(i) * 2) + 1));
                } else {
                    // al.set(i, al.get(i));
                }
            }
            answer++;

        }
        answer -= 1;
        return answer;
    }

}
