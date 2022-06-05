package zht.leetcode.s478;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Solution solution = new Solution(1.0, 0.0, 0.0);
        for (int i = 0; i < 30000; i++) {
            System.out.println(Arrays.toString(solution.randPoint()));
        }
    }
}
