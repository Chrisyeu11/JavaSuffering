//bruteforce
class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < n - 1; i++){
            for(int j = i+1; j < n; j++){
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        } 
        return false;

    }
}


//HashSet
class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Use fully qualified class name without import
        java.util.HashSet<Integer> seen = new java.util.HashSet<>();

        // Iterate through the array
        for (int num : nums) {
            // Check if num is already in the set
            if (seen.contains(num)) {
                return true; // Duplicate found
            }
            // Add num to the set
            seen.add(num);
        }
        
        // No duplicates found
        return false;
    }
}

//Hashmap
class Solution {
    public boolean hasDuplicate(int[] nums) {
        java.util.HashMap<Integer, Boolean> seen = new HashMap<>();

        // Iterate through the array
        for (int num : nums) {
            if (seen.containsKey(num)) {
                return true; // Duplicate found
            }
            // Add num to the map
            seen.put(num, true);
        }

        // No duplicates found
        return false;
    }
}
