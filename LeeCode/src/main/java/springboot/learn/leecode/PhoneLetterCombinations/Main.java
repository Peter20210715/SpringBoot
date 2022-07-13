package springboot.learn.leecode.PhoneLetterCombinations;

import springboot.learn.leecode.PhoneLetterCombinations.method.Impel.SolutionImpel;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str="234";
        SolutionImpel solutionImpel = new SolutionImpel();
        List<String> result= solutionImpel.letterCombinations(str);
        System.out.println(result);
    }
}
