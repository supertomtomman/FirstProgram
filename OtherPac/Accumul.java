package OtherPac;

public class Accumul {
    public static String accum(String s) {
        String result="";

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {

                if (j == 0) {
                    result = result + s.toUpperCase().charAt(i);
                }
                if (j > 0) {

                    result = result + s.toLowerCase().charAt(i);
                }
            }
            result = result + "-";

        }

        return result.substring(0,result.length()-1);
    }
}
