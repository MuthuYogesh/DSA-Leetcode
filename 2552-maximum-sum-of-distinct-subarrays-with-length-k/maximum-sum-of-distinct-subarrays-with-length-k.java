class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        long curSum = 0;

        HashMap <Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i < k; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
            curSum += nums[i];
        }

        if(mp.size() == k)
            maxSum = curSum;

        for(int i = k; i < nums.length; i++){
            curSum += nums[i] - nums[i - k];

            int temp = mp.get(nums[i - k]);

            if(temp == 1) mp.remove(nums[i - k]);
            else mp.put(nums[i - k], temp - 1);

            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);

            if(mp.size() == k)
                maxSum = Math.max(maxSum, curSum);
        }

        return maxSum ;
    }
}