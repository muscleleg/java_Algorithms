package 인프런.멘토링_12;


import java.util.HashSet;
import java.util.Scanner;
public class Main {

    //n : studentNum
    //m : testNum;
    public int solution2(int studentNum, int testNum, int[][] arr){
        int answer=0;
        int rankNum = studentNum;
        for(int mentor=1; mentor<=studentNum; mentor++){
            for(int menti=1; menti<=studentNum; menti++){
                int cnt=0;
                for(int tNum=0; tNum<testNum; tNum++){
                    int mentorRank=0, mentiRank=0;
                    for(int rNum=0; rNum<rankNum; rNum++){
                        if(arr[tNum][rNum]==mentor) mentorRank=rNum;
                        if(arr[tNum][rNum]==menti) mentiRank=rNum;
                    }
                    if(mentorRank<mentiRank) cnt++;
                }
                if(cnt==testNum){
                    answer++;
                    //System.out.println(i+" "+j);
                }
            }
        }
        return answer;
    }
    public int solution (int studentNum, int testNum, int[][] arrayForMentoring) {
        int rank = studentNum;
        int answer = 0;
            for(int student = 1; student <= studentNum; student++) {
                String tmp="";
                HashSet<Integer> availablePair = new HashSet<>();
                for (int tNum = 0; tNum < testNum; tNum++) {
                    boolean target = false;
                    for (int rNum = 0; rNum < rank; rNum++) {
                        if(target==false){
                            if(availablePair.contains(arrayForMentoring[tNum][rNum])) availablePair.remove(arrayForMentoring[tNum][rNum]);
                        }
                        if(arrayForMentoring[tNum][rNum]==student){
                            target = true;
                            continue;
                        }
                        if (target && tNum==0) availablePair.add(arrayForMentoring[tNum][rNum]);
                    }
                    if(availablePair.size()==0) break;
                }
                answer+=availablePair.size();
//                System.out.println("k = " + k + " cnt = " + cnt);
            }
//        System.out.println("최대 경우의 수 : " + answer);

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int studentNum = kb.nextInt();
        int testNum = kb.nextInt();
        int[][] arrayForMentoring = new int[testNum][studentNum];
        for (int i = 0; i < testNum; i++) {
            for (int j = 0; j < studentNum; j++) {
                arrayForMentoring[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(studentNum,testNum,arrayForMentoring));
    }

}
