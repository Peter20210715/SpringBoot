package springboot.learn.leecode.PhoneLetterCombinations.method.Impel;

import springboot.learn.leecode.PhoneLetterCombinations.method.Solution;

import java.util.*;

public class SolutionImpel implements Solution {

    //保存整体符合要求的 结果
    List<String> result = new ArrayList<>();
    @Override
    public List<String> letterCombinations(String digits) {
        /**
         * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
         *
         * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
         *
         * 示例 1：
         *
         * 输入：digits = "23"
         * 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
         * 示例 2：
         *
         * 输入：digits = ""
         * 输出：[]
         * 示例 3：
         *
         * 输入：digits = "2"
         * 输出：["a","b","c"]
         *
         * 9宫格中数据与字母对比关系
         * 2:abc,3:def,4:ghi,5:jkl,6:mno,7:pqrs,8:tuv,9:wxyz
         * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
         * 来源：力扣（LeetCode）
         * 链接：https://leetcode.cn/problems/letter-combinations-of-a-phone-number
         * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

         */
        if(digits.length() < 1){
            return result;
        }
        Map<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        /**
         * 这里看出由于输入的数字个数不变，无法使用多层for循环求解出结果：
         * 回溯搜寻思想：本质仍是暴力搜寻思想，现在努力写出来
         */
        traceBack(map,digits,0);
        return result;
    }
    //保存每一份符合要求的小结果
    StringBuffer temp = new StringBuffer();
    public void traceBack(Map<Character,String> map,String digits,int count){
        int length = digits.length();
        if(count == length){
            result.add(temp.toString());
            return;
        }
        Character ch = digits.charAt(count);
        String str = map.get(ch);
        int lengthCur = str.length();
        for(int i=0;i< lengthCur;i++){
            temp.append(str.charAt(i));
            traceBack(map,digits,count+1);
            //回溯步骤：
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}
