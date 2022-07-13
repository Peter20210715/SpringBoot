package springboot.learn.leecode.CombinationSum;

import springboot.learn.leecode.CombinationSum.method.Impel.SolutionImpel;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] candidates={2,3,6,7};
        int target = 7;
        SolutionImpel solutionImpel = new SolutionImpel();
        List<List<Integer>> result = solutionImpel.combinationSum(candidates,target);
        System.out.println(result);
    }
}
