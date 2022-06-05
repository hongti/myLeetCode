package zht.leetcode.s478;

import java.util.Random;

public class Solution {
    public Random random;
    public double radius;
    public double x;
    public double y;

    public Solution(double radius, double x_center, double y_center) {
        this.radius = radius;
        this.x = x_center;
        this.y = y_center;
        this.random = new Random();
    }

    public double[] randPoint() {
        while (true) {
            double x = random.nextDouble() * 2 * radius - radius;
            double y = random.nextDouble() * 2 * radius - radius;
            if (x * x + y * y <= radius * radius) {
                return new double[]{this.x + x, this.y + y};
            }
        }
    }
}
