class Solution {
    public int[] twoSum(int[] nums, int target) {

        // 🔹 Optimal Approach: HashMap
        // Time Complexity: O(n)
        // Space Complexity: O(n)

        HashMap<Integer, Integer> map = new HashMap<>();
        // key → value (number → index)

        for (int i = 0; i < nums.length; i++) {

            int diff = target - nums[i];

            // 🔥 Check if complement exists
            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i };
            }

            // Store current number with its index
            map.put(nums[i], i);
        }

        // Problem guarantees a solution, but safe return
        return new int[] {};
    }
}