# max change first non 9 to 9
# min change first digit to 0

class Solution:
    """
    You are given an integer num. You know that Bob will sneakily remap one of the 10 possible digits (0 to 9) to another digit.
    Return the difference between the maximum and minimum values Bob can make by remapping exactly one digit in num.

    Args:
        num (int): Given number
    Returns:
        int: Modified number

    Examples:
        >>> s = Solution()
        >>> s.minMaxDifference(11891)
        99009
        >>> s.minMaxDifference(456)
        900
        >>> s.minMaxDifference(90)
        99
    """
    def minMaxDifference(self, num: int) -> int:
        s = str(num)
        
        # MAX: replace the leftmost digit that is not '9' with '9'
        max_no = s
        for digit in s:
            if digit != '9':
                max_no = s.replace(digit, '9')
                break
        
        #MIN
        digit_to_change = s[0]
        min_no = s.replace(digit_to_change, '0')

        return int(max_no) - int (min_no) 
    
if __name__ == "__main__":
    import doctest
    doctest.testmod()
    # s = Solution()
    # print(s.minMaxDifference(11891))