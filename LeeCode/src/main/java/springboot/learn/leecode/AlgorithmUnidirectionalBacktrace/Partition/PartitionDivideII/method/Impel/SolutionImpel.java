package springboot.learn.leecode.AlgorithmUnidirectionalBacktrace.Partition.PartitionDivideII.method.Impel;

import java.util.ArrayList;
import java.util.List;
import springboot.learn.leecode.AlgorithmUnidirectionalBacktrace.Partition.PartitionDivideII.method.Solution;

public class SolutionImpel implements Solution{

    /**
     * 本次尝试利用回溯算法实现数学意思上的:划分
     * @param str
     * @return
     */
    @Override
    public List<List<String>> divideII(String str) {
        if(str.length() < 1){
            return result;
        }
        traceBack(str,0,str_temp);
        return result;
    }
    List<List<String>> result = new ArrayList<>();
    List<String> temp = new ArrayList<>();
    StringBuffer str_temp = new StringBuffer();
    public void traceBack(String str,int indexStart,StringBuffer stringBuffer){
        int length_str = str.length();
        int length_temp =0;
        for(String s:temp){
            length_temp += s.length();
        }
        if(length_temp == length_str){
            List<String> temp_one = new ArrayList<>();
            for(String one:temp){
                temp_one.add(one);
            }
            result.add(temp_one);
            return;
        }
        for(int i= indexStart; i< length_str; i++){
            stringBuffer.append(str.charAt(i));
            temp.add(stringBuffer.toString());
            traceBack(str,i+1,stringBuffer);
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            temp.remove(temp.size() - 1);
        }
    }
}
