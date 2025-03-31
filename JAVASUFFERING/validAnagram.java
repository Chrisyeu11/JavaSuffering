//using Array sorting then comparing.
class Solution {
    public boolean isAnagram(String s, String t) {
        // Step 1: Check if lengths are different
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Convert to char arrays and sort using fully qualified class name
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        // Sort both arrays using fully qualified class name
        java.util.Arrays.sort(sArray);
        java.util.Arrays.sort(tArray);

        // Step 3: Compare sorted arrays using fully qualified class name
        return java.util.Arrays.equals(sArray, tArray);
    }
}


//using hashmap
class Solution {
    public boolean isAnagram(String s, String t) {
        // Step 1: Check if lengths are different
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Create frequency maps
        java.util.HashMap<Character, Integer> countS = new HashMap<>();
        java.util.HashMap<Character, Integer> countT = new HashMap<>();

        // Step 3: Count frequencies of characters in both strings
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            countS.put(charS, countS.getOrDefault(charS, 0) + 1);
            countT.put(charT, countT.getOrDefault(charT, 0) + 1);
        }

        // Step 4: Compare frequency maps
        return countS.equals(countT);
    }
}
