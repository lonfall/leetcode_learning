package com.lh.learning.leetcode.no11_20.no19;

import com.lh.learning.leetcode.util.ListNode;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2020/4/20
 * @description:
 */
public class Question19Test {
    private static Question19 question19;

    @BeforeClass
    public static void beforeClass() {
        question19 = new Question19();
    }

    @Test
    public void test() {
        ListNode head = ListNode.init(5);
        ListNode result = question19.removeNthFromEnd(head, 2);
        System.out.println(result);
        Assert.assertEquals(result.toString(), "1->2->3->5");
    }
}
