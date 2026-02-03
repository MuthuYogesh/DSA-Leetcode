class Solution {
    public int maxArea(int[] height) {
        int start = 0, end = height.length - 1;
        int maxArea = 0;
        while(start < end){
            int htMin = Math.min(height[start], height[end]);
            int curArea = htMin * (end - start);
            maxArea = Math.max(maxArea, curArea);

            while(height[start] <= htMin && start < end) start++;
            while(height[end] <= htMin && start < end) end--;
        }

        return maxArea;
    }
}