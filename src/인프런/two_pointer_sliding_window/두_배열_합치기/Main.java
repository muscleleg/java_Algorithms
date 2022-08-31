package 인프런.two_pointer_sliding_window.두_배열_합치기;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution2(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;
        while(p1<n && p2<m){
            if(a[p1]<b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }
        while(p1<n) answer.add(a[p1++]);
        while(p2<m) answer.add(b[p2++]);
        return answer;
    }


        public int[] solution(int numA, int[] arrayA, int numB, int[] arrayB) {
        int[] answer = new int[numA + numB];
        int bigNum = numA;
        int smallNum = numB;
        int[] bigArray = arrayA;
        int[] smallArray = arrayB;
        if (numA < numB) {
            bigNum = numB;
            smallNum = numA;
            bigArray = arrayB;
            smallArray = arrayA;
        }
        int index = 0;
        for (int i = 0; i < bigNum; i++) {
            if (i < smallNum) {
                    answer[index++] = bigArray[i];
                    answer[index++] = smallArray[i];

            }else{
                answer[index++] = bigArray[i];

            }

        }
        Arrays.sort(answer);
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int numA = kb.nextInt();
        int[] arrayA = new int[numA];
        for (int i = 0; i < numA; i++) {
            arrayA[i] = kb.nextInt();
        }
        int numB = kb.nextInt();
        int[] arrayB = new int[numB];

        for (int i = 0; i < numB; i++) {
            arrayB[i] = kb.nextInt();
        }
        for(int i : T.solution(numA,arrayA,numB,arrayB)){
            System.out.print(i+" ");
        }
    }
}
