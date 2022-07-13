package springboot.learn.leecode.ReverseInteger.method.Impel;

import springboot.learn.leecode.ReverseInteger.method.Solution;

/**
 * <p>Title: SolutionImpel$</p >
 * <p>Description: TODO(用一句句话描述该文件做什么) </p >
 * <p>Copyright: Copyright (c) $</p >
 * <p>Company: inspur </p >
 *
 * @author WangZhongming
 * @version 1.0
 * @createtime $ $
 */

public class SolutionImpel implements Solution {
    @Override
    public int reverse(int x) {
        long result = 0;
        while(x !=0){
            result = result*10 + x%10; ;
            x = x/10;
        }
        return (int)result == result ? (int)result : 0;
    }
}
