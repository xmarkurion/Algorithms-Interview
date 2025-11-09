# You are given two non-negative integers num1 and num2.

# In one operation, if num1 >= num2, you must subtract num2 from num1, otherwise subtract num1 from num2.
#     For example, if num1 = 5 and num2 = 4, subtract num2 from num1, thus obtaining num1 = 1 and num2 = 4. However, if num1 = 4 and num2 = 5, after one operation, num1 = 4 and num2 = 1.

# Return the number of operations required to make either num1 = 0 or num2 = 0.

class Solution:
    """
    Given two non-negative integers num1 and num2, this function returns the number of operations required to make either num1 or num2 equal to zero.
    The operation consists of subtracting the smaller number from the larger one until one of them becomes zero.
    Args:
        num1 (int): The first non-negative
        num2 (int): The second non-negative integer
    Returns:
        int: The number of operations required to make either num1 or num2 equal to zero

    Examples:
        >>> s = Solution()
        >>> s.countOperations(2, 3)
        3
        >>> s.countOperations(10, 10)
        1
        >>> s.countOperations(0, 5)
        0
    """
    def countOperations(self, num1: int, num2: int) -> int:
        flag = True
        counter = 0
        while(flag):
            if num1 <= 0 or num2 <= 0:
                flag = False
                break
            if num1 >= num2:
                num1 = num1 - num2
                counter += 1
            else:
                num2 = num2 - num1
                counter += 1 
        return counter
                
if __name__ == "__main__":
    import doctest
    doctest.testmod()
    # s = Solution()
    # print(s.countOperations(2,3))