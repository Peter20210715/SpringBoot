package springboot.learn.leecode.Tree.SymmetricTree.method.Impel;

import springboot.learn.leecode.Tree.SymmetricTree.entity.TreeNode;
import springboot.learn.leecode.Tree.SymmetricTree.method.Solution;

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
public class SolutionImpel implements Solution {
    @Override
    public boolean isSymmetric(TreeNode root) {
        boolean result = false;
        if(root.getRight() == null && root.getLeft() == null){
            result = true;
        }else if(root.getLeft() !=null && root.getRight() !=null){
            result = compare(root.getLeft(),root.getRight());
        }
        return result;
    }

    boolean temp = false;
    public boolean compare(TreeNode left,TreeNode right){



        return  temp;
    }
}
