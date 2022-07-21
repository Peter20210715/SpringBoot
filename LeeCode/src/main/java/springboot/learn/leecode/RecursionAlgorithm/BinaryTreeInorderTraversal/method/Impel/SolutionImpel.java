package springboot.learn.leecode.RecursionAlgorithm.BinaryTreeInorderTraversal.method.Impel;

import springboot.learn.leecode.RecursionAlgorithm.BinaryTreeInorderTraversal.entity.TreeNode;
import springboot.learn.leecode.RecursionAlgorithm.BinaryTreeInorderTraversal.method.Solution;

import java.util.ArrayList;
import java.util.List;

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
    List<Integer> result = new ArrayList<>();
    @Override
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root !=null){
            inorderTraversal(root.getLeft());
            result.add(root.getVal());
            inorderTraversal(root.getRight());
        }
        return  result;
    }
}
