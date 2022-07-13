package springboot.learn.leecode.Sum3Closest.method.Impel;

import springboot.learn.leecode.Sum3Closest.method.Solution;

import java.util.Arrays;

public class SolutionImpel implements Solution {

    @Override
    public int threeSumClosest(int[] nums, int target) {
        /**
         * 与上一题类似：把targe看成 0 即可；
         */
        Arrays.sort(nums);
        int length = nums.length;
        Integer result =null;
        result = nums[0] + nums[1] + nums[2];
        //题目要求数组长度必须超过3
        for(int i =0;i< length;i++){
            if(i>0 && nums[i - 1] == nums[i]){
                //这一步其实可以不要，应为最后输出的三数和
                continue;
            }
            int left,right;
            left = i + 1;
            right   = length - 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                    result = (Math.abs(target - sum)) > Math.abs(target - result) ? result : sum;
                if(sum > target){
                    //其实这里也可以跳过相同的
                    while(left < right && nums[right] == nums[right - 1]){
                        right --;
                    }
                    right --;
                }else if(sum < target){
                    while(left < right && nums[left] == nums[left + 1]){
                        left ++;
                    }
                    left ++;
                }else {
                    return target;
                }
            }
        }
        return result;
    }
}
