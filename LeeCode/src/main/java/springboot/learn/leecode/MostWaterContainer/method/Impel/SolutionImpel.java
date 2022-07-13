package springboot.learn.leecode.MostWaterContainer.method.Impel;

import springboot.learn.leecode.MostWaterContainer.method.Solution;

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
    public int maxArea(int[] height) {
        //动态规划的思想：
        int length = height.length;
        int container,container_y;
        container_y = Math.min(height[0],height[1]);
        container = container_y;
        for(int i = 0; i < length - 1; i++){
            for(int j = i+1; j < length; j++){
                container_y = Math.min(height[i],height[j]);
                container = Math.max(container,(j - i) * container_y);
            }

        }
        return container;
    }

    /**
     * 上一个方法：时间复杂度为 n*n；时间复杂度较高
     */
    public  int maxAreaTwo(int[] height){
        //动态规划的思想：双指针遍历方法
        int length = height.length;
        int container,container_y;
        container_y = Math.min(height[0],height[1]);
        container = container_y;
        if(length < 2){
            container = 0;
        }
        int i,j;
        for(i = 0,j = length-1; i < j;){
            container_y = Math.min(height[i],height[j]);
            if(container < (j - i) * container_y){
                container = (j - i) * container_y;
            }
            if(height[i] < height[j]){
                i++;
            }else {
                j--;
            }
        }

        return container;
    }
}
