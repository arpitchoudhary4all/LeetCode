/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.
*/

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i : nums) {
          hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        for (int i : nums) {
          if (hm.get(i) == 1) {
            return i;
          }
        }
        return 0;
    }
}
