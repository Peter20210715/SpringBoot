package springboot.learn.leecode.Array.SearchInsertPosition.method.Impel;

import springboot.learn.leecode.Array.SearchInsertPosition.method.Solution;

/**
 * <p>Title: </p >
 * <p>Description: TODO(用一句句话描述该文件做什么) </p >
 * <p>Copyright: Copyright (c) </p >
 * <p>Company: inspur </p >
 *
 * @author WangZhongming （换成自己的）
 * @version 1.0
 * @createtime
 */
public class SolutionImpel implements Solution {
    /**
     * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
     *
     * You must write an algorithm with O(log n) runtime complexity.
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/search-insert-position
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param nums
     * @param target
     * @return
     */
    @Override
    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        int front,rear;
        front = 0;
        rear = length -1;
        /**
         * 双指针前后遍历，找到合适的数值：
         * front<target && rear > target
         */
        while(front <= rear){
            if(nums[front] == target){
                return front;
            }else if(nums[front] < target){
                front ++;
            }
            if(nums[rear] == target){
                return rear;
            }else if(nums[rear] > target){
                rear --;
            }
        }

        return rear+1;
    }
}
