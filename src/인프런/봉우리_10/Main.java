package 인프런.봉우리_10;

import java.util.Scanner;

public class Main {
    public int solution2(int num, int[][] map) {
        int answer = 0;
        /**
         * dx로 for문을 돌려서 좌,우,상,하를 확인하여 값을 확인 할것임
         *       좌  우 상  하
         * dx = {-1, 1, 0, 0}
         * dy = { 0, 0,-1, 1}
         * 조건문:
         * (x >= 0 && x < num && y >= 0 && y < num && map[x][y] >= map[i][j])
         * 조건문은 좌,우,상,하를 탐색할 때 outOfIndex를 방지하는 조건과 대상이되는 map[i][j]보다 큰 값이 있을 때
         * dx,dy 루프를 멈춘다. 왜 작은 값으로 필터링을 하지않고 큰 값으로 필터링을 하는 이유는
         * 우리가 찾는 값은 기준 map[i][j]가 상하좌우 보다 전부 클 경우를 찾는 것이기 때문에
         * 상하좌우 모두 작은 값을 확인 위해서는 모든 루프를 돌면서 기준 map[i][j]보다 큰 것을 확인해야 하는 반면
         * 큰 경우만 찾으면 그 순간 조건에 부합하지 않기때문에 루프를 멈춰도 된다.
         */
        int[] dx = {-1, 1, 0, 0};
        int[] dy = { 0, 0,-1, 1};
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int x = i + dx[k];
                    int y = j + dy[k];
                    if(x >= 0 && x < num && y >= 0 && y < num && map[x][y] >= map[i][j]){
                        flag = false;
                        break;
                    }
                }
                if (flag == true) {
                    answer+=1;
                }
            }
        }
        return answer;

    }

    /**
     * 좋은 코드가 아니다.
     * 일단 가장자리를 만드는건 비효율적이였다.
     * if문을 4개를 쓰는것도 비효율적이다.
     */
    public int solution(int num, int[][] map) {
        int answer = 0 ;
        int initNum=num+2;
        int[][] initMap = new int[initNum][initNum];
        //==격자판 가장자리 0으로 초기화==//
        for(int i = 1; i < initNum - 1; i++){
            for (int j = 1; j < initNum - 1; j++) {
                initMap[i][j] = map[i-1][j-1];
            }
        }

        for(int i = 1; i < initNum - 1; i++){
            for (int j = 1; j < initNum - 1; j++) {
                //좌
                if( !(initMap[i][j] > initMap[i - 1][j]) ){
                    continue;
                }
                //우
                if( !(initMap[i][j] > initMap[i + 1][j]) ){
                    continue;
                }
                //상
                if( !(initMap[i][j] > initMap[i][j-1]) ){
                    continue;
                }
                //하
                if( !(initMap[i][j] > initMap[i][j+1]) ){
                    continue;
                }
                answer+=1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int num = kb.nextInt();
        int[][] map = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                map[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.solution(num, map));


    }
}
