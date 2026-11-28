class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        result = {}
        for num in nums:
            result[num] = result.get(num,0)+1
        sorted_result = list(sorted(result.items(),key=lambda x:x[1], reverse=True))

        final_result = []
        for item in sorted_result[:k]:
            final_result.append(item[0])
        return final_result
        