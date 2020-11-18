package com.lh.learning.leetcode.no31_40.no37;

import com.alibaba.fastjson.JSON;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @auther: loneyfall
 * @date: 2020/7/31
 * @description:
 */
public class Question37Test {
    private static Question37 question37;

    @BeforeClass
    public static void beforeClass() {
        question37 = new Question37();
    }

    @Test
    public void test() {
//        char[][] board = new char[][]{
//                {'5', '3', '.', '.', '7', '.', '.', '.', '.'}, {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, {
//                '.', '9', '8', '.', '.', '.', '.', '6', '.'}, {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, {
//                '4', '.', '.', '8', '.', '3', '.', '.', '1'}, {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, {
//                '.', '6', '.', '.', '.', '.', '2', '8', '.'}, {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, {
//                '.', '.', '.', '.', '8', '.', '.', '7', '9'}
//        };
//        question37.solveSudoku(board);
//        System.out.println(JSON.toJSONString(board));

        char[][] board2 = new char[][]{{'.', '.', '9', '7', '4', '8', '.', '.', '.'}, {'7', '.', '.', '.', '.', '.', '.', '.', '.'}, {
                '.', '2', '.', '1', '.', '9', '.', '.', '.'}, {'.', '.', '7', '.', '.', '.', '2', '4', '.'}, {
                '.', '6', '4', '.', '1', '.', '5', '9', '.'}, {'.', '9', '8', '.', '.', '.', '3', '.', '.'}, {
                '.', '.', '.', '8', '.', '3', '.', '2', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.', '6'}, {
                '.', '.', '.', '2', '7', '5', '9', '.', '.'}};
        question37.solveSudoku(board2);
        System.out.println(JSON.toJSONString(board2));
    }
}
