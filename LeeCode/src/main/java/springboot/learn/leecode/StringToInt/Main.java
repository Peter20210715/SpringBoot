package springboot.learn.leecode.StringToInt;

import springboot.learn.leecode.StringToInt.method.Impel.SolutionImpel;

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
        String str = "-2147483648";
        int result = solutionImpel.myAtoi(str);
        System.out.println(result);
    }
}
