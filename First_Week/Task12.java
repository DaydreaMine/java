//6.30以内的随机数,请输入任意一个数,循环10次,求这个数在随机数范围内出现的次数
class Task12 {
    public static void main(String[] args) {
        int[] arr = new int[30];
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 30 + 1);
            for (int j = 0; j < 30; j++) {
                if (j == num - 1) {
                    arr[j]++;
                }
            }
        }

        for (int k = 1; k < 31; k++) {
            if (arr[k - 1] != 0) {
                System.out.println(k + "出现" + arr[k - 1] + "次。");
            }
        }

    }
}