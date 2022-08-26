package 인프런.점수계산;

import java.util.Scanner;

public class Main {
    public int solution(int num, int[] nums) {
        int answer = 0;
        int cnt = 0;
        for (int i = 0; i < num; i++) {
            if(nums[i] == 1){
                cnt+=1;
                answer+=cnt;
            }else{
                cnt=0;
            }

        }
        return answer;
    }

    /**
     * 나는 새로운 배열을 만들 필요가 없었다.
     */
    public int solution2(int num, int[] nums){
        int[] scoreArray = initializeScoreArray(num, nums);
        return calcScore(scoreArray);
    }

    private int calcScore(int[] scoreArray) {
        int totalScore = 0;
        for (int score : scoreArray) {
            totalScore+=score;
        }
        return totalScore;
    }

    public int[] initializeScoreArray(int num, int[] nums){
        int[] score = new int[num];
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                tmp = 0;
            }else {
                tmp += 1;
                score[i] = tmp;
            }
        }
        return score;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] nums = new int[num];

        for(int i = 0; i < num; i++){
            nums[i] = kb.nextInt();
        }
        System.out.println(T.solution(num,nums));
    }
}
