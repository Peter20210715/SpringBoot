package springboot.learn.leecode.AlgorithmUnidirectionalBacktrace.Partition.RestoreIPAddresses.method.Impel;
import springboot.learn.leecode.AlgorithmUnidirectionalBacktrace.Partition.RestoreIPAddresses.method.Solution;

import java.util.ArrayList;
import java.util.List;

public class SolutionImpel implements Solution{
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
        }
        traceBack(s,0);
        return result;
    }
    List<String> result = new ArrayList<>();
    List<String> path = new ArrayList<>();
    /**
     * 分割：长度小于4，值范围0-255
     * 参考：回文字符串分割的写法
     */
    public void traceBack(String s,int count){
        int length = s.length();
        if (path.size() > 4){
            return;
        }
        if (path.size() == 4 && count >= length){
            String temp = String.join(".",path);
            result.add(temp);
            return;
        }
        for(int i= count;i< length;i++){
            String temp_str = s.substring(count,i+1);
            if(isIllegal(temp_str)){
                path.add(temp_str);
            }else {
                continue;
            }
            traceBack(s,i+1);
            path.remove(path.size() - 1);
        }
    }
    /**
     * 判断当前字符串是否合理:
     * 不以0开头
     * 值范围0-255
     */
   public  boolean isIllegal(String str){
        boolean flag = true;
        int length = str.length();

        if(length > 3 || length < 1){
            flag = false;
        }else {
            if(str.charAt(0) =='0' && length!=1){
                flag = false;
            }else {
                int num = 0;
                for(int i= 0; i<length; i++){
                    if (str.charAt(i) > '9' || str.charAt(i) < '0') {
                        // 遇到⾮数字字符不合法
                        return false;
                    }
                    /**
                     * 判断值范围是否合理
                     */
                    num = num*10 + str.charAt(i) - '0';
                    if(num < 0 || num > 255){
                        flag = false;
                        break;
                    }
                }
            }

        }

        return  flag;
    }
}
