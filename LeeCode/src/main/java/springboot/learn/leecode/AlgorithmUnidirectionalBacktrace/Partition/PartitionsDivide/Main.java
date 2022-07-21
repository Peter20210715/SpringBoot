package springboot.learn.leecode.AlgorithmUnidirectionalBacktrace.Partition.PartitionsDivide;

import springboot.learn.leecode.AlgorithmUnidirectionalBacktrace.Partition.PartitionsDivide.method.Impel.SolutionImpel;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = "123";
        SolutionImpel solutionImpel = new SolutionImpel();
        List<List<String>> result = solutionImpel.divide(str);
        System.out.println(result);
        System.out.println(result.size());
    }
}
