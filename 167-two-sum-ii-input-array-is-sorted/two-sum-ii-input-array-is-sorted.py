class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        left: int = 0
        right: int = len(numbers) - 1

        while left < right:
            res: int = numbers[left] + numbers[right]
            if res == target:
                return [left + 1, right + 1]
            elif res < target:
                left += 1
            else:
                right -= 1


        return [0,0]