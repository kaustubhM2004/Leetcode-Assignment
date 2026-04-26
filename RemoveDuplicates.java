import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;

        for (int num : nums) {
            if (k == 0 || num != nums[k - 1]) {
                nums[k++] = num;
            }
        }

        return k;
    }
}

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int k = new Solution().removeDuplicates(nums);

        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}