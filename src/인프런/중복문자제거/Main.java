package 인프런.중복문자제거;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        String answer="";
        for(int i=0; i<str.length(); i++){
//            System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i))==i){ //indexof 해당 문자가 나온 첫번쨰 위치
                answer+=str.charAt(i);
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str= kb.next();
        System.out.println(T.solution(str));
    }
}
