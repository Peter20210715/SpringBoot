package springboot.learn.leecode.RecursionAlgorithm.BinaryTreeInorderTraversal;

import springboot.learn.leecode.RecursionAlgorithm.BinaryTreeInorderTraversal.entity.TreeNode;
import springboot.learn.leecode.RecursionAlgorithm.BinaryTreeInorderTraversal.method.Impel.SolutionImpel;

import java.util.List;

/**
 * <p>Title: Main</p >
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
        TreeNode treeNode = new TreeNode();
        treeNode.setVal(1);
        TreeNode treeNodeRight = new TreeNode();
        TreeNode treeNodeLeft = new TreeNode();
        treeNode.setRight(treeNodeRight);
        treeNode.getRight().setVal(2);
        treeNodeRight.setLeft(treeNodeLeft);
        treeNode.getRight().getLeft().setVal(3);
        SolutionImpel solutionImpel = new SolutionImpel();
        List<Integer> result = solutionImpel.inorderTraversal(treeNode);
        System.out.println(result);
    }
}
