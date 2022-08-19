package 보이는_학생;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int solution(int num,int[] students){
        int answer=0;
        int max=0;
        for (int i = 0; i < students.length; i++) {
            if(students[i]>max){
                answer++;
                max=students[i];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
       Main T = new Main();
       Scanner kb = new Scanner(System.in);
       int num = kb.nextInt();
       int[] students=new int[num];
        for (int i=0;i<num; i++) {
            students[i]=kb.nextInt(); //foreach를 통해서 배열을 수정할 수는 없음 배열의 주소값을 가져온게 아니라 값을 가저왔기때문임
        }
//        for (int student : students) {
//            student=kb.nextInt();
//        }
//        System.out.println("num = " + Arrays.toString(students));
        System.out.println(T.solution(num,students));
    }
}
