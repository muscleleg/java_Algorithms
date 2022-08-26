package 인프런.팰린드롬;
import java.util.Scanner;
public class Main {
//    public String solution(String str){
//        str=str.toUpperCase();
//        char[] chars = str.toCharArray();
//        String tmp="";
//
//        for(int i=0; i<chars.length;i++){
//            if(Character.isAlphabetic(chars[i])){
//                tmp+=String.valueOf(chars[i]);
//            }
//        }
//        char[] answer = tmp.toCharArray();
//        int len=answer.length;
//        for(int i=0;i<len/2;i++){
//            if(answer[i]!=answer[len-1-i]){
//                return "NO";
//            }
//        }
//        return "YES";
//    }
//    public static void main(String[] args) {
//        Scanner kb = new Scanner(System.in);
//        String str = kb.nextLine();
//        System.out.println(T.solution(str));
//    }

    //--------------------------------------------
    public String solution(String s){
        String answer="NO";
        s=s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp=new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer="YES";
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.print(T.solution(str));
    }

}
