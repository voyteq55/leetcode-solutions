class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder currentStr = new StringBuilder();
        int i = 0;
        while (i / 2 < word1.length() && i / 2 < word2.length()) {
            String currentWord = i % 2 == 0 ? word1 : word2;
            currentStr.append(currentWord.charAt(i / 2));
            i++;
        }
        
        if (i / 2 < word1.length()) {
            currentStr.append(word1.substring(i / 2, word1.length()));
        }
        if (i / 2 < word2.length()) {
            currentStr.append(word2.substring(i / 2, word2.length()));
        }
        return currentStr.toString();
    }
}
