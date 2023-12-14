class Solution {
    public static int strStr(String haystack, String needle) {
        int i, j, index=-1;
        for (i = 0; i < needle.length(); i++) {
            for (j = 0; j < haystack.length(); j++) {
                if (needle.charAt(i) == haystack.charAt(j)) {
                    index = j;
                    int k;
                    for (k = index + 1; k < needle.length(); k++) {
                        i++;
                        j++;
                        if (needle.charAt(i) == needle.charAt(j)) {
                        }
                        else
                            index=-1;
                    }
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        String needle,haystack;
        haystack = "sadbutsad";
        needle = "sad";
        if(strStr(haystack, needle) == -1)
            System.out.println("Substring not found");
        else System.out.println("Substring found at index "+(strStr(haystack,needle)+1));

    }

}