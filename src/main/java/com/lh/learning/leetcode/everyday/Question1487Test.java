package com.lh.learning.leetcode.everyday;


import com.alibaba.fastjson.JSON;

/**
 * 保证文件名唯一
 */
public class Question1487Test {

    public static void main(String[] args) {
        Question1487 question = new Question1487();
        test1(question);
        test2(question);
        test3(question);
        test4(question);
        test5(question);
    }

    private static void test1(Question1487 question) {
        String[] param = new String[]{"gta", "gta(1)", "gta", "avalon"};
        param = question.getFolderNames(param);
        System.out.println(JSON.toJSON(param));
    }

    private static void test2(Question1487 question) {
        String[] param = new String[]{"pes", "fifa", "gta", "pes(2019)"};
        param = question.getFolderNames(param);
        System.out.println(JSON.toJSON(param));
    }

    private static void test3(Question1487 question) {
        String[] param = new String[]{"onepiece", "onepiece(1)", "onepiece(2)", "onepiece(3)", "onepiece"};
        param = question.getFolderNames(param);
        System.out.println(JSON.toJSON(param));
    }

    private static void test4(Question1487 question) {
        String[] param = new String[]{"wano", "wano", "wano", "wano"};
        param = question.getFolderNames(param);
        System.out.println(JSON.toJSON(param));
    }

    private static void test5(Question1487 question) {
        String[] param = new String[]{"kaido", "kaido(1)", "kaido", "kaido(1)"};
        param = question.getFolderNames(param);
        System.out.println(JSON.toJSON(param));
    }

}
