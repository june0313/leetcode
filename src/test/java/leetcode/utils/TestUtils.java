package leetcode.utils;

import org.junit.jupiter.params.provider.Arguments;

public class TestUtils {
    public static int[] arr(int... i) {
        return i;
    }

    public static Arguments testCase(Object... arguments) {
        return Arguments.of(arguments);
    }
}
