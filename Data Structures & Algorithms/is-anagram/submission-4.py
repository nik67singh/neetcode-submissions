class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        result_dict = {}
        for char in s:
            result_dict[char]=result_dict.get(char,0)+1
        for char in t:
            if char in result_dict and result_dict.get(char)!=0:
                result_dict[char]=result_dict.get(char)-1
            else:
                return False
        for value in result_dict.values():
            if value!=0:
                return False
            else:
                return True


            