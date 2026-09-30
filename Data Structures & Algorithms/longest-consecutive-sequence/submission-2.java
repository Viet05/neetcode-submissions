class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;
        
        for (int num : nums) {
            /**
                Check xem num có phải số bắt đầu chuỗi không
                Nếu không thì trong set không tồn tại num - 1, có thì ngược lại.
                Độ dài là 1.
            */
            if(!set.contains(num - 1)) {
                int length = 1;
                /**
                    Sau khi check num đã là số bắt đầu chuỗi.
                    Check num + 1 có tồn tại trong set không.
                    Nếu có thì độ dài chuỗi sẽ tăng vì đếm chuỗi tăng dài nhất. 
                */
                while(set.contains(num + length)) {
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}
