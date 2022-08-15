package leetcode.easy.palindrome_number;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution;
    Solution2 solution2;
    Solution3 solution3;

    @BeforeEach
    void setUp() {
        solution = new Solution();
        solution2 = new Solution2();
        solution3 = new Solution3();
    }

    @Test
    void test() {
        assertTrue(solution.isPalindrome(1));
        assertTrue(solution.isPalindrome(121));
        assertFalse(solution.isPalindrome(10));
        assertFalse(solution.isPalindrome(-121));
    }

    @Test
    void test2() {
        assertTrue(solution2.isPalindrome(1));
        assertTrue(solution2.isPalindrome(121));
        assertFalse(solution2.isPalindrome(10));
        assertFalse(solution2.isPalindrome(-121));
    }

    @Test
    void test3() {
        assertTrue(solution3.isPalindrome(1));
        assertTrue(solution3.isPalindrome(121));
        assertTrue(solution3.isPalindrome(1234321));
        assertFalse(solution3.isPalindrome(10));
        assertFalse(solution3.isPalindrome(-121));
    }
}