package springboot.learn.leecode.AlgorithmUnidirectionalBacktrace.Combination.CombinationSumIII;

import springboot.learn.leecode.AlgorithmUnidirectionalBacktrace.Combination.CombinationSumIII.method.Impel.SolutionImpel;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n,k;
        n = 9;
        k = 3;
        SolutionImpel solutionImpel = new SolutionImpel();
        List<List<Integer>> result = solutionImpel.combinationSum3(k,n);
        System.out.println(result);
    }
}
