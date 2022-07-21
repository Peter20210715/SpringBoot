package springboot.learn.leecode.Integer.IntegerToRoman;

import springboot.learn.leecode.Integer.IntegerToRoman.method.Impel.SolutionImpel;

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
        SolutionImpel solutionImpel = new SolutionImpel();
        int num = 1994;
        System.out.println(solutionImpel.intToRoman(num));

        String str = "MCMXCIV";
        System.out.println(solutionImpel.romanToInt(str));
    }
}
