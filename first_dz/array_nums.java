package first_dz;

public class array_nums {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            if (nums[i] == val) {
                nums[i] = nums[j];
                nums[j] = val;
                j--;
            }
            else {
                i++;
            }
        }
        for (int k = 0; k < nums.length; k++) {
            
            System.out.println(nums[k] + " ");
        }
    }
}
