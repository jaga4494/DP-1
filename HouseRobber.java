class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        
        if (n == 1) {
            return nums[0];
        }

        int robbed[] = new int[n];

        robbed[0] = nums[0];
        robbed[1] = Math.max(nums[0], nums[1]);

        /**
         * 0 1 2 3 4
         * 2,7,9,3,1
         * 
         * 2 7 
         * 
         */
        for (int i = 2; i < n; ++i) {
            robbed[i] = Math.max(robbed[i - 1], nums[i] + robbed[i - 2]);
        }

        return robbed[n - 1];

    }
}