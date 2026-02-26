class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        left: int = 0
        n: int = len(nums)

        for right in range(0, n):
            if(nums[left] != nums[right]):
                nums[left + 1] = nums[right]
                left += 1
        
        return left + 1 ## since we are swaping elements at left + 1 at end left lands before last swap
        
