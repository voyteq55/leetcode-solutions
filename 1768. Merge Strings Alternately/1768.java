class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder currentStr = new StringBuilder();
        int i = 0;
        while (i < word1.length() && i < word2.length()) {
            currentStr.append(word1.charAt(i));
            currentStr.append(word2.charAt(i));
            i++;
        }
        if (i < word1.length()) {
            currentStr.append(word1.substring(i));
        }
        if (i < word2.length()) {
            currentStr.append(word2.substring(i));
        }
        return currentStr.toString();
    }
}
