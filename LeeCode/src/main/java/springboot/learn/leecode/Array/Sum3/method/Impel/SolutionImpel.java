package springboot.learn.leecode.Array.Sum3.method.Impel;

import springboot.learn.leecode.Array.Sum3.method.Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>Title: SolutionImpel$</p >
 * <p>Description: TODO(用一句句话描述该文件做什么) </p >
 * <p>Copyright: Copyright (c) $</p >
 * <p>Company: inspur </p >
 *
 * @author WangZhongming
 * @version 1.0
 * @createtime $ $
 */

public class SolutionImpel implements Solution {
    @Override
    public List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        if(length < 3){
            return result;
        }
        /**
         * 数组排序 ： 内置函数
         * 记住该函数：Arrays.sort掌握会用
         */
//        Arrays.sort(nums);
        sort(nums);

        /**
         * 动态规划：三个变量、固定一个变量+双指针（从头、尾 开始）
         */
        for(int i=0;i< length;i++){
            if(nums[0] > 0){
                return result;
            }
            //这里一会考虑分析：
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            //双指针思想：left、right
           int left,right;
            left = i + 1;
            right = length -1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum < 0){
                    left ++;
                }else if(sum > 0){
                    right --;
                }else {
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
//                    List<Integer> temp = new ArrayList<>();
//                    temp.add(nums[i]);
//                    temp.add(nums[left]);
//                    temp.add(nums[right]);
//                    result.add(temp);
                    /**
                     * 这里由于已经固定一个了，但是 再有一个相同，则另一个也必定相同：重复要求，则直接跳过
                     * 同时以前指针小于后指针来控制  边界
                     */
                    while(left < right && nums[right] == nums[right - 1]){
                        right --;
                    }
                    while (left < right && nums[left] == nums[left + 1]){
                        left ++;
                    }
                    left ++;
                    right --;
                }
            }

        }
        return result;
    }

    /**
     * 写一个数组的排序函数
     */
    public void sort(int[] nums){
        int length = nums.length;
        int swap;
        int[] temp = new int[length];
        //冒泡法
        for(int i = 0; i< length;i++){
            for(int j = i;j< length;j++){
                if(nums[i] > nums[j]){
                    swap = nums[j];
                    nums[j] = nums[i];
                    nums[i] = swap;
                }
            }
        }

    }
}
