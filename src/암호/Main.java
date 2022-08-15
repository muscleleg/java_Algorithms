package 암호;

import java.util.Scanner;

public class Main {
    public String solution(int num,String encryptText){
        String answer = "";
//        System.out.println("num = " + num);
//        System.out.println("encryptText = " + encryptText);
        for(int i=0;i<num;i++){
            int start=i*7;
            int end= (i+1)*7;
            String substring = encryptText.substring(start, end);
            String substringToBinary = substring.replaceAll("#", "1").replaceAll("\\*", "0");
            int binaryToInt = Integer.valueOf(substringToBinary, 2);
            char intToChar = (char) binaryToInt;
            answer+=intToChar;

//            System.out.println("substring = " + substring);
        }
        return answer;
    }
    public String solutionInflearn(int n, String s){
        String answer="";
        for(int i=0; i<n; i++){
            String tmp=s.substring(0, 7).replace('#', '1').replace('*', '0');
            int num=Integer.parseInt(tmp, 2);
            answer+=(char)num;
            s=s.substring(7);
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int num = Integer.valueOf(kb.nextLine());
        String encryptText = kb.nextLine();
        System.out.println(T.solution(num,encryptText));

    }
}
