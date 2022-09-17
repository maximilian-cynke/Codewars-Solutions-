package codewars;

# https://www.codewars.com/kata/54dc6f5a224c26032800005c

public class HelpTheBookseller {

    public static void main(String[] args) {
        String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String cd[] = new String[]{"A", "B"};
        System.out.println(solution(art, cd));
    }


    public static String solution(String[] art, String[] cd) {
        String sol = "";
        if (art.length == 0) {
            return "";
        }
        if (cd.length == 0) {
            return "";
        }
        for (String i : cd) {
            int j = 0;
            for (String s : art) {
                if ((s.charAt(0) + "").equals(i)) {
                    String[] s1 = s.split(" ");
                    j += Integer.parseInt(s1[1]);
                }
            }
            sol += "(" + i + " : " + j + ") - ";
        }
        return sol.substring(0, sol.length() - 3);


    }
}
