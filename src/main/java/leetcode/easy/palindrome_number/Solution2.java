package leetcode.easy.palindrome_number;

public class Solution2 {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while(x > 0) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        }

        return original == reversed;
    }
}
