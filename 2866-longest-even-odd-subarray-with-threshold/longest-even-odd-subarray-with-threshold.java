class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int l = 0, cnt = 0;

        while (l < nums.length) {
            if (nums[l] % 2 == 0 && nums[l] <= threshold) {
                int i = l;

                while (i < nums.length && nums[i] <= threshold &&
                       (i == l || nums[i] % 2 != nums[i - 1] % 2)) {
                    i++;
                }

                cnt = Math.max(cnt, i - l);
                l = i;
            } else {
                l++;
            }
        }

        return cnt;
    }
}