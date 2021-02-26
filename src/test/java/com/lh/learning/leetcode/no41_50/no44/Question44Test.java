package com.lh.learning.leetcode.no41_50.no44;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2021/1/14
 * @description:
 */
public class Question44Test {
    private static Question44 question44;

    @BeforeClass
    public static void beforeClass() {
        question44 = new Question44();
    }

    @Test
    public void test() {
        Assert.assertFalse(question44.isMatch("aa", "a"));
        Assert.assertTrue(question44.isMatch("aa", "*"));
        Assert.assertFalse(question44.isMatch("cb", "?a"));
        Assert.assertTrue(question44.isMatch("adceb", "*a*b"));
        Assert.assertFalse(question44.isMatch("acdcb", "a*c?b"));
        Assert.assertTrue(question44.isMatch("", "******"));
        Assert.assertTrue(question44.isMatch("aaa", "******"));
        Assert.assertTrue(question44.isMatch("aaaaaaaaa", "******"));
        Assert.assertFalse(question44.isMatch("aaabbbaabaaaaababaabaaabbabbbbbbbbaabababbabbbaaaaba", "a*******b"));
        Assert.assertFalse(question44.isMatch("aaabbbaabaaaaababaabaaabbabbbbbbbbaabababbabbbaaaaba", "a*****??b"));
        Assert.assertTrue(question44.isMatch("aaabbbaabaaaaababaabaaabbabbbbbbbbaabababbabbbaaaaba", "a*****??ba"));
        Assert.assertFalse(question44.isMatch("aababababa", "a*****?????????ba"));
        Assert.assertFalse(question44.isMatch("abbabaaabbabbaababbabbbbbabbbabbbabaaaaababababbbabababaabbababaabbbbbbaaaabababbbaabbbbaabbbbababababbaabbaababaabbbababababbbbaaabbbbbabaaaabbababbbbaababaabbababbbbbababbbabaaaaaaaabbbbbaabaaababaaaabb", "*aa*ba*a*bb*aa*ab*a*aaaaaa*a*aaaa*bbabb*b*b*aaaaaaaaa*a*ba*bbb*a*ba*bb*bb*a*b*bb"));
    }
}
