package springboot.learn.leecode.Combinations;

import springboot.learn.leecode.Combinations.method.Impel.SolutionImpel;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        SolutionImpel solutionImpel = new SolutionImpel();
        List<List<Integer>> result = solutionImpel.combine(n,k);
        System.out.println(result);
    }
}
