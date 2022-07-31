package 카카오_크레인;

public class Main {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        String bucket = "";
        boolean loop = true;
        for (int move : moves) {
            int moveLocation = move - 1;
            bucket = extractBucket(board, moveLocation, bucket);
        }

        while (loop) {
            for (int doll = 1; doll <= 100; doll++) {
                String dollOverlap="<"+String.valueOf(doll)+">"+"<"+String.valueOf(doll)+">";
                while (bucket.contains(dollOverlap)) {
                    bucket = bucket.replaceFirst(dollOverlap, "");
                    answer += 2;
                }
            }
            for(int doll = 1; doll <= 100; doll++){
                String dollOverlap=String.valueOf(doll)+","+String.valueOf(doll);
                if(bucket.contains(dollOverlap)){
                    loop=true;
                   break;
                }
                loop=false;
            }
        }
        System.out.println(bucket);
        return answer;
    }

    private String extractBucket(int[][] board, int moveLocation, String bucket) {
        for (int x = 0; x < board[0].length; x++) {
            if (board[x][moveLocation] != 0) {
                bucket += "<"+board[x][moveLocation]+">";
                board[x][moveLocation] = 0;
                return bucket;
            }
        }
        return bucket;

    }

    public static void main(String[] args) {
        Main T = new Main();
        int[][] board =
                {{0, 0, 0, 0, 0},
                        {0, 0, 1, 0, 3},
                        {0, 2, 5, 0, 1},
                        {4, 2, 4, 4, 2},
                        {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(T.solution(board, moves));
    }
}
