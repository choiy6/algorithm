package BasicTraining;
import java.util.*;
//문제 설명
//문자열 code가 주어집니다.
//code를 앞에서부터 읽으면서 만약 문자가 "1"이면 mode를 바꿉니다. mode에 따라 code를 읽어가면서 문자열 ret을 만들어냅니다.
//
//mode는 0과 1이 있으며, idx를 0 부터 code의 길이 - 1 까지 1씩 키워나가면서 code[idx]의 값에 따라 다음과 같이 행동합니다.
//
//mode가 0일 때
//code[idx]가 "1"이 아니면 idx가 짝수일 때만 ret의 맨 뒤에 code[idx]를 추가합니다.
//code[idx]가 "1"이면 mode를 0에서 1로 바꿉니다.
//mode가 1일 때
//code[idx]가 "1"이 아니면 idx가 홀수일 때만 ret의 맨 뒤에 code[idx]를 추가합니다.
//code[idx]가 "1"이면 mode를 1에서 0으로 바꿉니다.
//문자열 code를 통해 만들어진 문자열 ret를 return 하는 solution 함수를 완성해 주세요.
//
//단, 시작할 때 mode는 0이며, return 하려는 ret가 만약 빈 문자열이라면 대신 "EMPTY"를 return 합니다.
//
//제한사항
//1 ≤ code의 길이 ≤ 100,000
//code는 알파벳 소문자 또는 "1"로 이루어진 문자열입니다.
//입출력 예
//code	result
//"abc1abc1abc"	"acbac"
//입출력 예 설명
//입출력 예 #1
//
//code의 각 인덱스 i에 따라 다음과 같이 mode와 ret가 변합니다.
//i	code[i]	mode	ret
//0	"a"	0	"a"
//1	"b"	0	"a"
//2	"c"	0	"ac"
//3	"1"	1	"ac"
//4	"a"	1	"ac"
//5	"b"	1	"acb"
//6	"c"	1	"acb"
//7	"1"	0	"acb"
//8	"a"	0	"acba"
//9	"b"	0	"acba"
//10	"c"	0	"acbac"
//따라서 "acbac"를 return 합니다.
public class 코드처리하기 {
    public static void main(String[] args){
        코드처리하기 sl = new 코드처리하기();
        String code = "abc1abc1abc";
        String result = sl.solution(code);
        System.out.println(result);
    }

    public String solution(String code) {
        int mode = 0;
        String answer = "";
        for (int i = 0; i < code.length(); i++) {
            if(mode == 0){
                if(code.charAt(i) != '1' && i % 2 == 0){
//문자열("1"): 큰따옴표(")로 둘러싸인 문자들의 시퀀스입니다. 예를 들면, "Hello"와 같이 사용됩니다.
//문자('1'): 작은따옴표(')로 둘러싸인 하나의 문자입니다. 예를 들면, 'A'나 '1'과 같이 사용됩니다.
//charAt(i)는 문자열에서 i번째 위치에 있는 문자를 반환하는 메서드이므로,
// 비교를 할 때도 문자열과 맞추어야 합니다.
// 따라서 "1"이 아닌 경우를 체크할 때에는 '1'로 비교해야 합니다.
// 만약에 "1"로 비교한다면 문자열과 문자간의 비교가 되지 않아 원하는 조건을 만족시킬 수 없습니다.
                    answer += code.charAt(i);
                }
            }
            if(mode == 1){
                if(code.charAt(i) != '1' && i % 2 != 0){
                    answer += code.charAt(i);
                }
            }
            if(code.charAt(i) == '1'){
                mode = mode == 1 ? 0 : 1;
            }
        }
        return answer.isEmpty() ? "EMPTY" : answer;
    }
}
