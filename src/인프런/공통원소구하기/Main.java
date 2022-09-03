package 인프런.공통원소구하기;

import java.util.*;

public class Main {
    public HashMap<Integer,Integer> solution2(int num1, int[] nums1, int num2, int[] nums2) {
        HashMap<Integer, Integer> num1Map = new HashMap<>();
        HashMap<Integer, Integer> answer = new HashMap<>();
        for (int i : nums1) {
            num1Map.put(i, i);
        }
        for (int i : nums2) {
            if (num1Map.containsKey(i)) {
                answer.put(i, i);
            }
        }

       return answer;
    }
    //느림
    public ArrayList<Integer> solution(int num1, int[] nums1, int num2, int[] nums2) {
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                if (nums1[i] == nums2[j]) {
                    answer.add(nums1[i]);
                    break;
                }
            }
        }
        answer.sort(Comparator.naturalOrder());
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        int[] nums1 = new int[num1];
        for (int i = 0; i < num1; i++) {
            nums1[i] = kb.nextInt();
        }
        int num2 = kb.nextInt();
        int[] nums2 = new int[num2];
        for (int i = 0; i < num2; i++) {
            nums2[i] = kb.nextInt();
        }

        HashMap<Integer, Integer> map = T.solution2(num1, nums1, num2, nums2);

        ArrayList<Map.Entry<Integer,Integer>> answer = new ArrayList<>(map.entrySet());
        answer.sort(Map.Entry.comparingByValue());
        for (Map.Entry<Integer, Integer> i : answer) {
            System.out.print(i.getValue()+" ");
        }

    }
}
