class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;

        for (int i = 0; i < k; i++){
            sum += nums[i];
        }
        double maxAvg = (double)sum / k;
        for(int i = k; i < n; i++){
            sum += nums[i] - nums[i - k];
            double avg = (double)sum / k;
            maxAvg = Math.max(avg, maxAvg);
        }
        return maxAvg;
    }
}