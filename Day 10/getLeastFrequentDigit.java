class Solution {
    public int getLeastFrequentDigit(int n) {
        int temp = n;
        Map<Integer, Integer> map = new HashMap<>();
        while(n > 0){
            map.put(n%10, map.getOrDefault(n%10, 0)+1);
            n /= 10;
        }
        // System.out.println(map);
        
        n = temp;
        
        int minValue = Integer.MAX_VALUE;
        int minCount = Integer.MAX_VALUE;
        int count = 0;
        while(n>0){
            count = map.get(n%10);
            minCount = Math.min(minCount, count);
            n/=10;
        }

        for(Map.Entry<Integer, Integer> mp : map.entrySet()){
            if(minCount == mp.getValue()){
                minValue = Math.min(minValue, mp.getKey());
            }
        }

        return minValue;
        
    }
}©leetcode
