public class test27 {
    public int removeElement(int[] nums, int val) {
        int i =0;
        int a =0;
        int n  = nums.length;
        while (i<n){
            if (nums[i]==val){
                for (int k=i;k<n-1;k++){
                    a = nums[k];
                    nums[k]=nums[k+1];
                    nums[k+1]=a;
                }
                n--;
            }else {
                i++;
            }
        }
        return i;
    }
}
