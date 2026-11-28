class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Queue<Integer> heap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for(int key : map.keySet()) {
            heap.add(key);
            if(heap.size() > k) heap.poll();
        }
        int[] res = new int[k];
        int i = k - 1;
        while(!heap.isEmpty()){
            res[i] = heap.poll();
            i--;
        }
        return res;
    }
}
