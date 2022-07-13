package springboot.learn.leecode.MedianOfSortArrays.method.Impel;

import springboot.learn.leecode.MedianOfSortArrays.method.Solution;

import java.util.ArrayList;

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
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
/**
 *  Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 *         The overall run time complexity should be O(log (m+n)).
 */
        ArrayList<Integer> temp = new ArrayList<>();
        int length1 = nums1.length;
        int length2 = nums2.length;
        int i,j;
            i = j = 0;
        while(i < length1 && j < length2){
            if(nums1[i] > nums2[j]){
                temp.add(nums2[j]);
                j++;
            }else if(nums1[i] == nums2[j]){
                temp.add(nums2[j]);
                temp.add(nums1[i]);
                i++;
                j++;
            }else {
                temp.add(nums1[i]);
                i++;
            }
        }

        while (j == length2 && i < length1){
            temp.add(nums1[i]);
            i++;
        }
        while (i == length1 && j < length2){
            temp.add(nums2[j]);
            j++;
        }
        int length = temp.size();
        System.out.println(temp);
        double result;
        if(length % 2 ==0){
            result = (temp.get(length/2) + temp.get(length/2 - 1))/2.0;
        }else {
            result = temp.get((length - 1)/2);
        }

        return result;
    }
}
