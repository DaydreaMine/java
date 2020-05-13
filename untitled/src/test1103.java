import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test1103 {
    public int[] distributeCandies(int candies, int num_people) {
        int num = 0;
        int[] ints = new int[num_people];
        boolean flag=true;
        while (flag) {
            for (int i = 0; i < num_people; i++) {
                if (candies >num) {
                    num++;
                    ints[i] = num + ints[i];
                    candies = candies - num;
                }else  {
                    ints[i]=ints[i]+candies;
                    candies=0;
                    break;
                }
            }
            if (candies == 0) {
                flag=false;
            }
        }
        return ints;
    }
}
