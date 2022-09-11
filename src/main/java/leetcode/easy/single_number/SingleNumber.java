package leetcode.easy.single_number;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 *
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 *
 * Constraints:
 *      1 <= nums.length <= 3 * 10^4
 *      -3 * 10^4 <= nums[i] <= 3 * 10^4
 *      Each element in the array appears twice except for one element which appears only once.
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                set.remove(num);
            }
        }

        return set.stream().findFirst().orElse(nums[0]);
    }

    // using bit manipulation
    public int singleNumber2(int[] nums) {
        int answer = 0;

        for (int num : nums) {
            answer ^= num;
        }

        return answer;
    }
}
