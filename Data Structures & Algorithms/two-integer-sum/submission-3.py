class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        result_dict = {}
        for i in range(len(nums)):
            compliment = target-nums[i]
            if compliment in result_dict:
                return [result_dict.get(compliment), i]
            result_dict[nums[i]] = i
        return []

        