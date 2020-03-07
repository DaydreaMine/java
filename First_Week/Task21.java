//  有30个0~9之间的数字，分别统计0~9这10个数字分别出现了多少次
//0  1  2  3  4  5  6  7  8  9
class Task21 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int num = 0;
        for (int i = 0; i < 30; i++) {
            num = (int) (Math.random() * 10 + 1);
            System.out.print(num + " ");
            for (int k = 0; k < 10; k++) {
                if (num == k + 1) {
                    arr[k]++;
                }
            }
        }
        System.out.println();

        for (int j = 0; j < 10; j++) {
            System.out.println(j + 1 + "出现" + arr[j] + "次");
        }
    }
}