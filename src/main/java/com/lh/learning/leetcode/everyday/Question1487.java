package com.lh.learning.leetcode.everyday;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 保证文件名唯一
 * <p>
 * todo 未实现xxx(1)转为xxx(1)(1)
 */
public class Question1487 {

    public String[] getFolderNames(String[] names) {
        Map<String, Number> map = new HashMap<String, Number>();
        Pattern compile = Pattern.compile("(.*)\\((\\d+)\\)");
        for (int i = 0, namesLength = names.length; i < namesLength; i++) {
            String name = names[i];
            Matcher matcher = compile.matcher(name);
            if (matcher.find()) {
                String n1 = matcher.group(1);
                if (map.containsKey(n1)) {
                    Number num = map.get(n1);
                    String n2 = matcher.group(2);
                    if (Integer.valueOf(n2) <= num.index) {
                        n2 = String.valueOf(num.index + 1);
                    }
                    while (num.numbers.contains(n2)) {
                        n2 = String.valueOf(Integer.valueOf(n2) + 1);
                    }
                    num.numbers.add(n2);
                    names[i] = n1 + "(" + n2 + ")";
                    while (num.numbers.contains(String.valueOf(num.index + 1))) {
                        num.index += 1;
                    }
                } else {
                    Number num = new Number();
                    num.numbers.add(matcher.group(2));
                    while (num.numbers.contains(String.valueOf(num.index + 1))) {
                        num.index += 1;
                    }
                    map.put(n1, num);
                }
            } else {
                if (map.containsKey(name)) {
                    Number num = map.get(name);
                    String n2 = "0";
                    while (num.numbers.contains(n2)) {
                        n2 = String.valueOf(Integer.valueOf(n2) + 1);
                    }
                    num.numbers.add(n2);
                    names[i] = name + "(" + n2 + ")";
                    while (num.numbers.contains(String.valueOf(num.index + 1))) {
                        num.index += 1;
                    }
                } else {
                    Number num = new Number();
                    num.numbers.add("0");
                    map.put(name, num);
                }
            }
        }
        return names;
    }

    private static class Number {
        public int index;
        public Set<String> numbers;

        public Number() {
            this.index = 0;
            this.numbers = new HashSet();
        }
    }
}
