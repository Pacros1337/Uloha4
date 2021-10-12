
package com.company;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int[] values = new int[]{100, 50, 20, 10, 5, 2, 1};
        System.out.println(solve(157, values));
    }

    public static Map<Integer, Integer> solve(int startingValue, int[] values) {
        Map<Integer, Integer> map = new LinkedHashMap();
        int remaining = startingValue;
        int[] var4 = values;
        int var5 = values.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            int currentValue = var4[var6];
            if (currentValue <= remaining) {
                map.put(currentValue, remaining / currentValue);
                remaining %= currentValue;
                if (remaining == 0) {
                    break;
                }
            }
        }

        return map;
    }
}
