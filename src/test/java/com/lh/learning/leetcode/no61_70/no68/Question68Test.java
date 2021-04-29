package com.lh.learning.leetcode.no61_70.no68;

import com.alibaba.fastjson.JSON;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * @auther: loneyfall
 * @date: 2021/4/19
 * @description:
 */
public class Question68Test {
    private static Question68 question68;

    @BeforeClass
    public static void beforeClass() {
        question68 = new Question68();
    }

    @Test
    public void test() {
        List<String> result1 = question68.fullJustify(new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16);
        System.out.println(JSON.toJSONString(result1));

        List<String> result2 = question68.fullJustify(new String[]{"What", "must", "be", "acknowledgment", "shall", "be"}, 16);
        System.out.println(JSON.toJSONString(result2));

        List<String> result3 = question68.fullJustify(new String[]{"Science", "is", "what", "we", "understand", "well", "enough", "to", "explain",
                "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"}, 20);
        System.out.println(JSON.toJSONString(result3));
    }
}
