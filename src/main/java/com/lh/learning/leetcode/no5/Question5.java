package com.lh.learning.leetcode.no5;

/**
 * 5. 最长回文子串
 * <p>
 * Created by loneyfall on 2019/5/24.
 */
public class Question5 {

    public String longestPalindrome(String s) {
        Item target = null;
        int len = -1;
        if (s == null || s.length() == 0) {
            return "";
        }
        char[] schar = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            Item item = new Item();
            item.setIndex(i);
            if (i + 1 < s.length() && schar[i] == schar[i + 1]) {
                item.setDouble(true);
            }
            item.setExtend(extend(item, schar));
            if (item.isDouble()) {
                item.setExtendDouble(extendDouble(item, schar));
            }
            if (item.maxExtend() > len) {
                target = item;
                len = item.maxExtend();
            }
        }
        if (target == null) {
            return "";
        }
        return target.toStringValue(s);
    }

    private int extend(Item item, char[] schar) {
        int result = 0;
        for (int i = 1; item.getIndex() - i >= 0 && item.getIndex() + i < schar.length; i++) {
            if (schar[item.getIndex() - i] != schar[item.getIndex() + i]) {
                result = i - 1;
                break;
            } else {
                result = i;
            }
        }
        return result;
    }

    private int extendDouble(Item item, char[] schar) {
        int result = 0;
        for (int i = 1; item.getIndex() - i >= 0 && item.getIndex() + i + 1 < schar.length; i++) {
            if (schar[item.getIndex() - i] != schar[item.getIndex() + i + 1]) {
                result = i - 1;
                break;
            } else {
                result = i;
            }
        }
        return result;
    }

    private class Item {
        private int index = -1;
        private boolean isDouble = false;
        private int extend = 0;
        private int extendDouble = 0;

        public int maxExtend() {
            return isDouble && (extendDouble * 2 + 2) > (extend * 2 + 1) ? extendDouble * 2 + 2 : extend * 2 + 1;
        }

        public String toStringValue(String s) {
            String result = "";
            if (isDouble && (extendDouble * 2 + 2) > (extend * 2 + 1)) {
                result = s.substring(this.index - extendDouble, this.index + extendDouble + 2);
            } else {
                result = s.substring(this.index - extend, this.index + extend + 1);
            }
            return result;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public boolean isDouble() {
            return isDouble;
        }

        public void setDouble(boolean aDouble) {
            isDouble = aDouble;
        }

        public int getExtend() {
            return extend;
        }

        public void setExtend(int extend) {
            this.extend = extend;
        }

        public int getExtendDouble() {
            return extendDouble;
        }

        public void setExtendDouble(int extendDouble) {
            this.extendDouble = extendDouble;
        }
    }
}
