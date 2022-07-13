package springboot.learn.leecode.PalindromeNumber.method.Impel;

import springboot.learn.leecode.PalindromeNumber.method.Solution;

import java.util.ArrayList;
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
    public boolean isPalindrome(int x) {
        boolean result;
        if(x < 0){
            result = false;
        }else  if(x == 0){
            result =  true;
        }else {
            ArrayList<Integer> temp = new ArrayList<>();
            while(x !=0){
                temp.add( x%10);
                x = x/10;
            }
            result = isPalindromeList(temp);

        }
        return result;
    }

    boolean isPalindromeList(List<Integer> list){
        boolean result = true;
        int start,end,length;
        length = list.size();
        end = length - 1;
        start = 0;
        while(start <= end){
            if(!list.get(start).equals(list.get(end))){
                result = false;
                break;
            }
            start++;
            end--;
        }


        return result;
    }
}
