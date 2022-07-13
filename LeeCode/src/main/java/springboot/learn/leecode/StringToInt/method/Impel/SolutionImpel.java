package springboot.learn.leecode.StringToInt.method.Impel;

import springboot.learn.leecode.StringToInt.method.Solution;

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
    public int myAtoi(String s) {
        /**
         * 使其能将字符串转换成一个 32 位有符号整数（类似 C/C++ 中的 atoi 函数）。
         *
         * 函数 myAtoi(string s) 的算法如下：
         *
         * 1.读格入字符串并丢弃无用的前导空
         * 2.检查下一个字符（假设还未到字符末尾）为正还是负号，读取该字符（如果有）。 确定最终结果是负数还是正数。 如果两者都不存在，则假定结果为正。
         * 3.读入下一个字符，直到到达下一个非数字字符或到达输入的结尾。字符串的其余部分将被忽略。
         * 4.将前面步骤读入的这些数字转换为整数（即，"123" -> 123， "0032" -> 32）。如果没有读入数字，则整数为 0 。必要时更改符号（从步骤 2 开始）。
         * 5.如果整数数超过 32 位有符号整数范围 [−2^31,  2^31 − 1] ，需要截断这个整数，使其保持在这个范围内。具体来说，小于 −2^31 的整数应该被固定为 −2^31 ，大于 2^31 − 1 的整数应该被固定为 2^31 − 1 。
         * 6.返回整数作为最终结果。
         *
         * 来源：力扣（LeetCode）
         * 链接：https://leetcode.cn/problems/string-to-integer-atoi
         * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
         */
        long result = 0 ;
        int count = 0;
        boolean flag = false;
        boolean flag1 = false;
        int length = s.length();
        long max = (long)Math.pow(2,31);
        if(length < 1){
            return 0;
        }
        for(int i = 0; i < length; i++){
           if(s.charAt(i) > 47 && s.charAt(i) < 58){
               result = result*10 + (s.charAt(i) - 48);
                flag1 = true;
                if(result > max + 2){
                    break;
                }
            } else  if(s.charAt(i) ==' '){
               if(flag1){
                   break;
               }
                continue;
            }else  if(s.charAt(i) == '+'){
                if(flag1){
                    break;
                }
                count++;
               flag1 = true;
                if(count >= 2){
                    break;
                }
                continue;
            } else if(s.charAt(i) == '-'){
                if(flag1){
                    break;
                }
                count++;
                flag = true;
                flag1 = true;
                if(count >= 2){
                    break;
                }
            }else {
                break;
            }
        }
        if(flag){
            result = ((int)result == result ? result:max);
            result = result*(-1);
        }else {
            result = ((int)result == result ? result:max - 1);
        }
        return (int)result;
    }
}
