class Solution {
    public int[] sortedSquares(int[] nums) {
        int p1 = 0, p2 = nums.length - 1;
        int p3 = p2;
        int[] newNums = new int[p2 + 1];
        while(p1 <= p2){
            int sqr1 = nums[p1] * nums[p1];
            int sqr2 = nums[p2] * nums[p2];
            if(sqr1 < sqr2){
                newNums[p3] = sqr2;
                p2--;
            } else{
                newNums[p3] = sqr1;
                p1++;
            }
            p3--; 
        }

        return newNums;
    }
}