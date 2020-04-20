package com.lh.learning.leetcode.no21;

import com.lh.learning.leetcode.util.ListNode;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2020/4/20
 * @description:
 */
public class Question21Test {
    private static Question21 question21;

    @BeforeClass
    public static void beforeClass() {
        question21 = new Question21();
    }

    @Test
    public void test() {
        ListNode l1 = ListNode.init(new int[]{1, 2, 4});
        ListNode l2 = ListNode.init(new int[]{1, 3, 4});
        ListNode result = question21.mergeTwoLists(l1, l2);
        Assert.assertEquals(result.toString(), "1->1->2->3->4->4");
    }
}
