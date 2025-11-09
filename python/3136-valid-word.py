class Solution:
    """
    Validate a word according to these rules:
    - Minimum length of 3 characters.
    - Contains only digits (0-9) and English letters (uppercase or lowercase).
    - Includes at least one vowel (a, e, i, o, u) and at least one consonant.

    Args:
        word (str): The input string to be validated
    Returns:
        bool: True if the word is valid, False otherwise

    Examples:
        >>> s = Solution()
        >>> s.isValid("234Adas")
        True
        >>> s.isValid("b3")
        False
        >>> s.isValid("abcde")
        True
        >>> s.isValid("a3$e")
        False
        >>> s.isValid("AhI")
        True
    """
    def isValid(self, word: str) -> bool:
        from string import ascii_lowercase
        #It contains a minimum of 3 characters.
        if len(word) < 3:
            return False
        
        # It contains only digits (0-9), and English letters (uppercase and lowercase).
        for char in word:
            if not( char.isdigit() or char.isalpha()):
                return False
        
        # Work in lowercase for vowel/consonant membership checks
        word_lower = word.lower()

        # It includes at least one vowel.
        vowels = "aeiou"
        if not any(ch in vowels for ch in word_lower):
            return False

        # It includes at least one consonant.
        consonants = "bcdfghjklmnpqrstvwxyz"
        if not any(ch in consonants for ch in word_lower):
            return False

        return True
    
if __name__ == "__main__":
    import doctest
    doctest.testmod()
    # s = Solution()
    # print(s.isValid("234Adas"))