package 인프런.회전문자열_7;
import java.util.Scanner;

public class MyMain {
    public String solution(String str){
        str=str.toUpperCase();
        char[] strCh = str.toCharArray();
        int lt=0,rt=str.length()-1;
        while(lt<rt){
            if (strCh[lt]!=strCh[rt]) {
                return "NO";
            }
            lt++;
            rt--;
        }
        return "YES";
    }
    public static void main(String[] args){
        MyMain T = new MyMain();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
