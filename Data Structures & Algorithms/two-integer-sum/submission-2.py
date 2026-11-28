class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        result_dict = {}
        for i in range(len(nums)):
            compliment = target-nums[i]
            if nums[i] in result_dict:
                return [result_dict.get(nums[i]), i]
            result_dict[compliment] = i
        return []

        