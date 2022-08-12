package 없는_숫자_더하기;

import java.util.ArrayList;

public class Main {
    public int solution(int[] numbers) {
        int answer = 0;
        ArrayList<Integer> num = new ArrayList<>();
        for(int i=0;i<10;i++){ //ArrayList에 0~9까지 담기
            num.add(i);
        }

        for(int i=0;i<numbers.length;i++){
            num.remove(num.indexOf(numbers[i])); //
        }
        for (Integer n : num) {
            answer+=n;
        }
        return answer;
    }
    public int solution2(int[] numbers) {
        int answer = 45;
        for (int num : numbers) {
            answer -= num;
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        int[] numbers1 = {1, 2, 3, 4, 6, 7, 8, 0};
        int[] numbers2 = {5, 8, 4, 0, 6, 7, 9};
        System.out.println(T.solution2(numbers1));
        System.out.println(T.solution2(numbers2));
    }
}
