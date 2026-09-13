class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int result[]=new int[k];
       for(int num:nums)
       {
        map.put(num,map.getOrDefault(num,0)+1);
       }
       PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->Integer.compare(a.getValue(),b.getValue()));
       for(Map.Entry<Integer,Integer> entry:map.entrySet())
       {
            pq.offer(entry);
            if(pq.size()>k)
                pq.poll();       
        }
        int i=0;
        while(pq.size()!=0)
        {
            Map.Entry<Integer,Integer> entry=pq.poll();
            result[i]=entry.getKey();
            i++;
        }
        return result;
    }
}