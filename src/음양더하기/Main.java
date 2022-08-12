package 음양더하기;

public class Main {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        //absolutes.length==signs.length
        for (int i=0; i< absolutes.length; i++) {

                if (signs[i] == false) {
                    answer += absolutes[i] * (-1);
                } else {
                    answer += absolutes[i];
                }

        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};

        System.out.println(T.solution(absolutes,signs));
    }
}
