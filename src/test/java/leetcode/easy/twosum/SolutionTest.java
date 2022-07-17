package leetcode.easy.twosum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static leetcode.utils.TestUtils.arr;
import static leetcode.utils.TestUtils.testCase;
import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private static Stream<Arguments> testCases() {
        return Stream.of(
                testCase(arr(1, 2), 3, (arr(0, 1))),
                testCase(arr(3, 2, 4), 6, arr(1, 2)),
                testCase(arr(2, 7, 11, 15), 9, arr(0, 1))
        );
    }

    @ParameterizedTest
    @MethodSource(value = "testCases")
    void test(int[] nums, int target, int[] result) {
        assertThat(new Solution().twoSum(nums, target)).isEqualTo(result);
    }

}