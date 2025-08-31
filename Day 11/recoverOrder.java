class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        List<Integer> list = new ArrayList<>();

for (int f : friends) {
    list.add(f); 
}
        int[] ans = new int[friends.length];
        int index = 0;
        for(int i=0; i<order.length; i++){
            if(list.contains(order[i])){
                ans[index++] = order[i];
            }
        }
        return ans;

    }
}
