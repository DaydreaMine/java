import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test475 {
        public int findRadius(int[] houses, int[] heaters) {
            // Arrays.sort(houses);
            Arrays.sort(heaters);
            int[] houseMin = new int[houses.length];
            int max=0;
            int num=0;
            for (int i=0;i<houses.length;i++){
                int length=Math.abs(houses[i]-heaters[0]);
                for (int j =0;j<heaters.length;j++){
                    num = Math.abs(houses[i]-heaters[j]);
                    if (length>=num){
                        length=num;
                    }else {
                        break;
                    }
                }
                max=(max>length)?max:length;
            }
            return max;
        }
}
