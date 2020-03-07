//定义一个数组,数组成员10个,找出数组中最大数连同下标一起输出
class Task17 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 100 + 1);
            arr[i] = num;
        }

        int max = arr[0];
        for (int j = 0; j < 10; j++) {
            max = (max > arr[j]) ? max : arr[j];
        }
        System.out.println("最大值为：" + max);

        for (int k = 0; k < 10; k++) {
            if (max == arr[k]) {
                System.out.println(max + "下标为：" + k);
            }
        }
    }
}