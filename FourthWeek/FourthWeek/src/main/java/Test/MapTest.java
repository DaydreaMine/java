package Test.Test1;

import java.util.HashMap;

public class MapTest {

    public static void main(String[] args) {
        HashMap<Object,Integer> map = new HashMap();
        String strings = "123, 456, 789, 123, 456";

        char[] chars = strings.toCharArray();

        for (int i =0;i<chars.length;i++){
           map.put(chars[i],map.containsKey(chars[i])?map.get(chars[i])+1:1);
        }

        System.out.println(map);

        StringBuilder sb = new StringBuilder();
        for (HashMap.Entry<Object, Integer> en: map.entrySet()) {
            Object key = en.getKey();
            int value = en.getValue();
            sb.append(key).append("出现").append(value).append("次").append(",");
        }
        System.out.println(sb.substring(0, sb.length()-1));


    }
}
