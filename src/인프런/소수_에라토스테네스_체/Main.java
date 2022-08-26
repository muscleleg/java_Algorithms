package 인프런.소수_에라토스테네스_체;

import java.util.Scanner;

public class Main {
    public int solution1(int num) {
        int answer = 0;
        if(num==2){
            answer = 1;
        }else if(num==3){
            answer = 2;
        }else{
            answer=2;
//            System.out.println("num = " + 2);
//            System.out.println("num = " + 3);

            for (int i = 4; i <= num; i++) {
                if(i%2==0||i%3==0){
                    continue;
                }
                boolean isPrime = true;
                if(i % Math.sqrt(i) == 0){
                    continue;
                }
                for (int j = 2; j < Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime=false;
                        break;
                    }
                }
                if (isPrime == true) {
                    answer+=1;
//                    System.out.println(i);
                }
            }

        }
        return answer;
    }
    public int solution(int num) {
        int answer=0;
        int[] ch = new int[num + 1];
        for(int i=2;i<=num;i++) {
            if (ch[i] == 0) {
                for (int j = i; j <= num; j += i) {
                    ch[j] = 1;
                }
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        long beforeTime = System.currentTimeMillis();
        System.out.println(T.solution(num));
        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime);
        System.out.println("시간차이(m) : "+secDiffTime);
    }
}
