package 문자열압축;

import java.util.Scanner;

public class Main2 {
    public String solution(String str){
        String answer = "";
        int num=1;
        int len=str.length();
        for(int i =0;i<len-1 ;i++){
                if (str.charAt(i)==str.charAt(i+1)){
                    num++;
                    if(i==len-1-1){
                            answer = answer + str.charAt(i) + num;
                    }
                }else {
                    if (num == 1) {
                        answer = answer + str.charAt(i);
                    } else {
                        if(i==len-1-1){
                            answer = answer + str.charAt(i) + num +str.charAt(len-1);
                        }else{
                            answer = answer + str.charAt(i) + num;
                            num = 1;
                        }

                    }
                }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(T.solution(s));
    }
}
