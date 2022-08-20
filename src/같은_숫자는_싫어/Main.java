//https://school.programmers.co.kr/learn/courses/30/lessons/12906
package 같은_숫자는_싫어;

import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public ArrayList<Integer> solution(int []arr) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(arr[0]);
        for (int i=1;i<arr.length; i++) {
            if (arr[i]!=arr[i-1]){
                integers.add(arr[i]);
            }
        }

        return integers;
    }

    public static void main(String[] args) {
        Main T = new Main();
        int[] arr1 = {1,1,3,3,0,1,1};
        int[] arr2 = {4,4,4,3,3};
        System.out.println(T.solution(arr1));
        System.out.println(T.solution(arr2));

    }
}
