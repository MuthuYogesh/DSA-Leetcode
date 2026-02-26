class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = ''.join(c for c in s if c.isalnum()).lower()
        
        n: int = len(s)
        right: int = n - 1

        for left in range(0, n):
            if(s[left] != s[right]): return False
            right -= 1
        
        return True