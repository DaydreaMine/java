public class test665 {
    public boolean checkPossibility(int[] nums) {
        int a = 1;
        if (nums.length == 0) {
            return false;
        } else if (nums.length <= 2) {
            return true;
        }

        if (nums[0] > nums[1]) {
            nums[0] = nums[1];
            a--;
        }

        if (nums[nums.length - 1] < nums[nums.length - 2]) {
            nums[nums.length - 1] = nums[nums.length - 2];
            a--;
        }
//比前一个数小，比较后一个数和前一个数
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                if (nums[i+1]>=nums[i-1]){
                    nums[i]=nums[i-1];
                }else {
                    nums[i+1]=nums[i];
                }
                a--;
            }
            if (a < 0) {
                return false;
            }
        }


        return true;


    }
}
