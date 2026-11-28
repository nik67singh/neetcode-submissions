class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        result_dict = {}
        for char in s:
            result_dict[char]=result_dict.get(char,0)+1
        for char in t:
            if char not in result_dict or result_dict.get(char)==0:
                return False
            result_dict[char]-=1
        return True



            