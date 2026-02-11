class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++){
            int start = i + 1, end = nums.length - 1;

            if(i > 0 && nums[i] == nums[i - 1]) continue;

            while (start < end){
                int sum = nums[start] + nums[end];
                if(sum == -nums[i]){
                    List<Integer> lst = new ArrayList<>(Arrays.asList(nums[i], nums[start], nums[end]));
                    result.add(lst);
                    start++;
                    end--;
                    while(start < end && nums[start] == nums[start - 1]) start++;
                    while(start < end && nums[end] == nums[end + 1]) end--; 
                }
                else if(sum < -nums[i]) start++;
                else end--;
            }
        }

        return result;
    }
}