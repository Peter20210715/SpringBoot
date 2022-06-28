package springboot.learn.leecode.ListNode;

import springboot.learn.leecode.ListNode.method.SolutionImp;

import java.util.HashMap;

/**
 * <p>Title: Main$</p >
 * <p>Description: 用于启动类
 * <p>Copyright: Copyright (c) $</p >
 * <p>Company: inspur </p >
 *
 * @author WangZhongming
 * @version 1.0
 * @createtime $ $
 */

public class Main {
    public static void main(String[] args) {
        SolutionImp solutionImp = new SolutionImp();
        ListNode l1 = new ListNode(2,null);
        ListNode l2 = new ListNode(5,null);
        ListNode temp ;
        temp = new ListNode(4,null);
        l1 = solutionImp.mergeList(l1,temp);
        temp = new ListNode(9,null);
        l1 = solutionImp.mergeList(l1,temp);
        /**
         * 封装l2
         */
        temp = new ListNode(6,null);
        l2 = solutionImp.mergeList(l2,temp);
        temp = new ListNode(4,null);
        l2 = solutionImp.mergeList(l2,temp);
        temp = new ListNode(9,null);
        l2 = solutionImp.mergeList(l2,temp);

        ListNode result = solutionImp.addTwoNumbers(l1,l2);
        System.out.println(result);

        String str ="dsdsdsd";
        System.out.println(str.length());
       HashMap<Integer,Character> test = new HashMap<>();


    }
}
