package com.leecode.leecode001.twosum03;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 *  
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SumAlgo {

    public static void main(String[] args) {
        long first = System.currentTimeMillis();
        int target = 9;
        int[] nums = {2, 7, 11, 15};
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int j = target - nums[i];
            if (map.keySet().contains(j)) {
                System.out.println("[" +map.get(j) + "," + i + "]");
                long second = System.currentTimeMillis();
                System.out.println(second - first);
                return;
            }
            map.put(nums[i], i);
        }
    }
}
