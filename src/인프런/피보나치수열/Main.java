package 인프런.피보나치수열;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public void solution(int num) {
//        ArrayList<Integer> nums = new ArrayList<>();
//        nums.add(0,1);
//        nums.add(1,1);

        int[] nums2 = new int[num];
        nums2[0]=1;
        nums2[1]=1;

        for (int i = 2; i <num; i++) {
//            nums.add(i,(nums.get(i-2)+nums.get(i-1)));
            nums2[i] = nums2[i-2] + nums2[i-1];
        }
//        String answer = nums.toString().replaceAll("[\\[\\]]", "").replaceAll("\\,","");
        String answer = Arrays.toString(nums2).replaceAll("[\\[\\]]", "").replaceAll("\\,","");

        System.out.println(answer);
    }
    public void solution2(int num){

        int a,b,c;
        a = 1;
        b = 1;
        System.out.print(a + " " + b);
        for (int i = 2; i < num; i++) {
            c = a+b;
            System.out.print(" " + c);
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        T.solution2(num);
    }
}
