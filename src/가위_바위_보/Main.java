package 가위_바위_보;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public char[] solution(int num,int []aArray,int []bArray){
        char []answer = new char[num];
        //1:가위, 2:바위, 3:보
        char[][] rockPaperScissors={{'D','B','A'}
                                    ,{'A','D','B'}
                                    ,{'B','A','D'}};
        for (int i = 0; i < num; i++) {
            int a = aArray[i]-1;
            int b = bArray[i]-1;
            answer[i] = rockPaperScissors[a][b];
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] a = new int[num];
        int[] b = new int[num];
        for (int i = 0; i < a.length; i++) {
            a[i] = kb.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            b[i] = kb.nextInt();
        }
//        System.out.println("a = " + Arrays.toString(a));
//        System.out.println("b = " + Arrays.toString(b));
        for(char c : T.solution(num,a,b)){
            System.out.println(c);
        }
    }
}
