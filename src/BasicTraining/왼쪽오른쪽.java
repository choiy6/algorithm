package BasicTraining;
import java.util.*;
//문제 설명
//문자열 리스트 str_list에는 "u", "d", "l", "r" 네 개의 문자열이 여러 개 저장되어 있습니다. str_list에서 "l"과 "r" 중 먼저 나오는 문자열이 "l"이라면 해당 문자열을 기준으로 왼쪽에 있는 문자열들을 순서대로 담은 리스트를, 먼저 나오는 문자열이 "r"이라면 해당 문자열을 기준으로 오른쪽에 있는 문자열들을 순서대로 담은 리스트를 return하도록 solution 함수를 완성해주세요. "l"이나 "r"이 없다면 빈 리스트를 return합니다.
//
//제한사항
//1 ≤ str_list의 길이 ≤ 20
//str_list는 "u", "d", "l", "r" 네 개의 문자열로 이루어져 있습니다.
//입출력 예
//str_list	result
//["u", "u", "l", "r"]	["u", "u"]
//["l"]	[]
//입출력 예 설명
//입출력 예 #1
//
//"r"보다 "l"이 먼저 나왔기 때문에 "l"의 왼쪽에 있는 문자열들을 담은 리스트인 ["u", "u"]를 return합니다.
//입출력 예 #2
//
//"l"의 왼쪽에 문자열이 없기 때문에 빈 리스트를 return합니다.
public class 왼쪽오른쪽 {
    public static void main(String[] args){
        왼쪽오른쪽 sl = new 왼쪽오른쪽();
        String[] str_list = {"u", "u", "l", "r"};
        String[] result = sl.solution(str_list);
        System.out.println(Arrays.toString(result));
    }
    public String[] solution(String[] str_list) {
        ArrayList<String> al = new ArrayList<>();
        int lrIdx = -1;
        String lr = "";
        for(int i = 0 ; i < str_list.length ; i++){
            if(str_list[i].equals("l")){
                lrIdx = i;
                lr = "l";
                break;
            }else if(str_list[i].equals("r")){
                lrIdx = i;
                lr = "r";
                break;
            }
        }
        String[] answer = {};
        if(lrIdx == -1 || str_list.length == 1){
            answer = new String[0];
        }else if(lr.equals("l")){
            for(int i = 0 ; i < lrIdx ; i++){
                al.add(str_list[i]);
            }
            answer = new String[al.size()];
            for(int i = 0 ; i < al.size() ; i++){
                answer[i] = al.get(i);
            }
        }else if(lr.equals("r")){
            for(int i = lrIdx+1 ; i < str_list.length ; i++){
                al.add(str_list[i]);
            }
            answer = new String[al.size()];
            for(int i = 0 ; i < al.size() ; i++){
                answer[i] = al.get(i);
            }
        }

        return answer;
    }
}
