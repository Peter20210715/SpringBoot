package springboot.learn.leecode.RecursionAlgorithm.BinaryTreeInorderTraversal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>Title: TreeNode</p >
 * <p>Description: TODO(用一句句话描述该文件做什么) </p >
 * <p>Copyright: Copyright (c) </p >
 * <p>Company: inspur </p >
 *
 * @author WangZhongming （换成自己的）
 * @version 1.0
 * @createtime
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TreeNode {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    int val;
    TreeNode left;
    TreeNode right;
}
