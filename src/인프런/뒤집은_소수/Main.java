package 인프런.뒤집은_소수;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int[] nums) {

        ArrayList<Integer> answerArray = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            String tmp;

            /**
             *
             */
            tmp = String.valueOf(nums[i]);
            char[] c = tmp.toCharArray();
            nums[i]=0;
            for (int k = 0; k < c.length; k++) {

                nums[i] += (Integer.parseInt(Character.toString(c[k]))) * (int) (Math.pow(10, k));
            }

            isPrime(nums, answerArray, i);
        }
//        String answer = (answerArray.toString()).replaceAll("[\\[\\]\\,]","");
//        System.out.println(answer.toString());
        return answerArray;
    }
    public ArrayList<Integer> solution2(int[] nums) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            int res = 0;
            int tmp = nums[i];
            while(tmp>0) {
                res = (res * 10) + (tmp % 10);
                tmp = tmp / 10;
            }
            isPrime(answer,res);
        }

        return answer;
    }
    private void isPrime(ArrayList<Integer> answerArray,int res) {
        if(res==1) return;
        if ((res == 2) || (res == 3)) {
            answerArray.add(res);
            return;
        }
        boolean isPrime = true;
//
        for (int j = 2; j <= Math.sqrt(res); j++) {
            if (res % j == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            answerArray.add(res);
        }
    }


        private void isPrime(int[] nums, ArrayList<Integer> answerArray, int i) {
        if(nums[i]==1) return;
        if ((nums[i] == 2) || (nums[i] == 3)) {
            answerArray.add(nums[i]);
            return;
        }
        boolean isPrime = true;
//
        for (int j = 2; j <= Math.sqrt(nums[i]); j++) {
            if (nums[i] % j == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            answerArray.add(nums[i]);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] nums = new int[num];
        for (int i = 0; i < num; i++) {
            nums[i] = kb.nextInt();
        }
        for(int s : T.solution2(nums)){
            System.out.print(s+" ");
        };
    }
}
