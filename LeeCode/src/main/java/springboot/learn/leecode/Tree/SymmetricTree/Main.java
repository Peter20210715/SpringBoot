package springboot.learn.leecode.Tree.SymmetricTree;

import springboot.learn.leecode.Tree.SymmetricTree.entity.TreeNode;
import springboot.learn.leecode.Tree.SymmetricTree.method.Impel.SolutionImpel;

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
        /**
         * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
         *
         * Input: root = [1,2,2,3,4,4,3]
         * Output: true
         *
         * Input: root = [1,2,2,null,3,null,3]
         * Output: false
         *
         * 来源：力扣（LeetCode）
         * 链接：https://leetcode.cn/problems/symmetric-tree
         * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
         */
        int[] root = {1,2,2,3,4,4,3};
        TreeNode treeNode = new TreeNode();
        treeNode.setVal(1);
        TreeNode treeNode1 = new TreeNode();
        TreeNode treeNode2 = new TreeNode();
        treeNode.setLeft(treeNode1);
        treeNode1.setVal(2);
        treeNode.setRight(treeNode2);
        treeNode2.setVal(2);
/**
 * 初始化
 */
        TreeNode treeNode3 = new TreeNode();
        treeNode1.setLeft(treeNode3);
        treeNode3.setVal(3);
        TreeNode treeNode4 = new TreeNode();
        treeNode1.setRight(treeNode4);
        treeNode4.setVal(4);

        TreeNode treeNode5 = new TreeNode();
        treeNode2.setLeft(treeNode5);
        treeNode5.setVal(3);
        TreeNode treeNode6= new TreeNode();
        treeNode2.setRight(treeNode6);
        treeNode6.setVal(4);
        SolutionImpel solutionImpel = new SolutionImpel();
        boolean result = solutionImpel.isSymmetric(treeNode);
        System.out.println(result);
    }
}
