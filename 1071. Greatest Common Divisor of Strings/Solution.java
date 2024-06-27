class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (str2.length() > str1.length()) {
            String tmp = str1;
            str1 = str2;
            str2 = tmp;
        }
        for (int i = 1; i <= str2.length() / 2 + 1; i++) {
            int len = str2.length() / i;
            String potentialDivisor = str2.substring(0, len);
            if (divides(str1, potentialDivisor) && divides(str2, potentialDivisor)) {
                return potentialDivisor;
            }
        }
        return "";
    }

    private boolean divides(String str1, String str2) {
        if (str1.length() % str2.length() != 0) {
            return false;
        }
        int i = 0;
        while (i < str1.length()) {
            if (!str1.substring(i, i + str2.length()).equals(str2)) {
                return false;
            }
            i += str2.length();
        }
        return true;
    }
}