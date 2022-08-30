package 인프런.등수구하기;

import java.util.Scanner;

public class Main {
    public int[] solution(int num, int[] nums) {
        int[] rank = new int[num];
        for (int i = 0; i < num; i++) {
            int cnt = 1;
            for (int j = 0; j < num; j++) {
//                cnt += (nums[i]<nums[j]) ? 1:0;
                if(nums[i]<nums[j]) cnt++;
            }
            rank[i] = cnt;
        }
        return rank;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] nums = new int[num];
        for (int i = 0; i < num; i++) {
            nums[i] = kb.nextInt();
        }
        for (int rank : T.solution(num, nums)) {
            System.out.print(rank + " ");
        }
    }
}
