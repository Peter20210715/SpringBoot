package springboot.learn.leecode.AlgorithmUnidirectionalBacktrace.Partition.RestoreIPAddresses.method.Impel;

import springboot.learn.leecode.AlgorithmUnidirectionalBacktrace.Partition.RestoreIPAddresses.method.Solution;

import java.util.ArrayList;
import java.util.List;

public class SolutionRewrite implements Solution {
    /**
     * A valid IP address consists of exactly four integers separated by single dots. Each integer is between 0 and 255 (inclusive) and cannot have leading zeros.
     *
     * For example, "0.1.2.201" and "192.168.1.1" are valid IP addresses, but "0.011.255.245", "192.168.1.312" and "192.168@1.1" are invalid IP addresses.
     * Given a string s containing only digits, return all possible valid IP addresses that can be formed by inserting dots into s. You are not allowed to reorder or remove any digits in s. You may return the valid IP addresses in any order.
     *
     *  
     *
     * Example 1:
     *
     * Input: s = "25525511135"
     * Output: ["255.255.11.135","255.255.111.35"]
     * Example 2:
     *
     * Input: s = "0000"
     * Output: ["0.0.0.0"]
     * Example 3:
     *
     * Input: s = "101023"
     * Output: ["1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"]
     *
     * 1 <= s.length <= 20
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/restore-ip-addresses
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param s
     * @return
     */
    @Override
    public List<String> restoreIpAddresses(String s) {
        int length = s.length();
        if(length < 4 || length > 12){
            return  result;
        }else {
            traceBack(s,0);
            return result;
        }
    }
    // 结果result，路径path
    List<String> result = new ArrayList<>();
    List<String> path = new ArrayList<>();

    public void traceBack(String s,int startIndex){
        int length = s.length();
        if(path.size() > 4){
            return;
        }
        if(path.size() == 4 && startIndex >=length){
            String temp = String.join(".",path);
            result.add(temp);
            return;
        }
        //减支
        if(path.size() == 4 && startIndex !=length){
            return;
        }
        for(int i = startIndex; i< length; i++){
            String str = s.substring(startIndex,i+1);
            if(isIllegal(str)){
                path.add(str);
            }else {
                continue;
            }
            traceBack(s,i+1);
            path.remove(path.size() - 1);
        }
    }
    public boolean isIllegal(String str){
        boolean flag = true;
        /**
         * 1.长度：1-3
         * 2.值范围；0-255
         * 3.不能以：0开头的，值不为0
         * 4.字符：1-9之间
         */
        int length = str.length();
        if(length < 1 || length > 3){
            flag = false;
        }else {
            if(str.charAt(0) == '0' && length != 1){
                flag = false;
            }else {
                int num=0;
                for(int i = 0; i< length; i++){
                    if(str.charAt(i) < '0' || str.charAt(i) > '9'){
                        flag = false;
                        break;
                    }
                    num = num * 10 + str.charAt(i) - '0';
                    if(num < 0 || num > 255){
                        flag = false;
                        break;
                    }
                }
            }
        }
        return flag;
    }
}
