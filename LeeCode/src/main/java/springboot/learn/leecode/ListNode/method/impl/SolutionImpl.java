package springboot.learn.leecode.ListNode.method.impl;

import springboot.learn.leecode.ListNode.entity.ListNode;
import springboot.learn.leecode.ListNode.method.Solution;

/**
 * <p>Title: SolutionImp$</p >
 * <p>Description: TODO(用一句句话描述该文件做什么) </p >
 * <p>Copyright: Copyright (c) $</p >
 * <p>Company: inspur </p >
 *
 * @author WangZhongming
 * @version 1.0
 * @createtime $ $
 */

public class SolutionImpl implements Solution {
    @Override
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /**
         没有特殊说明，一律默认为头节点存储数据
         java 中引用类型：数组、类，接口
         1.设置一个标志位
         2.遍历两个链表取最短的为基准
         3.标志位与较长的链表的累加
         */
        int flag = 0;
        int temp;
        ListNode l1Reverte = l1;
        ListNode l2Reverte = l2;
        ListNode head = new ListNode();
        ListNode p ;
        p = head;
        // 以l1为载体存储结果：尾插法；
        while(l1Reverte !=null && l2Reverte !=null){
            if(l1Reverte.val + l2Reverte.val + flag < 10){
                l1Reverte.val = l1Reverte.val + l2Reverte.val + flag;
                flag = 0;
                p.next = l1Reverte;
                p = l1Reverte;
                l1Reverte = l1Reverte.next;
                l2Reverte = l2Reverte.next;
            }else{
                temp = l1Reverte.val;
                l1Reverte.val = (l1Reverte.val + l2Reverte.val + flag) % 10;
                flag = (temp + l2Reverte.val + flag) / 10;
                p.next = l1Reverte;
                p = l1Reverte;
                l1Reverte = l1Reverte.next;
                l2Reverte = l2Reverte.next;
            }
        }
        while(l1Reverte !=null){
            if(l1Reverte.val +  flag < 10){
                l1Reverte.val = l1Reverte.val + flag;
                flag = 0;
                p.next = l1Reverte;
                p = l1Reverte;
                l1Reverte = l1Reverte.next;
            }else{
                temp = l1Reverte.val;
                l1Reverte.val = (l1Reverte.val  + flag) % 10;
                flag = (temp + flag) / 10;
                p.next = l1Reverte;
                p = l1Reverte;
                l1Reverte = l1Reverte.next;
            }
        }
        while(l2Reverte !=null){
            if(l2Reverte.val +  flag < 10){
                l2Reverte.val = l2Reverte.val + flag;
                flag = 0;
                p.next = l2Reverte;
                p = l2Reverte;
                l2Reverte = l2Reverte.next;
            }else{
                temp = l2Reverte.val;
                l2Reverte.val = (l2Reverte.val  + flag) % 10;
                flag = (temp + flag) / 10;
                p.next = l2Reverte;
                p = l2Reverte;
                l2Reverte = l2Reverte.next;
            }
        }
        if(flag !=0){
            ListNode q = new ListNode();
            q.val=flag;
            p.next = q;

        }


        return head.next;
    }

    @Override
    public ListNode listReverte(ListNode l1) {
        /**
         头部插入法：反转链表
         */
        if(l1 == null){
            return l1;
        }
        ListNode head = new ListNode();
        ListNode p ;
        while(l1 !=null){
            p = l1.next;
            l1.next = head.next;
            head.next = l1;
            l1 = p;
        }
        return head.next;
    }

    @Override
    public ListNode mergeList(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        head.next = l1;
        while(l1.next !=null){
            l1 = l1.next;
        }
        /**
         * 链表的最后一个元素：l1
         */
        l1.next = l2;
        return head.next;
    }
}
