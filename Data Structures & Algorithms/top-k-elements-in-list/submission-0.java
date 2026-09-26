class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0 ; i < n ; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        //So sánh bằng values
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for(int key : map.keySet()) { // keySet() retrieves all the keys in the map.
            heap.add(key);
            if(heap.size() > k) {heap.poll();}
        }

        int[] res = new int[k];
        int i = k - 1;  
        while(!heap.isEmpty()) {
            res[i] = heap.poll();
            i--;
        }

        return res;
    }
}
