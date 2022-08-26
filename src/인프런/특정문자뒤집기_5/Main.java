package 인프런.특정문자뒤집기_5;
import java.util.Scanner;

public class Main {
    public String solution(String str){
        char[] ch = str.toCharArray();
        int lt=0;
        int rt=ch.length-1;
//        while(lt<rt) {
//            if (isAlpahbet(ch[lt]) && isAlpahbet(ch[rt])){
//                char tmp;
//                tmp = ch[lt];
//                ch[lt]=ch[rt];
//                ch[rt]=tmp;
//            }
//            lt++;
//            rt--;
//        }
        while(lt<rt) {
            if(!isAlpahbet(ch[lt])){
                lt++;
            }else if (!isAlpahbet(ch[rt])){
                rt--;
            }else{
                char tmp;
                tmp = ch[lt];
                ch[lt]=ch[rt];
                ch[rt]=tmp;
                lt++;
                rt--;
            }

        }

        return String.valueOf(ch);
    }
    public boolean isAlpahbet(char ch){
        if ( (65<=ch && ch<=90)){
            return true;
        } else if (97<=ch && ch<=122) {
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        String answer=T.solution(str);
        System.out.println(answer);

    }
}
