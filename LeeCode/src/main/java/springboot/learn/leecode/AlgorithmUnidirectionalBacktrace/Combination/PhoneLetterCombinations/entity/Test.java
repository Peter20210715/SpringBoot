package springboot.learn.leecode.AlgorithmUnidirectionalBacktrace.Combination.PhoneLetterCombinations.entity;

import java.util.ArrayList;
import java.util.List;

public class Test {
    /**
     * 思路：
     * 如果对回溯算法基础还不了解的话，我还特意录制了一期视频：带你学透回溯算法（理论篇） 可以结合题解和视频一起看，希望对大家理解回溯算法有所帮助。
     *
     * 从示例上来说，输入"23"，最直接的想法就是两层for循环遍历了吧，正好把组合的情况都输出了。
     *
     * 如果输入"233"呢，那么就三层for循环，如果"2333"呢，就四层for循环.......
     *
     * 大家应该感觉出和77.组合遇到的一样的问题，就是这for循环的层数如何写出来，此时又是回溯法登场的时候了。
     *
     * 理解本题后，要解决如下三个问题：
     *
     * 数字和字母如何映射
     * 两个字母就两个for循环，三个字符我就三个for循环，以此类推，然后发现代码根本写不出来
     * 输入1 * #按键等等异常情况
     * ## 数字和字母如何映射
     *
     * 可以使用map或者定义一个二维数组，例如：string letterMap[10]，来做映射，我这里定义一个二维数组，代码如下：
     */
        //学习迭代思想：及实现传址功能(全局变量)
        List<String> result = new ArrayList<>();
        public List<String> letterCombinations(String digits) {
            char []charDigits = digits.toCharArray();
            if(charDigits.length < 1){
                return result;
            }
            String []numString={"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
            //学习回溯思路，这里第三个参数记录回溯的次数：0代表为未开始
            backTracing(charDigits,numString,0);
            return result;
        }
        StringBuilder temp = new StringBuilder();
        public void backTracing(char []charDigits,String []numString,int num){
            if(num == charDigits.length){
                result.add(temp.toString());
                return;
            }
            //获取当前遍历字符串
            String str = numString[charDigits[num] - '0'];
            char []charString = str.toCharArray();

            for(int i = 0;i < charString.length; i++){
                temp.append(charString[i]);
                backTracing(charDigits,numString,num+1);

                //去除前面处理的结果，对下此循环结果的影响：
                temp.deleteCharAt(temp.length() - 1);
            }

        }

}
