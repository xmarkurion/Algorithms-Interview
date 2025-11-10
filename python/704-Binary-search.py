class Solution:
    
    """
    Given an array of integers nums which is sorted in ascending order, 
    and an integer target, write a function to search target in nums. 
    If target exists, then return its index. Otherwise, return -1.
    You must write an algorithm with O(log n) runtime complexity.

    Parameters:
        nums (list[int]): A list of integers sorted in ascending order.
        target (int): The integer to search for in the list.

    Examples:
        >>> s = Solution()
        >>> s.search([-1,0,3,5,9,12], 9)
        4
    """
    def search(self, nums: list[int], target: int) -> int:
        l, r = 0, len(nums) - 1
        while l <= r:
            # m = (l+r) // 2 
            m = l + (r-l) // 2 # To prevent potential overflow
            if nums[m] > target:
                r = m - 1
            elif nums[m] < target:
                l = m + 1
            else:
                return m
        return -1
    
if __name__ == "__main__":
    import doctest
    doctest.testmod()
    # s = Solution()
    # print(s.isValid("234Adas"))