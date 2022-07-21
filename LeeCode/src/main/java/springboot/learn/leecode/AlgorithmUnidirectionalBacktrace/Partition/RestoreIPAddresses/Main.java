package springboot.learn.leecode.AlgorithmUnidirectionalBacktrace.Partition.RestoreIPAddresses;

import springboot.learn.leecode.AlgorithmUnidirectionalBacktrace.Partition.RestoreIPAddresses.entity.Test;
import springboot.learn.leecode.AlgorithmUnidirectionalBacktrace.Partition.RestoreIPAddresses.method.Impel.SolutionImpel;
import springboot.learn.leecode.AlgorithmUnidirectionalBacktrace.Partition.RestoreIPAddresses.method.Impel.SolutionRewrite;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s = "25525511135";
//        SolutionImpel solutionImpel = new SolutionImpel();
//        List<String> result = solutionImpel.restoreIpAddresses(s);
//        Test test = new Test();
//        List<String> result = test.restoreIpAddresses(s);
//        System.out.println(result);
        SolutionRewrite solutionRewrite = new SolutionRewrite();
        List<String> result = solutionRewrite.restoreIpAddresses(s);
        System.out.println(result);
    }
}
