package 숫자만추출;

import java.util.Scanner;

public class Main {
    public int solution(String str) {
        char[] chars = str.toCharArray();
        String answer = "";
        for (char ch : chars) {
            if (Character.isDigit(ch)) {
                answer += String.valueOf(ch);
            }
        }

         return Integer.parseInt(answer);
    }
//    public int solution(String str) {
//        str=str.replaceAll("[^0-9]","");
////        if(str.charAt(0)=='0'){
////            str=str.substring(1);
////        }
//        int num;
//        num=Integer.parseInt(str);
//
//            return num;
//    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
