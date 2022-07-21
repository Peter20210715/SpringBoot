package springboot.learn.leecode.AlgorithmUnidirectionalBacktrace.Partition.PartitionsDivide.method.Impel;

import springboot.learn.leecode.AlgorithmUnidirectionalBacktrace.Partition.PartitionsDivide.method.Solution;

import java.util.ArrayList;
import java.util.List;

public class SolutionImpel implements Solution {

    /**
     * 1.划分问题为:求解一个集合的所有划分可能性,结束条件为分隔符为末尾:
     * 这种分割符   并不是数学中的分割意思
     * 目前该分割为保证顺序不变
     * @param s
     * @return
     */
    @Override
   public   List<List<String>> divide(String s) {
        int length = s.length();
        if(length < 2){
            path.add(s);
            result.add(path);
            return  result;
        }else {
            traceBack(s,0);
        }
        return result;
    }
    // 划分问题:区别与子集问题
    List<List<String>> result = new ArrayList<>();
    List<String> path = new ArrayList<>();
    void traceBack(String s,int startIndex){
        int length = s.length();
        if(startIndex >= length){
            List<String> pathTemp = new ArrayList<>();
            for(String s1:path){
                pathTemp.add(s1);
            }
            result.add(pathTemp);
            return;
        }
        for(int i= startIndex;i< length;i++){
            path.add(s.substring(startIndex,i+1));
            traceBack(s,i+1);
            path.remove(path.size() - 1);
        }
    }
}
