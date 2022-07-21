package springboot.learn.leecode.AlgorithmUnidirectionalBacktrace.Combination.CombinationSumII;

import springboot.learn.leecode.AlgorithmUnidirectionalBacktrace.Combination.CombinationSumII.method.Impel.SolutionImpel;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] candidates ={10,1,2,7,6,1,5};

        int target =  8;
        int length = candidates.length;

        SolutionImpel solutionImpel = new SolutionImpel();
        List<List<Integer>> result = solutionImpel.combinationSum2(candidates,target);
        System.out.println(result);
    }
}
