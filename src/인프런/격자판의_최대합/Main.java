package 인프런.격자판의_최대합;

import java.util.Scanner;

public class Main {

    public int solution1(int num, int[][] nums) {
        int answer=Integer.MIN_VALUE;
        int sum1,sum2;
        for (int i = 0; i < num; i++) {
            sum1=sum2=0;
            for (int j = 0; j < num; j++) {
                sum1 += nums[i][j];
                sum2 += nums[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1=sum2=0;
        for (int i = 0; i < num; i++) {
            sum1 += nums[i][i];
            sum2 += nums[i][(num-1)-i];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);
        return answer;
    }

    public int solution(int num, int[][] nums) {
        int horizonMax = horizonMax(num, nums);
        int verticalMax = verticalMax(num, nums);
        int rightDownDiagonal = rightDownDiagonal(num, nums);
        int leftDownDiagonal = leftDownDiagonal(num, nums);
        return isMax(horizonMax,verticalMax,rightDownDiagonal,leftDownDiagonal);
    }

    public int isMax(int... num) {
        int max = 0;
        for (int i : num) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    public int leftDownDiagonal(int num, int nums[][]) {
        int leftDownDiagonal = 0;
        for (int i = 0; i < num; i++) {
            leftDownDiagonal += nums[(num-1)-i][(num-1)-i];
        }
        return leftDownDiagonal;

    }
    public int rightDownDiagonal(int num, int nums[][]) {
        int rightDownDiagonal = 0;
        for (int i = 0; i < num; i++) {
            rightDownDiagonal += nums[i][i];
        }
        return rightDownDiagonal;
    }
    public int verticalMax(int num, int nums[][]) {
        int max = 0;
        for (int i = 0; i < num; i++) {
            int tmp = 0;
            for (int j = 0; j < num; j++) {
                tmp+=nums[j][i];
            }
            if(max<tmp){
                max = tmp;
            }
        }
        return max;
    }
    public int horizonMax(int num, int nums[][]) {
        int max = 0;

        for (int i = 0; i < num; i++) {
            int tmp = 0;
            for (int j = 0; j < num; j++) {
                tmp+=nums[i][j];
            }
            if(max<tmp){
                max = tmp;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[][] nums = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                nums[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(num,nums));
    }
}
