#https://youtu.be/2Zgz8K3O5jc

nums = [3,1,2,1]

def minOperations(nums: list[int]) -> int:
        stack = []
        cnt = 0
        for num in nums:
            while stack and stack[-1] >num:
                stack.pop()
            if num == 0: continue
            if not stack or stack[-1] < num:
                cnt += 1
                stack.append(num)
        return cnt

print(minOperations(nums))