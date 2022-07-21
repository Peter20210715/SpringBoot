package springboot.learn.leecode.AlgorithmUnidirectionalBacktrace.Partition.PalindromePartitioning;

import springboot.learn.leecode.AlgorithmUnidirectionalBacktrace.Partition.PalindromePartitioning.method.Impel.SolutionImpel;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s = "aabbaa";
        SolutionImpel solutionImpel = new SolutionImpel();
        List<List<String>> result = solutionImpel.partition(s);
        System.out.println(result);
    }
}
