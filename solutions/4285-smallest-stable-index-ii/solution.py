class Solution:
    def firstStableIndex(self, nums: list[int], k: int) -> int:
        n = len(nums)
        minS = [float('inf')]*n
        minS[n-1] = nums[n-1]
        # print(minS)
        for i in range(n-2, -1, -1):
            # print(i, nums[i], minS[i])
            if nums[i] < minS[i+1]:
                minS[i] = nums[i]
            else:
                minS[i] = minS[i+1]
                
        
        maxS = -1
        for i in range(0, n):
            if nums[i] > maxS:
                maxS = nums[i]
            if (maxS-minS[i]) <= k:
                return i

        return -1 

