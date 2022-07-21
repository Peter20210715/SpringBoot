package springboot.learn.leecode.Array.Sum3.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    /**
     * 排序 + 双指针
     * 本题的难点在于如何去除重复解。
     *
     * 算法流程：
     * 特判，对于数组长度 n，如果数组为 null 或者数组长度小于 3，返回 []。
     * 对数组进行排序。
     * 遍历排序后数组：
     * 若 nums[i]>0：因为已经排序好，所以后面不可能有三个数加和等于 00，直接返回结果。
     * 对于重复元素：跳过，避免出现重复解
     * 令左指针 L=i+1，右指针 R=n-1，当 L<R时，执行循环：
     * 当 nums[i]+nums[L]+nums[R]==0，执行循环，判断左界和右界是否和下一位置重复，去除重复解。并同时将 L,RL,R 移到下一位置，寻找新的解
     * 若和大于 00，说明 nums[R]太大，RR 左移
     * 若和小于 00，说明 nums[L] 太小，LL 右移
     * 复杂度分析
     * 时间复杂度：O\left(n^{2}\right)O(n
     * 2
     *  )，数组排序 O(N \log N)O(NlogN)，遍历数组 O\left(n\right)O(n)，双指针遍历 O\left(n\right)O(n)，总体 O(N \log N)+O\left(n\right)*O\left(n\right)O(NlogN)+O(n)∗O(n)，O\left(n^{2}\right)O(n
     * 2
     *  )
     * 空间复杂度：O(1)O(1)
     * Python3
     *
     *
     * 作者：wu_yan_zu
     * 链接：https://leetcode.cn/problems/3sum/solution/pai-xu-shuang-zhi-zhen-zhu-xing-jie-shi-python3-by/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 1){
            return result;
        }
        Arrays.sort(nums);
        for(int i =0; i < nums.length;i++){
            if(nums[0] > 0){
                return result;
            }
            if( i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = nums.length - 1 ;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum > 0){
                    right --;
                }else if(sum < 0){
                    left ++;
                }else{
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left < right && nums[right] == nums[right -1]){
                        right--;
                    }
                    while(left < right && nums[left] == nums[left +1]) {
                        left++;
                    }
                    left ++;
                    right --;
                }
            }
        }
        return result;
    }
}
