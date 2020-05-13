import java.util.HashMap;
import java.util.Map;

public class test859 {
    public boolean buddyStrings(String A, String B) {
        char[] chars1 = A.toCharArray();
        char[] chars2 = B.toCharArray();
        int num = 0;
        int h = 0;
        char[] chars3 = new char[2];
        char[] chars4 = new char[2];
        if (chars1.length != chars2.length) {
            return false;
        }
        for (int i = 0; i < chars1.length; i++) {

            if (chars1[i] != chars2[i]) {
                if (num < 2) {
                    num++;
                    chars3[num - 1] = chars1[i];
                    chars4[num - 1] = chars2[i];
                } else {
                    return false;
                }
            }

        }

        if (chars1.length < 27) {
            for (int a = 0; a < chars1.length; a++) {
                for (int b = 0; b < chars1.length; b++) {
                    if (chars1[a] == chars1[b]) {
                        h++;
                        break;
                    }
                }
            }
        } else {
            for (int a = 0; a < 27; a++) {
                for (int b = 0; b < 27; b++) {
                    if (chars1[a] == chars1[b]) {
                        h++;
                        break;
                    }
                }
            }
        }

        if (chars3[0] == chars4[1] && chars3[1] == chars4[0] && num == 2) {
            return true;
        } else if (num == 0 && h != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        test859 t = new test859();
        t.buddyStrings("abcd", "abdc");
    }
}

