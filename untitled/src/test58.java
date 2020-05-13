import java.util.ArrayList;
import java.util.List;

public class test58 {
    public String reverseLeftWords(String s, int n) {

       //1
//        char[] chars = s.toCharArray();
//        char[] chars1= new char[n];
//        char[] chars2= new char[n];
//
//        for (int i =0;i<n-1;i++){
//            chars1[i]=chars[i];
//        }
//
//        for (int j=n;j<chars.length;n++){
//            chars2[j]=chars[j];
//        }
//        String s1 = new String(chars1);
//        String s2 = new String(chars2);
//        return s1+s2;
        //2
        return s.substring(n)+s.substring(0,n);

    }
}
