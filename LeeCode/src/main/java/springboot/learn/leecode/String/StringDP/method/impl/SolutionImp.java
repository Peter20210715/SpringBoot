package springboot.learn.leecode.String.StringDP.method.impl;

import springboot.learn.leecode.String.StringDP.method.Solution;

import java.util.*;

/**
 * <p>Title: SolutionImp$</p >
 * <p>Description: TODO(用一句句话描述该文件做什么) </p >
 * <p>Copyright: Copyright (c) $</p >
 * <p>Company: inspur </p >
 *
 * @author WangZhongming
 * @version 1.0
 * @createtime $ $
 */

public class SolutionImp implements Solution {

        /**
         dynamic programming  典型
         维护一个动态理想的数组：arraylist(start,end)/HashMap<Integer,Character> result
         遍历原始数据集合
         假定遍历的当前元素为最后一个元素
         假定在原始数据集合中，遍历的当前元素为最后一个元素
         维护的动态理想的数组中最后一个元素为当前遍历的元素
         对比当前的理想数组与前一个理想数组  取最优值
         */
    @Override
    public int lengthOfLongestSubstring(String s){
        int start,end;
        int cur;
        int length = s.length();
        if(length < 1){
            return length;
        }
        ArrayList<Character> dp = new ArrayList<>();
        start = end  = 0;
        dp.add(s.charAt(0));
        for (int i = 1; i < length; i++){
            Character ch = s.charAt(i);
            dp.add(ch);
            cur = longest(dp);
            if(cur > end - start + 1){
                end = i;
                start = i - cur + 1;
            }
        }
        return end - start + 1;
    }


    public  int longest(List<Character> list){
        ArrayList<Character> temp = new ArrayList<>();
        int flag;
        int length = list.size();
        temp.add(list.get(length - 1 ));
        for(int i = length - 2; i >= 0; i--){
            Character ch = list.get(i);
            flag = temp.indexOf(ch);
            if(flag != -1){
                break;
            }else {
                temp.add(ch);
            }
        }
        return  temp.size();
    }


    @Override
    public void language() {
        System.out.println("this is language");
    }

    @Override
    public void speak() {
        System.out.println("this is speak");
    }


}
