class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result_dict = {}
        for word in strs:
            sorted_word = tuple(sorted(word))
            if sorted_word in result_dict:
                result_dict[sorted_word].append(word)
            else:
               result_dict[sorted_word] = [word] 

        return list(result_dict.values())
            