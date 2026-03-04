class Solution:
    def reverseVowels(self, s: str) -> str:
        vow: set = set('aeiouAEIOU')

        chL: int = 0
        chR: int = len(s) - 1

        sList = list(s)

        while chL < chR:
            if sList[chL] not in vow:
                chL += 1
                continue
            if sList[chR] not in vow:
                chR -= 1
                continue

            sList[chL], sList[chR] = sList[chR], sList[chL]
            chL += 1
            chR -= 1

        return "".join(sList)
            
