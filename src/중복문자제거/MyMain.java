package 중복문자제거;
import java.util.*;

public class MyMain {
    public  Set<String> solution(String str){
        char[] ch = str.toCharArray();
        Set<String> set = new LinkedHashSet<>();
        for(char x : ch){
            set.add(String.valueOf(x));
        }

        return set;
    }
    public static void main(String[] args){
        MyMain T = new MyMain();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        Set<String> set = T.solution(str);
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
    }
}
