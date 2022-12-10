package leetcode.easy.strings.reverse;

public class Solution {
    public void reverseString(char[] s) {
        int last = s.length - 1;
        int middle = last / 2;

        for (int i = 0; i <= middle; i++) {
            char tmp = s[i];
            s[i] =  s[last - i];
            s[last - i] = tmp;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] string = {'a', 'b', 'c', 'd'};
        solution.reverseString(string);

        System.out.println(string);
    }
}
