package Fifth_Week.Monday;

public class Sort {

    public static int quick_sort(int[] array, int low, int high) {
        int b = array[low];
        int i = low;
        int j = high;
        while (i != j) {
            while (array[j] > b && i < j) {
                j--;
            }
            while (array[i] <= b && i < j) {
                i++;
            }

            if (i < j) {
                int t = array[i];
                array[i] = array[j];
                array[j] = t;
            }
        }
        array[low] = array[j];
        array[j] = b;
        return j;
    }


    public int[] binary_tSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];//待插入到前面有序序列的值
            int left = 0;//有序序列的左侧
            int right = i - 1;//有序序列的右侧
            int middle = 0;//有序序列的中间
            while (left <= right) {
                middle = (left + right) / 2;//赋值
                if (temp < array[middle]) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }
            for (int j = i - 1; j >= left; j--) {
                //从i-1到left依次向后移动一位,等待temp值插入
                array[j + 1] = array[j];
            }
            if (left != i) {
                array[left] = temp;
            }
        }
        return array;
    }

    public static void select_Sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int k = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[k]) {
                    k = j;
                }
            }

            if (k > i) {
                int tmp = array[i];
                array[i] = array[k];
                array[k] = tmp;
            }
        }
    }
}
