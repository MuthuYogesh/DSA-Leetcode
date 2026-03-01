class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        nums.sort()
        ans: list = []
        n: int = len(nums)
        for i in range(0, n):
            left: int = i+1
            right: int = n - 1

            if i > 0 and nums[i] == nums[i - 1]: continue

            while left < right:
                if nums[left] + nums[right] == -nums[i]:
                    ans.append([nums[i], nums[left], nums[right]])
                    left += 1
                    right -= 1
                    while nums[left] == nums[left - 1] and left < right: left += 1
                    while nums[right] == nums[right + 1] and left < right: right -= 1
                elif nums[left] + nums[right] > -nums[i]: right -= 1
                else: left += 1
                
        
        return ans