package 가장_짧은_문자거리;
import java.util.Scanner;

public class Main2 {
    public String solution(String s,char t){
        char[] stringToChar = s.toCharArray();
        int[] rightDirection = new int[stringToChar.length];
        int[] leftDirection = new int[stringToChar.length];
        String answer = "";

        calc(t, stringToChar, rightDirection, leftDirection);
        for (int i = 0; i < stringToChar.length-1; i++) {
            if(rightDirection[i]<=leftDirection[i]){
                answer += rightDirection[i]+" ";
            }else{
                answer += leftDirection[i]+" ";
            }
        }

        if(rightDirection[stringToChar.length-1]<=leftDirection[stringToChar.length-1]){
            answer += rightDirection[stringToChar.length-1];
        }else{
            answer += leftDirection[stringToChar.length-1];
        }
        return answer;

    }

    private void calc(char t, char[] stringToChar, int[] rightDirection, int[] leftDirection) {
        int num=stringToChar.length;
        for (int i = 0; i< stringToChar.length; i++){
            if (stringToChar[i]!= t){
                num=num+1;
                rightDirection[i]=num;
            }else {
                num=0;
                rightDirection[i]=num;
            }
        }
        num=stringToChar.length;
        for (int i = stringToChar.length-1; i>=0; i--){
            if (stringToChar[i]!= t){
                num=num+1;
                leftDirection[i]=num;
            }else {
                num=0;
                leftDirection[i]=num;
            }
        }
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        char t = kb.next().charAt(0);
        System.out.println(T.solution(s,t));
    }
}
