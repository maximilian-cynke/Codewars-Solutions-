package codewars;

import java.util.HashMap;

public class TenMinuteWalk {

    public static void main(String[] args) {

        System.out.println(solution(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));

    }

    private static boolean solution(char[] walk) {
        HashMap<Character, Integer> init = new HashMap<>();
        init.put('n', 0);
        init.put('e', 0);
        init.put('s', 0);
        init.put('w', 0);

        if (walk.length != 10) {
            return false;
        } else {
            for (char c : walk) {
                init.put(c, init.get(c) + 1);
            }
        }

        if(init.get('n') < init.get('s')){
            return false;
        }
        if(init.get('n') > init.get('s')){
            return false;
        }
        if(init.get('e') > init.get('w')){
            return false;
        }
        if(init.get('e') < init.get('w')){
            return false;
        }

        return true;

    }

}
