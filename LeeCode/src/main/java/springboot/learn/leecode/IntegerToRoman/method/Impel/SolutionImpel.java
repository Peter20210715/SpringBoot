package springboot.learn.leecode.IntegerToRoman.method.Impel;

import springboot.learn.leecode.IntegerToRoman.method.Solution;

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

    /**
     * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
     *
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
     *
     * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
     *
     * I can be placed before V (5) and X (10) to make 4 and 9. 
     * X can be placed before L (50) and C (100) to make 40 and 90. 
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     * Given an integer, convert it to a roman numeral.
     *
     *  
     *
     * Example 1:
     *
     * Input: num = 3
     * Output: "III"
     * Explanation: 3 is represented as 3 ones.
     * Example 2:
     *
     * Input: num = 58
     * Output: "LVIII"
     * Explanation: L = 50, V = 5, III = 3.
     * Example 3:
     *
     * Input: num = 1994
     * Output: "MCMXCIV"
     * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/integer-to-roman
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    @Override
    public String intToRoman(int num) {
        /**
         * 动态字符串：StringBuffer
         */
        if(num < 1 || num > 3999){
            return null;
        }
        String  result = new String();
        String resutlFinal = new String();
        ArrayList<Integer> temp = new ArrayList<>();
        while(num !=0){
            temp.add(num % 10);
            num = num / 10;
        }
        int length = temp.size();
        for(int i=length -1 ; i >=0 ;i--){
            resutlFinal = resutlFinal + fun(result,i,temp.get(i));
        }
        return  resutlFinal;
    }



    public String fun(String temp,int index,Integer num){
        switch (index){
            case 0:
                if(num < 4){
                    while(num !=0){
                        temp = temp + "I";
                        num = num - 1;
                    }
                }else if(num == 4){
                    temp = temp + "IV";
                }else if(num < 9){
                    temp = temp + "V";
                    num = num - 5;
                    while(num !=0){
                        temp = temp + "I";
                        num = num - 1;
                    }
                }else {
                    temp = temp + "IX";
                }
                break;
            case 1:
                if(num < 4){
                    while(num !=0){
                        temp = temp + "X";
                        num = num - 1;
                    }
                }else if(num == 4){
                    temp = temp + "XL";
                }else if(num < 9){
                    temp = temp + "L";
                    num = num - 5;
                    while(num !=0){
                        temp = temp + "X";
                        num = num - 1;
                    }
                }else {
                    temp = temp + "XC";
                }
                break;
            case 2:
                if(num < 4){
                    while(num !=0){
                        temp = temp + "C";
                        num = num - 1;
                    }
                }else if(num == 4){
                    temp = temp + "CD";
                }else if(num < 9){
                    temp = temp + "D";
                    num = num - 5;
                    while(num !=0){
                        temp = temp + "C";
                        num = num - 1;
                    }
                }else {
                    temp = temp + "CM";
                }
                break;
            case 3:
                if(num < 4){
                    while(num !=0){
                        temp = temp + "M";
                        num = num - 1;
                    }
                }
                break;
        }

        return temp;
    }

    @Override
    public int romanToInt(String s) {
        int result = 0;
        int length = s.length();
        if(length < 1){
            result = 0;
        }
        for(int i=0; i< length; i++){
            if(i !=0 && s.charAt(i-1) =='I' && s.charAt(i) == 'V'){
                result +=5;
                result -=2;
                continue;
            }
            if(i !=0 && s.charAt(i-1) =='I' && s.charAt(i) == 'X'){
                result +=10;
                result -=2;
                continue;
            }
            if(i !=0 && s.charAt(i-1) =='X' && s.charAt(i) == 'L'){
                result +=50;
                result -=20;
                continue;
            }
            if(i !=0 && s.charAt(i-1) =='X' && s.charAt(i) == 'C'){
                result +=100;
                result -=20;
                continue;
            }
            if(i !=0 && s.charAt(i-1) =='C' && s.charAt(i) == 'D'){
                result +=500;
                result -=200;
                continue;
            }
            if(i !=0 && s.charAt(i-1) =='C' && s.charAt(i) == 'M'){
                result +=1000;
                result -=200;
                continue;
            }
            if(s.charAt(i) == 'I'){
                result +=1;
                continue;
            }
            if(s.charAt(i) == 'V'){
                result +=5;
                continue;
            }
            if(s.charAt(i) == 'X'){
                result +=10;
                continue;
            }
            if(s.charAt(i) == 'L'){
                result +=50;
                continue;
            }
            if(s.charAt(i) == 'C'){
                result +=100;
                continue;
            }
            if(s.charAt(i) == 'D'){
                result +=500;
                continue;
            }
            if(s.charAt(i) == 'M'){
                result +=1000;
                continue;
            }
        }
        return result;
    }
}


