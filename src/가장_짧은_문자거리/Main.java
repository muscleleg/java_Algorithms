package 가장_짧은_문자거리;
import java.util.Scanner;
public class Main {
    public String solution(String s,char t) {
        String answer="";

        char[] str = s.toCharArray();
        for(int i = 0; i < str.length; i++){
            int count=0;
            for (int j = 0; j < str.length; j++) {
                if(str[i]==t){
                    continue;
                }
                count++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Main T = new Main();
        String s = kb.next();
        char t = kb.next().charAt(0);
        System.out.println(T.solution(s,t));

    }
}
