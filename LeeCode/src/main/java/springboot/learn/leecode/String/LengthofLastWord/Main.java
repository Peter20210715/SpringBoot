package springboot.learn.leecode.String.LengthofLastWord;

import springboot.learn.leecode.String.LengthofLastWord.method.Impel.SolutionImpel;

/**
 * <p>Title: </p >
 * <p>Description: TODO(用一句句话描述该文件做什么) </p >
 * <p>Copyright: Copyright (c) </p >
 * <p>Company: inspur </p >
 *
 * @author WangZhongming （换成自己的）
 * @version 1.0
 * @createtime
 */
public class Main {
    public static void main(String[] args) {
        SolutionImpel solutionImpel = new SolutionImpel();
        String str = "luffy is still joyboy";
        int result = solutionImpel.lengthOfLastWord(str);
        System.out.println(result);
    }
}
