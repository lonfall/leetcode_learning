package com.lh.learning.leetcode.no30;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2020/7/14
 * @description:
 */
public class Question30Test {
    private static Question30 question30;

    @BeforeClass
    public static void beforeClass() {
        question30 = new Question30();
    }

    @Test
    public void test() {
        System.out.println(question30.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"}));
        System.out.println(question30.findSubstring("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "word"}));
        System.out.println(question30.findSubstring("barfoofoobarthefoobarman", new String[]{"bar", "foo", "the"}));
    }
}
