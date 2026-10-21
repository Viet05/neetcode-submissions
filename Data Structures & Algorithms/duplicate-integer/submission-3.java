class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> check = new HashSet<>();

        for (int i : nums) {
            if (check.contains(i)) {
                return true;
            }
            check.add(i);
        }

        return false;
    }
}