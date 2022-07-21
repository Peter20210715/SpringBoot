package springboot.learn.leecode.AlgorithmUnidirectionalBacktrace.Partition.PartitionDivideII;

import springboot.learn.leecode.AlgorithmUnidirectionalBacktrace.Partition.PartitionDivideII.method.Impel.SolutionImpel;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = "ABC";
        SolutionImpel solutionImpel = new SolutionImpel();
        List<List<String>> result = solutionImpel.divideII(str);
        System.out.println(result);
    }
}
