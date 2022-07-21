package springboot.learn.leecode.AlgorithmUnidirectionalBacktrace.Partition.RestoreIPAddresses.entity;

import java.util.ArrayList;
import java.util.List;

public class Test {
    List<String> result = new ArrayList<>();
    List<String> path = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        if (s.length() == 0){
            return new ArrayList<>();
        }
        backTracking(s,0);
        return result;
    }
    public void backTracking(String s, int startIndex){
        //做减支处理： path长度超过4，但分割符还未到末尾
        if (path.size() > 4){
            return;
        }
        if (path.size() == 4 && startIndex >= s.length()){
            String temp = String.join(".",path);
            result.add(temp);
            return;
        }

        for (int i = startIndex;i < s.length();i++){
            if (isValid(s,startIndex,i)){
                String str = s.substring(startIndex,i+1);
                path.add(str);
            }else {
                continue;
            }
            backTracking(s,i+1);
            path.remove(path.size()-1);

        }
    }
    private Boolean isValid(String s, int start, int end) {
        if (start > end) {
            return false;
        }
        if (s.charAt(start) == '0' && start != end) {
            // 0开头的数字不合法，这里没有  说明0000也是符合情况的；
            return false;
        }
        int num = 0;
        for (int i = start; i <= end; i++) {
            if (s.charAt(i) > '9' || s.charAt(i) < '0') {
                // 遇到⾮数字字符不合法
                return false;
            }
            num = num * 10 + (s.charAt(i) - '0');
            if (num > 255) {
                // 如果⼤于255了不合法
                return false;
            }
        }
        return true;
    }
}
