package 인프런.임시반장_정하기_11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * 해당 알고리즘을 통해 배운것
 * 문제에서 ~ 에서 가장 큰 값을 구하라 이런것은 굳이 map으로 멤버들의 갯수를 담을 필요가 없다
 * "수가 가장 큰 사람을 구하세요"라고 했을 때 max초기값을 0으로 하면 안된다. 왜냐하면
 * max보다 크면 해당 max를 member[i]로 바꿔줘야하는데 모든 member가 0일 수도 있기때문이다.
 * 따라서 학생들중 가장 큰 수라고 하는 문제를 해결 해야할 때 max는 Integer.MIN_VALUE이다.
 * 가장 큰 값을 구하되 같으면 작은 곳을 먼저 출력하라 같은 경우는
 * if(cnt>max){
 *  max=cnt;
 *  answer=i;
 * }
 * 와 같이 해결하면된다. 즉 앞에서 나온 max와 뒤에서 나온 max일때
 * 뒤에서 나온 max는 max보다 크지 못하기때문에 answer을 바꿔주지 못한다.
 * 결과적으로 가장 빨리나온 max가 answer이 된다.
 * 즉-> 따로 먼저 나온 max를 구하기 위해 로직을 짤 필요가 없다.
 *
 *
 */
public class Main {
    public int solution3(int n, int[][] arr){ //인프런코드
        int answer=0, max=0;
        for(int i=1; i<=n; i++){
            int cnt=0;
            for(int j=1; j<=n; j++){
                for(int k=1; k<=5; k++){
                    if(arr[i][k]==arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt>max){
                max=cnt;
                answer=i;
            }
        }
        return answer;
    }
    public int solution2(int studentNum, int[][] studentArray, int grade) {
        int answer = 0;
        int maxCnt=0;
        int[] cntArray = new int[studentNum];
        for (int i = 0; i < studentNum; i++) {
            int cnt = 0;
            for (int j = 0; j < studentNum; j++) {
                for (int k = 0; k < grade; k++) {
                    if (studentArray[i][k] == studentArray[j][k]) {
                        cnt++;

                        break;
                    }
                }
            }
            cntArray[i]=cnt;
            if (cnt > maxCnt) {
                maxCnt = cnt;
            }
        }
        for (int i = 0; i < studentNum; i++) {
            if(cntArray[i] == maxCnt){
                answer = i+1;
                break;
            }
        }
        return answer;
    }
    public int solutionV2(int studentNum, int[][] studentArray, int grade) {
        int answer =0;
        //studentGradeOverlapMap:
        HashMap<Integer, Integer>  studentGradeOverlapMap = new HashMap<>();
        for (int i = 1; i <= studentNum; i++) {
            studentGradeOverlapMap.put(i, 0);
        }
        for (int i = 0; i < studentNum; i++) {
            for (int j = 0; j < studentNum; j++) {
                for (int k = 0; k < grade; k++) {
                    if(i==j){
                        continue;
                    }
                    if(studentArray[i][k] == studentArray[j][k]){
                        studentGradeOverlapMap.put(i+1, studentGradeOverlapMap.get(i+1) + 1);
                        break;
                    }
                }
            }
        }
        Iterator<Map.Entry<Integer, Integer>> iterator = studentGradeOverlapMap.entrySet().iterator();
        int max = Integer.MIN_VALUE;
        while (iterator.hasNext()) {
            int key = iterator.next().getKey();
            int value = studentGradeOverlapMap.get(key);
            if (value > max) {
                max = value;
                answer = key;
            }
        }
        return answer;
    }

    public int solution(int studentNum, int[][] studentArray, int grade) {
        int answer =0;
        //studentGradeOverlapMap:
        HashMap<Integer, Integer>  studentGradeOverlapMap = new HashMap<>();
        for (int i = 1; i <= studentNum; i++) {
            studentGradeOverlapMap.put(i, 0);
        }
        for (int i = 0; i < studentNum; i++) {
            for (int j = 0; j < studentNum; j++) {
                for (int k = 0; k < grade; k++) {
                    if(i==j){
                        continue;
                    }
                    if(studentArray[i][k] == studentArray[j][k]){
                        studentGradeOverlapMap.put(i+1, studentGradeOverlapMap.get(i+1) + 1);
                        break;
                    }
                }
            }
        }
        Iterator<Map.Entry<Integer, Integer>> iterator = studentGradeOverlapMap.entrySet().iterator();
        int max = 0;
        while (iterator.hasNext()){
            int key =iterator.next().getKey();
            int value = studentGradeOverlapMap.get(key);
            if (value > max) {
                max = value;
            }

//            int key = iterator.next().getKey();
//            int deleteOverlapValue = studentGradeOverlapMap.get(key) / 2;
//            studentGradeOverlapMap.put(key,deleteOverlapValue);


//            if(max < deleteOverlapValue){
//                max = deleteOverlapValue;
//                answer = iterator.next().getKey();
//            }
        }
        int min = studentNum;
        for (Integer key : studentGradeOverlapMap.keySet()) {
            if(max==studentGradeOverlapMap.get(key)){
                if (min > key) {
                    min = key;
                }
            }
        }
        answer = min;
        return answer;
    }
    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int grade = 5;
        int[][] studentArray = new int[num][grade];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < grade; j++) {
                studentArray[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solutionV2(num, studentArray,grade));

    }
}
