package BasicTraining;
//https://school.programmers.co.kr/learn/courses/30/lessons/181865
import java.util.*;
public class 간단한식계산하기 {
    public int solution(String binomial) {
        String a = "";
        String b = "";
        boolean c = true;
        String ca = "";
        for(int i = 0 ; i < binomial.length() ; i++){

            if(binomial.charAt(i) != ' '){
                if(binomial.charAt(i) == '+'){
                    ca = Character.toString(binomial.charAt(i));
                    c = false;
                }else if(binomial.charAt(i) == '-'){
                    ca = Character.toString(binomial.charAt(i));
                    c = false;
                }else if(binomial.charAt(i) == '*'){
                    ca = Character.toString(binomial.charAt(i));
                    c = false;
                }else{
                    if(c){
                        a += binomial.charAt(i);
                    }else{
                        b += binomial.charAt(i);
                    }
                }
                // System.out.println(binomial.charAt(i));

            }
        }
        int answer = 0;
        if(ca.equals("+")){
            answer = Integer.parseInt(a) + Integer.parseInt(b);
        }else if(ca.equals("-")){
            answer = Integer.parseInt(a) - Integer.parseInt(b);
        }else{
            answer = Integer.parseInt(a) * Integer.parseInt(b);
        }
        return answer;
//        OR
//                String[] cal = binomial.split(" ");
//
//        if (cal[1].equals("+")) {
//            return (Integer.parseInt(cal[0])) + (Integer.parseInt(cal[2]));
//        } else if (cal[1].equals("-")) {
//            return (Integer.parseInt(cal[0])) - (Integer.parseInt(cal[2]));
//        } else {
//            return (Integer.parseInt(cal[0])) * (Integer.parseInt(cal[2]));
//        }
    }
}
