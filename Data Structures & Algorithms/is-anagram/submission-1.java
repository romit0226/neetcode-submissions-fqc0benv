class Solution {
    public boolean isAnagram(String s, String t) {
       
       // use 26 length array is all letter are lowercase

        if (s.length() != t.length()) return false;

    int[] count = new int[52];

    for (int i = 0; i < s.length(); i++) {
        count[getIndex(s.charAt(i))]++;
        count[getIndex(t.charAt(i))]--;
    }

    for (int c : count) {
        if (c != 0) return false;
    }

    return true;

    }

    private int getIndex(char c) {
    if (c >= 'a' && c <= 'z') {
        return c - 'a';
    } else { // uppercase
        return c - 'A' + 26;
    }
    }
}
