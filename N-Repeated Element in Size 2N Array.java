class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for(int i : nums) {
            hashmap.put(i, hashmap.getOrDefault(i, 0) + 1);
            if(hashmap.get(i) > 1) return i;
        }
        throw null; // Given constraints guarantee a solution
    }
}
