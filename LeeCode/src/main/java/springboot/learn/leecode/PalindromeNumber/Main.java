package springboot.learn.leecode.PalindromeNumber;

import springboot.learn.leecode.PalindromeNumber.method.Impel.SolutionImpel;

/**
 * <p>Title: Main$</p >
 * <p>Description: TODO(用一句句话描述该文件做什么) </p >
 * <p>Copyright: Copyright (c) $</p >
 * <p>Company: inspur </p >
 *
 * @author WangZhongming
 * @version 1.0
 * @createtime $ $
 */

public class Main {
    public static void main(String[] args) {
        int x = 1221;
        SolutionImpel solutionImpel = new SolutionImpel();
        System.out.println(solutionImpel.isPalindrome(x));
    }
}
