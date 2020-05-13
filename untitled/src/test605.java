public class test605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int num = 0;
        int one_num = 0;
        int a = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) {
                one_num++;
                for (int j = i + 2; j < flowerbed.length; j++) {
                    if (flowerbed[j] == 1) {
                        a = j - i - 1;
                        i = j ;
                        if (a % 2 == 1 && a / 2 > 0) {
                            num = num + a / 2;
                        } else if (a % 2 == 0 && a / 2 > 1) {
                            num = num + a / 2 - 1;
                        }
                    }
                }
            }
        }


        if (flowerbed[0] == 0 && one_num >=1) {
            for (int k = 0; k < flowerbed.length; k++) {
                if (flowerbed[k] == 1) {
                    a = k;
                    num = num + a / 2;
                    break;
                }
            }
        }else if (flowerbed[0]==0&&one_num==0){
            a=flowerbed.length;
            if(a%2==1){
                num=a/2+1;
            }else{
                num=a/2;
            }
        }

        if (flowerbed[flowerbed.length - 1] == 0) {
            for (int i = flowerbed.length - 1; i >= 0; i--) {
                if (flowerbed[i] == 1) {
                    a = flowerbed.length - i - 1;
                    if (a / 2 > 0) {
                        num = num + a / 2;
                    }
                    break;
                }
            }
        }
        if (num >= n) {
            return true;
        } else {
            return false;
        }
    }
}
